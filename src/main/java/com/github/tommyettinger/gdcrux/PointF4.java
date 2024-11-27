package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.NumberUtils;
import com.github.tommyettinger.crux.Point4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Random;

/**
 * The same as {@link Vector4}, just implementing {@link Point4}, {@link Json.Serializable},
 * and {@link Externalizable}. This does have some more additions to those interfaces, such as
 * {@link #get(int)} and {@link #setAt(int, float)}.
 */
public class PointF4 extends Vector4 implements Point4<PointF4>, PointFShared<PointF4, Point4<?>>, Json.Serializable {

    public PointF4() {
        super();
    }

    public PointF4(float x, float y, float z, float w) {
        super(x, y, z, w);
    }

    public PointF4(Vector4 p) {
        super(p);
    }

    public PointF4(PointF4 p) {
        super(p);
    }

    public PointF4(Point4<? extends Point4<?>> p) {
        this(p.x(), p.y(), p.z(), p.w());
    }

    public PointF4(float[] values) {
        super(values);
    }

    public PointF4(Vector2 vector, float z, float w) {
        super(vector, z, w);
    }

    public PointF4(Vector3 vector, float w) {
        super(vector, w);
    }


    /**
     * Returns true if this type of point uses {@code float} or {@code double} for its components, or false otherwise.
     * This always returns true.
     *
     * @return true
     */
    @Override
    public boolean floatingPoint() {
        return true;
    }

    @Override
    public PointF4 cpy() {
        return new PointF4(this);
    }

    @Override
    public PointF4 set(PointF4 point) {
        super.set(point);
        return this;
    }

    @Override
    public PointF4 sub(PointF4 point) {
        super.sub(point);
        return this;
    }

    @Override
    public PointF4 add(PointF4 point) {
        super.add(point);
        return this;
    }

    @Override
    public PointF4 scl(PointF4 point) {
        super.scl(point);
        return this;
    }

    @Override
    public float dst(PointF4 point) {
        return super.dst(point);
    }

    @Override
    public float dst2(PointF4 point) {
        return super.dst2(point);
    }

    @Override
    public PointF4 setZero() {
        super.setZero();
        return this;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointF4 x(float next) {
        x = next;
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointF4 y(float next) {
        y = next;
        return this;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public PointF4 z(float next) {
        z = next;
        return this;
    }

    @Override
    public float w() {
        return w;
    }

    @Override
    public PointF4 w(float next) {
        w = next;
        return this;
    }

    public PointF4 set(float x, float y, float z, float w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }

    @Override
    public PointF4 set(Vector4 vector) {
        super.set(vector);
        return this;
    }

    @Override
    public PointF4 set(float[] values) {
        super.set(values);
        return this;
    }

    @Override
    public PointF4 set(Vector2 vector, float z, float w) {
        super.set(vector, z, w);
        return this;
    }

    @Override
    public PointF4 set(Vector3 vector, float w) {
        super.set(vector, w);
        return this;
    }

    @Override
    public PointF4 add(Vector4 vector) {
        super.add(vector);
        return this;
    }

    @Override
    public PointF4 add(float x, float y, float z, float w) {
        super.add(x, y, z, w);
        return this;
    }

    @Override
    public PointF4 plus(float value) {
        super.add(value);
        return this;
    }

    @Override
    public PointF4 sub(Vector4 vec) {
        super.sub(vec);
        return this;
    }

    @Override
    public PointF4 sub(float x, float y, float z, float w) {
        super.sub(x, y, z, w);
        return this;
    }

    @Override
    public PointF4 minus(float value) {
        super.sub(value);
        return this;
    }

    @Override
    public PointF4 times(float scalar) {
        super.scl(scalar);
        return this;
    }

    @Override
    public PointF4 scl(Vector4 other) {
        super.scl(other);
        return this;
    }

    @Override
    public PointF4 scl(float vx, float vy, float vz, float vw) {
        super.scl(vx, vy, vz, vw);
        return this;
    }

    /**
     * Multiplies each component of this by the given scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float)}.
     * @param scalar a float that will be multiplied with each component
     * @return this, for chaining
     */
    public PointF4 mul(float scalar) {
        super.scl(scalar);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float, float, float, float)}.
     * @param x a float that will be multiplied with x
     * @param y a float that will be multiplied with y
     * @param z a float that will be multiplied with z
     * @param w a float that will be multiplied with w
     * @return this, for chaining
     */
    public PointF4 mul(float x, float y, float z, float w) {
        super.scl(x, y, z, w);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding item in {@code vec}, in-place, and returns this.
     * This is an alias for {@link #scl(Vector4)}.
     * @param vec a Vector4 (which can be another PointF4) that will be multiplied component-wise with this
     * @return this, for chaining
     */
    public PointF4 mul(Vector4 vec) {
        super.scl(vec);
        return this;
    }

    @Override
    public PointF4 mulAdd(Vector4 vec, float scalar) {
        super.mulAdd(vec, scalar);
        return this;
    }

    @Override
    public PointF4 mulAdd(Vector4 vec, Vector4 mulVec) {
        super.mulAdd(vec, mulVec);
        return this;
    }

    @Override
    public PointF4 nor() {
        super.nor();
        return this;
    }

    @Override
    public PointF4 lerp(Vector4 target, float alpha) {
        super.lerp(target, alpha);
        return this;
    }

    public PointF4 lerp(Point4<?> target, float alpha) {
        final float invAlpha = 1.0f - alpha;
        this.x = (x * invAlpha) + (target.x() * alpha);
        this.y = (y * invAlpha) + (target.y() * alpha);
        this.z = (z * invAlpha) + (target.z() * alpha);
        this.w = (w * invAlpha) + (target.w() * alpha);
        return this;
    }
    @Override
    public PointF4 interpolate(Vector4 target, float alpha, Interpolation interpolator) {
        super.interpolate(target, alpha, interpolator);
        return this;
    }

    public PointF4 slerpGeometric(PointF4 target, float alpha) {
        return PointFShared.slerpGeometric(this, target, alpha, this);
    }

    @Override
    public PointF4 limit(float limit) {
        super.limit(limit);
        return this;
    }

    @Override
    public PointF4 limit2(float limit2) {
        super.limit2(limit2);
        return this;
    }

    @Override
    public PointF4 setLength(float len) {
        super.setLength(len);
        return this;
    }

    @Override
    public PointF4 setLength2(float len2) {
        super.setLength2(len2);
        return this;
    }

    @Override
    public PointF4 clamp(float min, float max) {
        super.clamp(min, max);
        return this;
    }

    /**
     * For each component, this clamps it between min and max, inclusive.
     * @param min the minimum value allowable for any component, inclusive
     * @param max the maximum value allowable for any component, inclusive
     * @return this, after modifications
     */
    public PointF4 clampEach (float min, float max) {
        x = Math.min(Math.max(x, min), max);
        y = Math.min(Math.max(y, min), max);
        z = Math.min(Math.max(z, min), max);
        w = Math.min(Math.max(w, min), max);
        return this;
    }

    /**
     * Sets each component so it only has a fractional value, by subtracting the floor from each component.
     * This produces a non-negative float for each component, between 0.0 inclusive and 1.0 exclusive, unless a
     * component is outside the safe range for {@link MathUtils#floor(float)} (-16384.0 at the lowest).
     * <pre>
     * The result of fract() for a component with a value of  1.25 will be 0.25 .
     * The result of fract() for a component with a value of -1.25 will be 0.75 .
     * </pre>
     *
     * @return this, after modifications
     */
    public PointF4 fract () {
        x -= MathUtils.floor(x);
        y -= MathUtils.floor(y);
        z -= MathUtils.floor(z);
        w -= MathUtils.floor(w);
        return this;
    }

    @Override
    public PointF4 setToRandomDirection() {
        return setToRandomDirection(MathUtils.random);
    }

    public PointF4 setToRandomDirection(Random random) {
        return set(
                Distributor.probitI(random.nextInt()),
                Distributor.probitI(random.nextInt()),
                Distributor.probitI(random.nextInt()),
                Distributor.probitI(random.nextInt())).nor();
    }

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    @SuppressWarnings("DefaultNotLastCaseInSwitch")
    public float get (int index) {
        switch (index){
            default: return x;
            case 1 : return y;
            case 2 : return z;
            case 3 : return w;
        }
    }

    /**
     * Sets the component at the specified index to the specified value.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    @SuppressWarnings("DefaultNotLastCaseInSwitch")
    public PointF4 setAt(int index, float value){
        switch (index){
            default: x = value;
            case 1 : y = value;
            case 2 : z = value;
            case 3 : w = value;
        }
        return this;
    }

    @Override
    public int hashCode() {
        final int h = NumberUtils.floatToIntBits(x) + 53 * NumberUtils.floatToIntBits(y) + 113 * NumberUtils.floatToIntBits(z) + 151 * NumberUtils.floatToIntBits(w);
        return h ^ h >>> 16;
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, float.class);
        json.writeValue("y", y, float.class);
        json.writeValue("z", z, float.class);
        json.writeValue("w", w, float.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getFloat("x");
        this.y = jsonData.getFloat("y");
        this.z = jsonData.getFloat("z");
        this.w = jsonData.getFloat("w");
    }

    /** Converts this {@code PointF4} to a string in the format {@code (x,y,z,w)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + "," + w + ")";
    }

    /** Sets this {@code PointF4} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointF4 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        int s1 = s.indexOf(',', s0 + 1);
        int s2 = s.indexOf(',', s1 + 1);
        if (s0 != -1 && s1 != -1  && s2 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
                float x = Float.parseFloat(s.substring(1, s0));
                float y = Float.parseFloat(s.substring(s0 + 1, s1));
                float z = Float.parseFloat(s.substring(s1 + 1, s2));
                float w = Float.parseFloat(s.substring(s2 + 1, s.length() - 1));
                return this.set(x, y, z, w);
        }
        throw new IllegalArgumentException("Not a valid format for a PointF4: " + s);
    }

}
