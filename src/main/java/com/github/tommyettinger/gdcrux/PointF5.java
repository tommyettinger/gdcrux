package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.NumberUtils;
import com.github.tommyettinger.crux.Point5;

/**
 * The same as {@link Vector5}, just implementing {@link Point5} and {@link Json.Serializable}.
 */
public class PointF5 extends Vector5 implements Point5<PointF5>, Json.Serializable {

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
    public Vector5 setToRandomDirection() {
        return set((float) Distributor.normal(MathUtils.random.nextLong()),
                (float) Distributor.normal(MathUtils.random.nextLong()),
                (float) Distributor.normal(MathUtils.random.nextLong()),
                (float) Distributor.normal(MathUtils.random.nextLong()),
                (float) Distributor.normal(MathUtils.random.nextLong())).nor();
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
