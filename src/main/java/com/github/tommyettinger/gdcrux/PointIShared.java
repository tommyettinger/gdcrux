package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.Interpolation;
import com.github.tommyettinger.crux.PointN;

import java.util.Iterator;

/**
 * Groups functionality common to points with int components, in any dimension.
 * @param <P> should be the subclassing type itself
 * @param <R> should be a wildcard-generic type for a sub-interface of {@link PointN}, such as {@code Point3<?>}
 */
public interface PointIShared<P extends PointIShared<P, R>, R extends PointN<?>> extends PointN<P>, Iterable<Integer> {
    @Override
    default boolean floatingPoint() {
        return false;
    }

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    int get (int index);

    /**
     * Sets the component at the specified index to the specified value.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    P setAt(int index, int value);

    /**
     * Iterates over the components in this PointIShared using {@link #get(int)}.
     */
    class PointISharedIterator implements Iterator<Integer> {
        public PointIShared<?, ?> pt;
        public int index;
        public PointISharedIterator(PointIShared<?, ?> pt){
            this.pt = pt;
            index = 0;
        }

        @Override
        public Integer next() {
            return nextInt();
        }

        public int nextInt() {
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
     * Returns an iterator over boxed Integer elements, or primitive int elements if you call
     * {@link PointISharedIterator#nextInt()}.
     *
     * @return a {@link PointISharedIterator}; the default implementation allocates one every time this is called
     */
    @Override
    default PointISharedIterator iterator() {
        return new PointISharedIterator(this);
    }

    /**
     * Linear-interpolates from this point toward target, moving a distance proportional to alpha and changing this
     * point in-place if possible. If this point is not {@link #mutable()}, this will return a new or pooled point.
     * The alpha is expected to be in the 0 to 1 range, inclusive.
     * @param target any point with the same dimension to move toward
     * @param alpha between 0 and 1, inclusive
     * @return this point after modifications, if possible, or a new PointIShared if this is immutable
     */
    P lerp(R target, float alpha);

    /**
     * Calls {@link #lerp(PointN, float)} with the alpha determined by the given {@code interpolation}.
     * Simply returns {@code lerp(target, interpolation.apply(alpha))} .
     * @param target any point with the same dimension to move toward
     * @param alpha between 0 and 1, inclusive
     * @param interpolation an Interpolation from libGDX, such as {@link Interpolation#smooth}
     * @return this point after modifications, if possible, or a new PointIShared if this is immutable
     */
    default P interpolate(R target, float alpha, Interpolation interpolation) {
        return lerp(target, interpolation.apply(alpha));
    }
}
