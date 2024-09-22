package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector4;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.NumberUtils;
import com.github.tommyettinger.crux.Point4;

/**
 * The same as {@link Vector4}, just implementing {@link Point4} and {@link Json.Serializable}.
 */
public class PointF4 extends Vector4 implements Point4<PointF4>, Json.Serializable {

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
    public Vector4 setToRandomDirection() {
        return set((float) Linnormal.normal(MathUtils.random.nextLong()),
                (float) Linnormal.normal(MathUtils.random.nextLong()),
                (float) Linnormal.normal(MathUtils.random.nextLong()),
                (float) Linnormal.normal(MathUtils.random.nextLong())).nor();
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

    /** Converts this {@code PointF4} to a string in the format {@code (x,y,z)}.
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
