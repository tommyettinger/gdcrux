package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.NumberUtils;
import com.github.tommyettinger.crux.Point5;

import java.util.Random;

/**
 * The same as {@link Vector5} (from gdcrux, not libGDX), just implementing {@link Point5}, {@link Json.Serializable},
 * and {@link PointFShared}.
 */
public class PointF5 extends Vector5 implements Point5<PointF5>, PointFShared<PointF5, Point5<?>>, Json.Serializable {

    public PointF5() {
        super();
    }

    public PointF5(float x, float y, float z, float w, float u) {
        super(x, y, z, w, u);
    }

    public PointF5(Vector5 p) {
        super(p);
    }

    public PointF5(PointF5 p) {
        super(p);
    }

    public PointF5(Point5<? extends Point5<?>> p) {
        this(p.x(), p.y(), p.z(), p.w(), p.u());
    }

    public PointF5(float[] values) {
        super(values);
    }

    public PointF5(Vector2 vector, float z, float w, float u) {
        super(vector, z, w, u);
    }

    public PointF5(Vector3 vector, float w, float u) {
        super(vector, w, u);
    }

    public PointF5(Vector4 vector, float u) {
        super(vector, u);
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
    public PointF5 cpy() {
        return new PointF5(this);
    }

    @Override
    public PointF5 set(PointF5 point) {
        super.set(point);
        return this;
    }

    @Override
    public PointF5 sub(PointF5 point) {
        super.sub(point);
        return this;
    }

    @Override
    public PointF5 add(PointF5 point) {
        super.add(point);
        return this;
    }

    @Override
    public PointF5 scl(PointF5 point) {
        super.scl(point);
        return this;
    }

    @Override
    public float dst(PointF5 point) {
        return super.dst(point);
    }

    @Override
    public float dst2(PointF5 point) {
        return super.dst2(point);
    }

    @Override
    public PointF5 setZero() {
        super.setZero();
        return this;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointF5 x(float next) {
        x = next;
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointF5 y(float next) {
        y = next;
        return this;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public PointF5 z(float next) {
        z = next;
        return this;
    }

    @Override
    public float w() {
        return w;
    }

    @Override
    public PointF5 w(float next) {
        w = next;
        return this;
    }

    @Override
    public float u() {
        return u;
    }

    @Override
    public PointF5 u(float next) {
        u = next;
        return this;
    }

    public PointF5 set(float x, float y, float z, float w, float u){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.u = u;
        return this;
    }

    @Override
    public PointF5 set(Vector5 vector) {
        super.set(vector);
        return this;
    }

    @Override
    public PointF5 set(float[] values) {
        super.set(values);
        return this;
    }

    @Override
    public PointF5 set(Vector2 vector, float z, float w, float u) {
        super.set(vector, z, w, u);
        return this;
    }

    @Override
    public PointF5 set(Vector3 vector, float w, float u) {
        super.set(vector, w, u);
        return this;
    }

    @Override
    public PointF5 set(Vector4 vector, float u) {
        super.set(vector, u);
        return this;
    }

    @Override
    public PointF5 add(Vector5 vector) {
        super.add(vector);
        return this;
    }

    @Override
    public PointF5 add(float x, float y, float z, float w, float u) {
        super.add(x, y, z, w, u);
        return this;
    }

    @Override
    public PointF5 plus(float value) {
        super.add(value);
        return this;
    }

    @Override
    public PointF5 sub(Vector5 vector) {
        super.sub(vector);
        return this;
    }

    @Override
    public PointF5 sub(float x, float y, float z, float w, float u) {
        super.sub(x, y, z, w, u);
        return this;
    }

    @Override
    public PointF5 minus(float value) {
        super.sub(value);
        return this;
    }

    @Override
    public PointF5 times(float scalar) {
        super.scl(scalar);
        return this;
    }

    @Override
    public PointF5 scl(Vector5 other) {
        super.scl(other);
        return this;
    }

    @Override
    public PointF5 scl(float vx, float vy, float vz, float vw, float vu) {
        super.scl(vx, vy, vz, vw, vu);
        return this;
    }
    
    /**
     * Multiplies each component of this by the given scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float)}.
     * @param scalar a float that will be multiplied with each component
     * @return this, for chaining
     */
    public PointF5 mul(float scalar) {
        super.scl(scalar);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float, float, float, float, float)}.
     * @param x a float that will be multiplied with x
     * @param y a float that will be multiplied with y
     * @param z a float that will be multiplied with z
     * @param w a float that will be multiplied with w
     * @param u a float that will be multiplied with u
     * @return this, for chaining
     */
    public PointF5 mul(float x, float y, float z, float w, float u) {
        super.scl(x, y, z, w, u);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding item in {@code vec}, in-place, and returns this.
     * This is an alias for {@link #scl(Vector5)}.
     * @param vec a Vector5 (which can be another PointF5) that will be multiplied component-wise with this
     * @return this, for chaining
     */
    public PointF5 mul(Vector5 vec) {
        super.scl(vec);
        return this;
    }

    @Override
    public PointF5 mulAdd(Vector5 vec, float scalar) {
        super.mulAdd(vec, scalar);
        return this;
    }

    @Override
    public PointF5 mulAdd(Vector5 vec, Vector5 mulVec) {
        super.mulAdd(vec, mulVec);
        return this;
    }

    @Override
    public PointF5 nor() {
        super.nor();
        return this;
    }

    @Override
    public PointF5 lerp(Vector5 target, float alpha) {
        super.lerp(target, alpha);
        return this;
    }

    public PointF5 lerp(Point5<?> target, float alpha) {
        final float invAlpha = 1.0f - alpha;
        this.x = (x * invAlpha) + (target.x() * alpha);
        this.y = (y * invAlpha) + (target.y() * alpha);
        this.z = (z * invAlpha) + (target.z() * alpha);
        this.w = (w * invAlpha) + (target.w() * alpha);
        this.u = (u * invAlpha) + (target.u() * alpha);
        return this;
    }

    @Override
    public PointF5 interpolate(Vector5 target, float alpha, Interpolation interpolator) {
        super.interpolate(target, alpha, interpolator);
        return this;
    }

    public PointF5 slerpGeometric(PointF5 target, float alpha) {
        return PointFShared.slerpGeometric(this, target, alpha, this);
    }

    @Override
    public PointF5 limit(float limit) {
        super.limit(limit);
        return this;
    }

    @Override
    public PointF5 limit2(float limit2) {
        super.limit2(limit2);
        return this;
    }

    @Override
    public PointF5 setLength(float len) {
        super.setLength(len);
        return this;
    }

    @Override
    public PointF5 setLength2(float len2) {
        super.setLength2(len2);
        return this;
    }

    @Override
    public PointF5 clamp(float min, float max) {
        super.clamp(min, max);
        return this;
    }

    @Override
    public PointF5 setToRandomDirection() {
        super.setToRandomDirection();
        return this;
    }

    @Override
    public PointF5 setToRandomDirection(Random random) {
        super.setToRandomDirection(random);
        return this;
    }

    @Override
    public PointF5 clampEach(float min, float max) {
        super.clampEach(min, max);
        return this;
    }

    @Override
    public PointF5 fract() {
        super.fract();
        return this;
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
            case 4 : return u;
        }
    }

    /**
     * Sets the component at the specified index to the specified value.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    @SuppressWarnings("DefaultNotLastCaseInSwitch")
    public PointF5 setAt(int index, float value){
        switch (index){
            default: x = value;
            case 1 : y = value;
            case 2 : z = value;
            case 3 : w = value;
            case 4 : u = value;
        }
        return this;
    }

    @Override
    public int hashCode() {
        final int h = NumberUtils.floatToIntBits(x) + 53 * NumberUtils.floatToIntBits(y) +
                113 * NumberUtils.floatToIntBits(z) + 151 * NumberUtils.floatToIntBits(w) +
                211 * NumberUtils.floatToIntBits(u);
        return h ^ h >>> 16;
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, float.class);
        json.writeValue("y", y, float.class);
        json.writeValue("z", z, float.class);
        json.writeValue("w", w, float.class);
        json.writeValue("u", u, float.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getFloat("x");
        this.y = jsonData.getFloat("y");
        this.z = jsonData.getFloat("z");
        this.w = jsonData.getFloat("w");
        this.u = jsonData.getFloat("u");
    }

    /** Converts this {@code PointF5} to a string in the format {@code (x,y,z,w,u)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + "," + w + "," + u + ")";
    }

    /** Sets this {@code PointF5} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointF5 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        int s1 = s.indexOf(',', s0 + 1);
        int s2 = s.indexOf(',', s1 + 1);
        int s3 = s.indexOf(',', s2 + 1);
        if (s0 != -1 && s1 != -1 && s2 != -1 && s3 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
                float x = Float.parseFloat(s.substring(1, s0));
                float y = Float.parseFloat(s.substring(s0 + 1, s1));
                float z = Float.parseFloat(s.substring(s1 + 1, s2));
                float w = Float.parseFloat(s.substring(s2 + 1, s3));
                float u = Float.parseFloat(s.substring(s3 + 1, s.length() - 1));
                return this.set(x, y, z, w, u);
        }
        throw new IllegalArgumentException("Not a valid format for a PointF5: " + s);
    }

}
