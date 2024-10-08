package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.GridPoint3;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.github.tommyettinger.crux.Point2;
import com.github.tommyettinger.crux.Point3;

import static com.badlogic.gdx.math.MathUtils.round;

/**
 * The same as {@link GridPoint2}, just implementing {@link Point2} and {@link Json.Serializable}.
 */
public class PointI3 extends GridPoint3 implements Point3<PointI3>, Json.Serializable {

    public PointI3() {
        super();
    }

    public PointI3(int x, int y, int z) {
        super(x, y, z);
    }

    public PointI3(float x, float y, float z) {
        super(round(x), round(y), round(z));
    }

    public PointI3(GridPoint3 p) {
        super(p);
    }

    public PointI3(Vector3 p) {
        super(round(p.x), round(p.y), round(p.z));
    }

    public PointI3(PointI3 p) {
        super(p);
    }

    public PointI3(Point3<? extends Point3<?>> p) {
        this(p.xi(), p.yi(), p.zi());
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
    public PointI3 cpy() {
        return new PointI3(this);
    }

    @Override
    public float len2() {
        return x * x + y * y + z * z;
    }

    @Override
    public PointI3 set(PointI3 point) {
        super.set(point);
        return this;
    }

    @Override
    public PointI3 sub(PointI3 point) {
        super.sub(point);
        return this;
    }

    @Override
    public PointI3 add(PointI3 point) {
        super.add(point);
        return this;
    }

    @Override
    public PointI3 scl(PointI3 point) {
        x *= point.x;
        y *= point.y;
        z *= point.z;
        return this;
    }

    @Override
    public float dst(PointI3 point) {
        return super.dst(point);
    }

    @Override
    public float dst2(PointI3 point) {
        return super.dst2(point);
    }

    @Override
    public boolean isUnit() {
        return (Math.abs(x) + Math.abs(y) + Math.abs(z) == 1);
    }

    @Override
    public boolean isUnit(float tolerance) {
        return MathUtils.isEqual(Math.abs(x) + Math.abs(y) + Math.abs(z), 1, tolerance);
    }

    @Override
    public boolean isZero() {
        return (x | y | z) == 0;
    }

    @Override
    public boolean isZero(float tolerance) {
        return MathUtils.isZero(x, tolerance) && MathUtils.isZero(y, tolerance) && MathUtils.isZero(z, tolerance);
    }

    @Override
    public PointI3 setZero() {
        set(0, 0, 0);
        return this;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointI3 x(float next) {
        x = round(next);
        return this;
    }

    @Override
    public int xi() {
        return x;
    }

    @Override
    public PointI3 xi(int next) {
        x = next;
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointI3 y(float next) {
        y = round(next);
        return this;
    }

    @Override
    public int yi() {
        return y;
    }

    @Override
    public PointI3 yi(int next) {
        y = next;
        return this;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public PointI3 z(float next) {
        z = round(next);
        return this;
    }

    @Override
    public int zi() {
        return z;
    }

    @Override
    public PointI3 zi(int next) {
        z = next;
        return this;
    }

    @Override
    public int hashCode() {
        return x * 0x1A36A9 ^ y * 0x157931 ^ z * 0x119725;
    }

    public PointI3 set(float x, float y, float z){
        this.x = round(x);
        this.y = round(y);
        this.z = round(z);
        return this;
    }

    @Override
    public PointI3 seti(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    /**
     * Sets the coordinates of this point to that of another.
     *
     * @param point The 3D grid point (which may be a PointI3 or GridPoint3) to copy coordinates of.
     * @return this PointI3 for chaining.
     */
    @Override
    public PointI3 set(GridPoint3 point) {
        super.set(point);
        return this;
    }

    /**
     * Sets the coordinates of this PointI3. Identical to {@link #seti(int, int, int)}.
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param z Z coordinate
     * @return this PointI3 for chaining.
     */
    @Override
    public PointI3 set(int x, int y, int z) {
        return seti(x, y, z);
    }

    public PointI3 set(Point3<?> pt) {
        x = pt.xi();
        y = pt.yi();
        z = pt.zi();
        return this;
    }

    /**
     * Adds another point to this point.
     *
     * @param other The other point
     * @return this PointI3 for chaining.
     */
    @Override
    public PointI3 add(GridPoint3 other) {
        super.add(other);
        return this;
    }

    /**
     * Adds another x,y,z point to this point.
     *
     * @param x The x-coordinate of the other point
     * @param y The y-coordinate of the other point
     * @param z The z-coordinate of the other point
     * @return this PointI3 for chaining.
     */
    @Override
    public PointI3 add(int x, int y, int z) {
        super.add(x, y, z);
        return this;
    }

    /**
     * Subtracts another point from this point.
     *
     * @param other The other point
     * @return this PointI3 for chaining.
     */
    @Override
    public PointI3 sub(GridPoint3 other) {
        super.sub(other);
        return this;
    }

    /**
     * Subtracts another x,y,z point from this point.
     *
     * @param x The x-coordinate of the other point
     * @param y The y-coordinate of the other point
     * @param z The z-coordinate of the other point
     * @return this PointI3 for chaining.
     */
    @Override
    public PointI3 sub(int x, int y, int z) {
        super.sub(x, y, z);
        return this;
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, int.class);
        json.writeValue("y", y, int.class);
        json.writeValue("z", z, int.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getInt("x");
        this.y = jsonData.getInt("y");
        this.z = jsonData.getInt("z");
    }

    /** Converts this {@code PointI3} to a string in the format {@code (x,y,z)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + ")";
    }

    /** Sets this {@code PointI3} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointI3 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        int s1 = s.indexOf(',', s0 + 1);
        if (s0 != -1 && s1 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            int x = Integer.parseInt(s.substring(1, s0));
            int y = Integer.parseInt(s.substring(s0 + 1, s1));
            int z = Integer.parseInt(s.substring(s1 + 1, s.length() - 1));
            return this.set(x, y, z);
        }
        throw new IllegalArgumentException("Not a valid format for a PointI3: " + s);
    }
}
