package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.*;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.NumberUtils;
import com.github.tommyettinger.crux.Point2;

import java.util.Random;

/**
 * The same as {@link Vector2}, just implementing {@link Point2}, {@link Json.Serializable},
 * and {@link PointFShared}.
 */
public class PointF2 extends Vector2 implements Point2<PointF2>, PointFShared<PointF2, Point2<?>>, Json.Serializable {

    public PointF2() {
        super();
    }

    public PointF2(float x, float y) {
        super(x, y);
    }

    public PointF2(Vector2 p) {
        super(p);
    }

    public PointF2(GridPoint2 p) {
        super(p.x, p.y);
    }

    public PointF2(PointF2 p) {
        super(p);
    }

    public PointF2(Point2<? extends Point2<?>> p) {
        this(p.x(), p.y());
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
    public PointF2 cpy() {
        return new PointF2(this);
    }

    @Override
    public PointF2 set(PointF2 point) {
        super.set(point);
        return this;
    }

    @Override
    public PointF2 sub(PointF2 point) {
        super.sub(point);
        return this;
    }

    @Override
    public PointF2 add(PointF2 point) {
        super.add(point);
        return this;
    }

    @Override
    public PointF2 scl(PointF2 point) {
        super.scl(point);
        return this;
    }

    @Override
    public float dst(PointF2 point) {
        return super.dst(point);
    }

    @Override
    public float dst2(PointF2 point) {
        return super.dst2(point);
    }

    @Override
    public PointF2 setZero() {
        super.setZero();
        return this;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointF2 x(float next) {
        x = next;
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointF2 y(float next) {
        y = next;
        return this;
    }

    public PointF2 set(float x, float y){
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public PointF2 set(Vector2 v) {
        super.set(v);
        return this;
    }

    @Override
    public PointF2 sub(Vector2 v) {
        super.sub(v);
        return this;
    }

    @Override
    public PointF2 sub(float x, float y) {
        super.sub(x, y);
        return this;
    }

    public PointF2 minus(float value) {
        super.sub(value, value);
        return this;
    }

    @Override
    public PointF2 nor() {
        super.nor();
        return this;
    }

    @Override
    public PointF2 add(Vector2 v) {
        super.add(v);
        return this;
    }

    @Override
    public PointF2 add(float x, float y) {
        super.add(x, y);
        return this;
    }

    public PointF2 plus(float scalar) {
        super.add(scalar, scalar);
        return this;
    }

    @Override
    public PointF2 times(float scalar) {
        super.scl(scalar);
        return this;
    }

    @Override
    public PointF2 scl(float x, float y) {
        super.scl(x, y);
        return this;
    }

    @Override
    public PointF2 scl(Vector2 v) {
        super.scl(v);
        return this;
    }

    /**
     * Multiplies each component of this by the given scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float)}.
     * @param scalar a float that will be multiplied with each component
     * @return this, for chaining
     */
    public PointF2 mul(float scalar) {
        super.scl(scalar);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding scalar, in-place, and returns this.
     * This is an alias for {@link #scl(float, float)}.
     * @param x a float that will be multiplied with x
     * @param y a float that will be multiplied with y
     * @return this, for chaining
     */
    public PointF2 mul(float x, float y) {
        super.scl(x, y);
        return this;
    }

    /**
     * Multiplies each component of this by the corresponding item in {@code vec}, in-place, and returns this.
     * This is an alias for {@link #scl(Vector2)}.
     * @param vec a Vector2 (which can be another PointF2) that will be multiplied component-wise with this
     * @return this, for chaining
     */
    public PointF2 mul(Vector2 vec) {
        super.scl(vec);
        return this;
    }

    @Override
    public PointF2 mulAdd(Vector2 vec, float scalar) {
        super.mulAdd(vec, scalar);
        return this;
    }

    @Override
    public PointF2 mulAdd(Vector2 vec, Vector2 mulVec) {
        super.mulAdd(vec, mulVec);
        return this;
    }

    @Override
    public PointF2 limit(float limit) {
        super.limit(limit);
        return this;
    }

    @Override
    public PointF2 limit2(float limit2) {
        super.limit2(limit2);
        return this;
    }

    @Override
    public PointF2 clamp(float min, float max) {
        super.clamp(min, max);
        return this;
    }

    @Override
    public PointF2 setLength(float len) {
        super.setLength(len);
        return this;
    }

    @Override
    public PointF2 setLength2(float len2) {
        super.setLength2(len2);
        return this;
    }

    @Override
    public PointF2 mul(Matrix3 mat) {
        super.mul(mat);
        return this;
    }

    @Override
    public PointF2 setAngleDeg(float degrees) {
        super.setAngleDeg(degrees);
        return this;
    }

    @Override
    public PointF2 setAngleRad(float radians) {
        super.setAngleRad(radians);
        return this;
    }

    @Override
    public PointF2 rotateDeg(float degrees) {
        super.rotateDeg(degrees);
        return this;
    }

    @Override
    public PointF2 rotateRad(float radians) {
        super.rotateRad(radians);
        return this;
    }

    @Override
    public PointF2 rotateAroundDeg(Vector2 reference, float degrees) {
        super.rotateAroundDeg(reference, degrees);
        return this;
    }

    @Override
    public PointF2 rotateAroundRad(Vector2 reference, float radians) {
        super.rotateAroundRad(reference, radians);
        return this;
    }

    @Override
    public PointF2 rotate90(int dir) {
        super.rotate90(dir);
        return this;
    }

    @Override
    public PointF2 lerp(Vector2 target, float alpha) {
        super.lerp(target, alpha);
        return this;
    }

    public PointF2 lerp(Point2<?> target, float alpha) {
        final float invAlpha = 1.0f - alpha;
        this.x = (x * invAlpha) + (target.x() * alpha);
        this.y = (y * invAlpha) + (target.y() * alpha);
        return this;
    }

    @Override
    public PointF2 interpolate(Vector2 target, float alpha, Interpolation interpolation) {
        super.interpolate(target, alpha, interpolation);
        return this;
    }

    public PointF2 slerpGeometric(PointF2 target, float alpha) {
        return PointFShared.slerpGeometric(this, target, alpha, this);
    }

    @Override
    public PointF2 setToRandomDirection() {
        return setToRandomDirection(MathUtils.random);
    }

    public PointF2 setToRandomDirection(Random random) {
        float theta = random.nextFloat() * MathUtils.PI2;
        return this.set(MathUtils.cos(theta), MathUtils.sin(theta));
    }

    /**
     * For each component, this clamps it between min and max, inclusive.
     * @param min the minimum value allowable for any component, inclusive
     * @param max the maximum value allowable for any component, inclusive
     * @return this, after modifications
     */
    public PointF2 clampEach (float min, float max) {
        x = Math.min(Math.max(x, min), max);
        y = Math.min(Math.max(y, min), max);
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
    public PointF2 fract () {
        x -= MathUtils.floor(x);
        y -= MathUtils.floor(y);
        return this;
    }

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    public float get (int index) {
        if (index == 1)
            return y;
        return x;
    }

    /**
     * Sets the component at the specified index to the specified value.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    @SuppressWarnings({"DefaultNotLastCaseInSwitch", "SwitchStatementWithTooFewBranches"})
    public PointF2 setAt(int index, float value){
        switch (index){
            default: x = value;
            case 1 : y = value;
        }
        return this;
    }

    @Override
    public int hashCode() {
        final int h = NumberUtils.floatToIntBits(x) + 53 * NumberUtils.floatToIntBits(y);
        return h ^ h >>> 16;
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, float.class);
        json.writeValue("y", y, float.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getFloat("x");
        this.y = jsonData.getFloat("y");
    }

    /** Converts this {@code PointF2} to a string in the format {@code (x,y)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + ")";
    }

    /** Sets this {@code PointF2} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointF2 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        if (s0 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            float x = Float.parseFloat(s.substring(1, s0));
            float y = Float.parseFloat(s.substring(s0 + 1, s.length() - 1));
            return this.set(x, y);
        }
        throw new IllegalArgumentException("Not a valid format for a PointF2: " + s);
    }
}
