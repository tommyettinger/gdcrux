package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.github.tommyettinger.crux.PointN;

import java.util.Iterator;
import java.util.Random;

/**
 * Groups functionality common to points with float components, in any dimension.
 * @param <P> should be the subclassing type itself
 * @param <R> should be a wildcard-generic type for a sub-interface of {@link PointN}, such as {@code Point3<?>}
 */
public interface PointFShared<P extends PointFShared<P, R>, R extends PointN<?>> extends PointN<P>, Iterable<Float> {
    @Override
    default boolean floatingPoint() {
        return true;
    }

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    float get (int index);

    /**
     * Sets the component at the specified index to the specified value.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    P setAt(int index, float value);

    /**
     * Iterates over the components in this PointFShared using {@link #get(int)}.
     */
    class PointFSharedIterator implements Iterator<Float> {
        public PointFShared<?,?> pt;
        public int index;
        public PointFSharedIterator(PointFShared<?,?> pt){
            this.pt = pt;
            index = 0;
        }

        @Override
        public Float next() {
            return nextFloat();
        }
        
        public float nextFloat() {
            return pt.get(index++);
        }

        @Override
        public boolean hasNext() {
            return index < pt.rank();
        }

        public void reset(){
            index = 0;
        }
    }

    /**
     * Returns an iterator over boxed Float elements, or primitive float elements if you call
     * {@link PointFSharedIterator#nextFloat()}.
     *
     * @return a {@link PointFSharedIterator}; the default implementation allocates one every time this is called
     */
    @Override
    default PointFSharedIterator iterator() {
        return new PointFSharedIterator(this);
    }

    /**
     * Sets this PointFShared to a randomly chosen unit vector.
     * The exact algorithm is expected to vary between dimensions.
     * In 2D, for instance, it is sufficient to get a random float 0-360 and call
     * {@link MathUtils#cosDeg(float)} and {@link MathUtils#sinDeg(float)}
     * to get x and y. In higher dimensions, this gets more complex. The default
     * solution, which works for any dimension, but is only the best option for
     * 4D and up, is to assign to each component a normal-distributed float
     * (you could use {@link Random#nextGaussian()} cast to float, or
     * {@link Distributor#probitI(int)} with a random int for input),
     * then normalize the PointFShared with {@link #nor()}.
     * @param random any Random or subclass thereof, such as one from juniper
     * @return this point after modifications, if possible, or a new PointFShared if this is immutable
     */
    default P setToRandomDirection(Random random){
        for (int d = 0, rank = rank(); d < rank; d++) {
            setAt(d, Distributor.probitI(random.nextInt()));
        }
        return nor();
    }

    /**
     * Linear-interpolates from this point toward target, moving a distance proportional to alpha and changing this
     * point in-place if possible. If this point is not {@link #mutable()}, this will return a new or pooled point.
     * The alpha is expected to be in the 0 to 1 range, inclusive.
     * @param target any point with the same dimension to move toward
     * @param alpha between 0 and 1, inclusive
     * @return this point after modifications, if possible, or a new PointFShared if this is immutable
     */
    P lerp(R target, float alpha);

    /**
     * Calls {@link #lerp(PointN, float)} with the alpha determined by the given {@code interpolation}.
     * Simply returns {@code lerp(target, interpolation.apply(alpha))} .
     * @param target any point with the same dimension to move toward
     * @param alpha between 0 and 1, inclusive
     * @param interpolation an Interpolation from libGDX, such as {@link Interpolation#smooth}
     * @return this point after modifications, if possible, or a new PointFShared if this is immutable
     */
    default P interpolate(R target, float alpha, Interpolation interpolation) {
        return lerp(target, interpolation.apply(alpha));
    }

    /**
     * A geometric "slerp" (spherical linear interpolation) from the input n-dimensional float point {@code start} to
     * the point {@code end} with the same type, moving a fraction of the distance equal to {@code alpha}, and placing
     * the result in {@code output} (modifying it in-place). Unlike most slerp() implementations, this works for any
     * PointFShared type, including 2D points on a unit circle and 4D, 5D, etc. points on hyperspheres. This does not
     * allocate. This has undefined behavior if start and end are polar opposites; that is, points where for any
     * coordinate {@code a} in start, that coordinate in end is {@code -a} or any positive linear scale of the point
     * where that is true. This degenerates to a linear interpolation if either start or end is the origin, and simply
     * returns the start if both are the origin. Otherwise, this can smoothly move points that aren't already on the
     * unit sphere towards the distance of the other point from the origin.
     * <br>
     * Based on the non-approximation code from
     * <a href="https://observablehq.com/@mourner/approximating-geometric-slerp">an article by Volodymyr Agafonkin</a>.
     * Note that this is the "geometric slerp" rather than the version using quaternions in 3D (or rotors in other
     * dimensions). It has been augmented slightly to handle start and end vectors that don't have unit length.
     *
     * @param start an n-dimensional float point to rotate from; will not be modified
     * @param end another n-dimensional float point to rotate to; will not be modified
     * @param alpha between 0 and 1, inclusive; how much to travel from start towards end
     * @param output will be modified in-place so this is set to the result
     * @return output, after modifications.
     */
    static <P extends PointFShared<P, ?>> P slerpGeometric(P start, P end, float alpha, P output) {
        final int n = start.rank();
        float magS = 0f, magE = 0f;
        for (int i = 0; i < n; i++) {
            magS += start.get(i) * start.get(i);
            magE += end.get(i) * end.get(i);
        }
        // if both start and end are the origin
        if(MathUtils.isZero(magS + magE)) {
            output.set(start);
        }
        // if only the start is the origin
        else if(MathUtils.isZero(magS)){
            for (int i = 0; i < n; i++) {
                output.setAt(i, end.get(i) * alpha);
            }
        }
        // if only the end is the origin
        else if(MathUtils.isZero(magE)){
            for (int i = 0; i < n; i++) {
                output.setAt(i, start.get(i) * (1f - alpha));
            }
        }
        else {
            magS = (float) Math.sqrt(magS);
            magE = (float) Math.sqrt(magE);

            float k = 0, invDistance = 1f / (magS * (1f - alpha) + magE * alpha);
            for (int i = 0; i < n; i++) {
                k += (start.get(i) / magS) * (end.get(i) / magE);
            }
            k = MathUtils.acos(k);
            float s = MathUtils.sin(k * (1f - alpha));
            float e = MathUtils.sin(k * alpha);

            for (int i = 0; i < n; i++) {
                output.setAt(i, (start.get(i) * s + end.get(i) * e) * invDistance);
            }
        }
        return output;
    }

}
