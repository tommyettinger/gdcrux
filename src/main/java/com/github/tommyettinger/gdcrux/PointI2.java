package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.github.tommyettinger.crux.Point2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import static com.badlogic.gdx.math.MathUtils.round;

/**
 * The same as {@link GridPoint2}, just implementing {@link Point2}, {@link Json.Serializable},
 * and {@link Externalizable}. This does have some more additions to those interfaces, such as
 * {@link #get(int)} and {@link #setAt(int, int)}.
 */
public class PointI2 extends GridPoint2 implements Point2<PointI2>, PointIShared<PointI2, Point2<?>>, Json.Serializable, Externalizable {

    public PointI2() {
        super();
    }

    public PointI2(int x, int y) {
        super(x, y);
    }

    public PointI2(float x, float y) {
        super(round(x), round(y));
    }

    public PointI2(GridPoint2 p) {
        super(p);
    }

    public PointI2(Vector2 p) {
        super(round(p.x), round(p.y));
    }

    public PointI2(PointI2 p) {
        super(p);
    }

    public PointI2(Point2<? extends Point2<?>> p) {
        this(p.xi(), p.yi());
    }

    /**
     * Returns true if this type of point uses {@code float} or {@code double} for its components, or false otherwise.
     * This always returns false.
     *
     * @return false
     */
    @Override
    public boolean floatingPoint() {
        return false;
    }

    @Override
    public PointI2 cpy() {
        return new PointI2(this);
    }

    @Override
    public float len2() {
        return x * x + y * y;
    }

    @Override
    public PointI2 set(PointI2 point) {
        super.set(point);
        return this;
    }

    @Override
    public PointI2 sub(PointI2 point) {
        super.sub(point);
        return this;
    }

    @Override
    public PointI2 add(PointI2 point) {
        super.add(point);
        return this;
    }

    @Override
    public PointI2 scl(PointI2 point) {
        x *= point.x;
        y *= point.y;
        return this;
    }

    @Override
    public float dst(PointI2 point) {
        return super.dst(point);
    }

    @Override
    public float dst2(PointI2 point) {
        return super.dst2(point);
    }

    @Override
    public boolean isUnit() {
        return (Math.abs(x) + Math.abs(y) == 1);
    }

    @Override
    public boolean isUnit(float tolerance) {
        return MathUtils.isEqual(Math.abs(x) + Math.abs(y), 1, tolerance);
    }

    @Override
    public boolean isZero() {
        return (x | y) == 0;
    }

    @Override
    public boolean isZero(float tolerance) {
        return MathUtils.isZero(x, tolerance) && MathUtils.isZero(y, tolerance);
    }

    @Override
    public PointI2 setZero() {
        set(0, 0);
        return this;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointI2 x(float next) {
        x = round(next);
        return this;
    }

    @Override
    public int xi() {
        return x;
    }

    @Override
    public PointI2 xi(int next) {
        x = next;
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointI2 y(float next) {
        y = round(next);
        return this;
    }

    @Override
    public int yi() {
        return y;
    }

    @Override
    public PointI2 yi(int next) {
        y = next;
        return this;
    }

    public PointI2 set(float x, float y){
        this.x = round(x);
        this.y = round(y);
        return this;
    }

    @Override
    public PointI2 seti(int x, int y){
        this.x = x;
        this.y = y;
        return this;
    }

    /**
     * Sets the coordinates of this point to that of another.
     *
     * @param point The 2D grid point (which may be a PointI2 or GridPoint2) to copy coordinates of.
     * @return this PointI2 for chaining.
     */
    @Override
    public PointI2 set(GridPoint2 point) {
        super.set(point);
        return this;
    }

    /**
     * Sets the coordinates of this PointI2. Identical to {@link #seti(int, int)}.
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @return this PointI2 for chaining.
     */
    @Override
    public PointI2 set(int x, int y) {
        return seti(x, y);
    }

    public PointI2 set(Point2<?> pt) {
        x = pt.xi();
        y = pt.yi();
        return this;
    }

    /**
     * Adds another point to this point.
     *
     * @param other The other point
     * @return this PointI2 for chaining.
     */
    @Override
    public PointI2 add(GridPoint2 other) {
        super.add(other);
        return this;
    }

    /**
     * Adds another x,y,z point to this point.
     *
     * @param x The x-coordinate of the other point
     * @param y The y-coordinate of the other point
     * @return this PointI2 for chaining.
     */
    @Override
    public PointI2 add(int x, int y) {
        super.add(x, y);
        return this;
    }

    /**
     * Subtracts another point from this point.
     *
     * @param other The other point
     * @return this PointI2 for chaining.
     */
    @Override
    public PointI2 sub(GridPoint2 other) {
        super.sub(other);
        return this;
    }

    /**
     * Subtracts another x,y,z point from this point.
     *
     * @param x The x-coordinate of the other point
     * @param y The y-coordinate of the other point
     * @return this PointI2 for chaining.
     */
    @Override
    public PointI2 sub(int x, int y) {
        super.sub(x, y);
        return this;
    }

    @SuppressWarnings("lossy-conversions")
    public PointI2 scl(Point2<?> pt) {
        x *= pt.x();
        y *= pt.y();
        return this;
    }

    @SuppressWarnings("lossy-conversions")
    public PointI2 scl(float value) {
        x *= value;
        y *= value;
        return this;
    }

    @SuppressWarnings("lossy-conversions")
    public PointI2 scl(float ox, float oy) {
        x *= ox;
        y *= oy;
        return this;
    }

    public PointI2 mul(Point2<?> pt) {
        return scl(pt);
    }

    public PointI2 mul(float value) {
        return scl(value);
    }

    public PointI2 mul(float ox, float oy) {
        return scl(ox, oy);
    }

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    public int get (int index) {
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
    public PointI2 setAt(int index, int value){
        switch (index){
            default: x = value;
            case 1 : y = value;
        }
        return this;
    }

    @Override
    public PointI2 lerp(Point2<?> target, float alpha) {
        final float invAlpha = 1.0f - alpha;
        this.x = (int)((x * invAlpha) + (target.x() * alpha));
        this.y = (int)((y * invAlpha) + (target.y() * alpha));
        return this;
    }

    @Override
    public int hashCode() {
        return x * 0x1827F5 ^ y * 0x123C21;
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, int.class);
        json.writeValue("y", y, int.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getInt("x");
        this.y = jsonData.getInt("y");
    }

    @GwtIncompatible
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(x);
        out.writeInt(y);
    }

    @GwtIncompatible
    public void readExternal(ObjectInput in) throws IOException {
        x = in.readInt();
        y = in.readInt();
    }

    /** Converts this {@code PointI2} to a string in the format {@code (x,y,z)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + ")";
    }

    /** Sets this {@code PointI2} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointI2 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        if (s0 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            int x = Integer.parseInt(s.substring(1, s0));
            int y = Integer.parseInt(s.substring(s0 + 1, s.length() - 1));
            return this.set(x, y);
        }
        throw new IllegalArgumentException("Not a valid format for a PointI2: " + s);
    }
}
