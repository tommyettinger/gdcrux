package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.NumberUtils;
import com.github.tommyettinger.crux.Point3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Random;

/**
 * The same as {@link Vector3}, just implementing {@link Point3} and {@link Json.Serializable}.
 */
public class PointF3 extends Vector3 implements Point3<PointF3>, Json.Serializable, Externalizable {

    public PointF3() {
        super();
    }

    public PointF3(float x, float y, float z) {
        super(x, y, z);
    }

    public PointF3(Vector3 p) {
        super(p);
    }

    public PointF3(GridPoint3 p) {
        super(p.x, p.y, p.z);
    }

    public PointF3(PointF3 p) {
        super(p);
    }

    public PointF3(Point3<? extends Point3<?>> p) {
        this(p.x(), p.y(), p.z());
    }

    public PointF3(float[] values) {
        super(values);
    }

    public PointF3(Vector2 vector, float z) {
        super(vector, z);
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
    public PointF3 cpy() {
        return new PointF3(this);
    }

    @Override
    public PointF3 set(PointF3 point) {
        super.set(point);
        return this;
    }

    @Override
    public PointF3 sub(PointF3 point) {
        super.sub(point);
        return this;
    }

    @Override
    public PointF3 add(PointF3 point) {
        super.add(point);
        return this;
    }

    @Override
    public PointF3 scl(PointF3 point) {
        super.scl(point);
        return this;
    }

    @Override
    public float dst(PointF3 point) {
        return super.dst(point);
    }

    @Override
    public float dst2(PointF3 point) {
        return super.dst2(point);
    }

    @Override
    public PointF3 setZero() {
        super.setZero();
        return this;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointF3 x(float next) {
        x = next;
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointF3 y(float next) {
        y = next;
        return this;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public PointF3 z(float next) {
        z = next;
        return this;
    }

    public PointF3 set(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    @Override
    public PointF3 set(Vector3 vector) {
        super.set(vector);
        return this;
    }

    @Override
    public PointF3 set(float[] values) {
        super.set(values);
        return this;
    }

    @Override
    public PointF3 set(Vector2 vector, float z) {
        super.set(vector, z);
        return this;
    }

    @Override
    public PointF3 setFromSpherical(float azimuthalAngle, float polarAngle) {
        super.setFromSpherical(azimuthalAngle, polarAngle);
        return this;
    }

    @Override
    public PointF3 setToRandomDirection() {
        return setToRandomDirection(MathUtils.random);
    }

    public PointF3 setToRandomDirection(Random random) {
        float u = random.nextFloat();
        float v = random.nextFloat();

        float theta = MathUtils.PI2 * u; // azimuthal angle
        float phi = MathUtils.acos(2f * (v - 0.5f)); // polar angle

        return this.setFromSpherical(theta, phi);
    }

    @Override
    public PointF3 add(Vector3 vector) {
        super.add(vector);
        return this;
    }

    @Override
    public PointF3 add(float x, float y, float z) {
        super.add(x, y, z);
        return this;
    }

    @Override
    public PointF3 add(float values) {
        super.add(values);
        return this;
    }

    @Override
    public PointF3 sub(Vector3 a_vec) {
        super.sub(a_vec);
        return this;
    }

    @Override
    public PointF3 sub(float x, float y, float z) {
        super.sub(x, y, z);
        return this;
    }

    @Override
    public PointF3 sub(float value) {
        super.sub(value);
        return this;
    }

    @Override
    public PointF3 scl(float scalar) {
        super.scl(scalar);
        return this;
    }

    @Override
    public PointF3 scl(Vector3 other) {
        super.scl(other);
        return this;
    }

    @Override
    public PointF3 scl(float vx, float vy, float vz) {
        super.scl(vx, vy, vz);
        return this;
    }
    /**
     * Multiplies each component of this by the given scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float)}.
     * @param scalar a float that will be multiplied with each component
     * @return this, for chaining
     */
    public PointF3 mul(float scalar) {
        super.scl(scalar);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float, float, float)}.
     * @param x a float that will be multiplied with x
     * @param y a float that will be multiplied with y
     * @param z a float that will be multiplied with z
     * @return this, for chaining
     */
    public PointF3 mul(float x, float y, float z) {
        super.scl(x, y, z);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding item in {@code vec}, in-place, and returns this.
     * This is an alias for {@link #scl(Vector3)}.
     * @param vec a Vector3 (which can be another PointF3) that will be multiplied component-wise with this
     * @return this, for chaining
     */
    public PointF3 mul(Vector3 vec) {
        super.scl(vec);
        return this;
    }

    @Override
    public PointF3 mulAdd(Vector3 vec, float scalar) {
        super.mulAdd(vec, scalar);
        return this;
    }

    @Override
    public PointF3 mulAdd(Vector3 vec, Vector3 mulVec) {
        super.mulAdd(vec, mulVec);
        return this;
    }

    @Override
    public PointF3 nor() {
        super.nor();
        return this;
    }

    @Override
    public PointF3 crs(Vector3 vector) {
        super.crs(vector);
        return this;
    }

    @Override
    public PointF3 crs(float x, float y, float z) {
        super.crs(x, y, z);
        return this;
    }

    @Override
    public PointF3 mul4x3(float[] matrix) {
        super.mul4x3(matrix);
        return this;
    }

    @Override
    public PointF3 mul(Matrix4 matrix) {
        super.mul(matrix);
        return this;
    }

    @Override
    public PointF3 traMul(Matrix4 matrix) {
        super.traMul(matrix);
        return this;
    }

    @Override
    public PointF3 mul(Matrix3 matrix) {
        super.mul(matrix);
        return this;
    }

    @Override
    public PointF3 traMul(Matrix3 matrix) {
        super.traMul(matrix);
        return this;
    }

    @Override
    public PointF3 mul(Quaternion quat) {
        super.mul(quat);
        return this;
    }

    @Override
    public PointF3 prj(Matrix4 matrix) {
        super.prj(matrix);
        return this;
    }

    @Override
    public PointF3 rot(Matrix4 matrix) {
        super.rot(matrix);
        return this;
    }

    @Override
    public PointF3 unrotate(Matrix4 matrix) {
        super.unrotate(matrix);
        return this;
    }

    @Override
    public PointF3 untransform(Matrix4 matrix) {
        super.untransform(matrix);
        return this;
    }

    @Override
    public PointF3 rotate(float degrees, float axisX, float axisY, float axisZ) {
        super.rotate(degrees, axisX, axisY, axisZ);
        return this;
    }

    @Override
    public PointF3 rotateRad(float radians, float axisX, float axisY, float axisZ) {
        super.rotateRad(radians, axisX, axisY, axisZ);
        return this;
    }

    @Override
    public PointF3 rotate(Vector3 axis, float degrees) {
        super.rotate(axis, degrees);
        return this;
    }

    @Override
    public PointF3 rotateRad(Vector3 axis, float radians) {
        super.rotateRad(axis, radians);
        return this;
    }

    @Override
    public PointF3 lerp(Vector3 target, float alpha) {
        super.lerp(target, alpha);
        return this;
    }

    @Override
    public PointF3 interpolate(Vector3 target, float alpha, Interpolation interpolator) {
        super.interpolate(target, alpha, interpolator);
        return this;
    }

    @Override
    public PointF3 slerp(Vector3 target, float alpha) {
        super.slerp(target, alpha);
        return this;
    }

    @Override
    public PointF3 limit(float limit) {
        super.limit(limit);
        return this;
    }

    @Override
    public PointF3 setLength(float len) {
        super.setLength(len);
        return this;
    }

    @Override
    public PointF3 limit2(float limit2) {
        super.limit2(limit2);
        return this;
    }

    @Override
    public PointF3 setLength2(float len2) {
        super.setLength2(len2);
        return this;
    }

    @Override
    public PointF3 clamp(float min, float max) {
        super.clamp(min, max);
        return this;
    }

    /**
     * For each component, this clamps it between min and max, inclusive.
     * @param min the minimum value allowable for any component, inclusive
     * @param max the maximum value allowable for any component, inclusive
     * @return this, after modifications
     */
    public PointF3 clampEach (float min, float max) {
        x = Math.min(Math.max(x, min), max);
        y = Math.min(Math.max(y, min), max);
        z = Math.min(Math.max(z, min), max);
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
    public PointF3 fract () {
        x -= MathUtils.floor(x);
        y -= MathUtils.floor(y);
        z -= MathUtils.floor(z);
        return this;
    }

    @Override
    public int hashCode() {
        final int h = NumberUtils.floatToIntBits(x) + 53 * NumberUtils.floatToIntBits(y) + 113 * NumberUtils.floatToIntBits(z);
        return h ^ h >>> 16;
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, float.class);
        json.writeValue("y", y, float.class);
        json.writeValue("z", z, float.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getFloat("x");
        this.y = jsonData.getFloat("y");
        this.z = jsonData.getFloat("z");
    }

    @GwtIncompatible
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeFloat(x);
        out.writeFloat(y);
        out.writeFloat(z);
    }

    @GwtIncompatible
    public void readExternal(ObjectInput in) throws IOException {
        x = in.readFloat();
        y = in.readFloat();
        z = in.readFloat();
    }

    /** Converts this {@code PointF3} to a string in the format {@code (x,y,z)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + ")";
    }

    /** Sets this {@code PointF3} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointF3 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        int s1 = s.indexOf(',', s0 + 1);
        if (s0 != -1 && s1 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
                float x = Float.parseFloat(s.substring(1, s0));
                float y = Float.parseFloat(s.substring(s0 + 1, s1));
                float z = Float.parseFloat(s.substring(s1 + 1, s.length() - 1));
                return this.set(x, y, z);
        }
        throw new IllegalArgumentException("Not a valid format for a PointF3: " + s);
    }

}
