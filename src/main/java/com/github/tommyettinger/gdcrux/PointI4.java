package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.Vector4;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.github.tommyettinger.crux.Point4;

import static com.badlogic.gdx.math.MathUtils.round;

public class PointI4 implements Point4<PointI4>, Json.Serializable {

    public int x, y, z, w;

    public PointI4() {
        super();
    }

    public PointI4(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public PointI4(float x, float y, float z, float w) {
        this(round(x), round(y), round(z), round(w));
    }

    public PointI4(Vector4 v) {
        this(round(v.x), round(v.y), round(v.z), round(v.w));
    }

    public PointI4(PointI4 v) {
        this(v.x, v.y, v.z, v.w);
    }

    public PointI4(Point4<? extends Point4<?>> v) {
        this(v.xi(), v.yi(), v.zi(), v.zi());
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointI4 x(float f) {
        x = round(f);
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointI4 y(float f) {
        y = round(f);
        return this;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public PointI4 z(float f) {
        z = round(f);
        return this;
    }

    @Override
    public float w() {
        return w;
    }

    @Override
    public PointI4 w(float f) {
        w = round(f);
        return this;
    }

    @Override
    public int xi() {
        return x;
    }

    @Override
    public PointI4 xi(int next) {
        x = next;
        return this;
    }

    @Override
    public int yi() {
        return y;
    }

    @Override
    public PointI4 yi(int next) {
        y = next;
        return this;
    }

    @Override
    public int zi() {
        return z;
    }

    @Override
    public PointI4 zi(int next) {
        z = next;
        return this;
    }

    @Override
    public int wi() {
        return w;
    }

    @Override
    public PointI4 wi(int next) {
        w = next;
        return this;
    }

    @Override
    public PointI4 set(float fx, float fy, float fz, float fw) {
        x = round(fx);
        y = round(fy);
        z = round(fz);
        w = round(fw);
        return this;
    }

    @Override
    public PointI4 seti(int fx, int fy, int fz, int fw) {
        x = fx;
        y = fy;
        z = fz;
        w = fw;
        return this;
    }

    @Override
    public boolean floatingPoint() {
        return false;
    }

    @Override
    public boolean mutable() {
        return true;
    }

    @Override
    public PointI4 cpy() {
        return new PointI4(x, y, z, w);
    }

    @Override
    public float len2() {
        return (float) x * x + y * y + z * z + w * w;
    }

    @Override
    public PointI4 set(PointI4 pt) {
        x = pt.x;
        y = pt.y;
        z = pt.z;
        w = pt.w;
        return this;
    }

    @Override
    public PointI4 setZero() {
        x = y = z = w = 0;
        return this;
    }

    @Override
    public PointI4 sub(PointI4 pt) {
        x -= pt.x;
        y -= pt.y;
        z -= pt.z;
        w -= pt.w;
        return this;
    }

    public PointI4 sub(int ox, int oy, int oz, int ow) {
        x -= ox;
        y -= oy;
        z -= oz;
        w -= ow;
        return this;
    }

    public PointI4 sub(int value) {
        x -= value;
        y -= value;
        z -= value;
        w -= value;
        return this;
    }

    @Override
    public PointI4 add(PointI4 pt) {
        x += pt.x;
        y += pt.y;
        z += pt.z;
        w += pt.w;
        return this;
    }

    public PointI4 add(int ox, int oy, int oz, int ow) {
        x += ox;
        y += oy;
        z += oz;
        w += ow;
        return this;
    }

    public PointI4 add(int value) {
        x += value;
        y += value;
        z += value;
        w += value;
        return this;
    }

    @Override
    public PointI4 scl(PointI4 pt) {
        x *= pt.x;
        y *= pt.y;
        z *= pt.z;
        w *= pt.w;
        return this;
    }

    public PointI4 scl(int value) {
        x *= value;
        y *= value;
        z *= value;
        w *= value;
        return this;
    }

    public PointI4 scl(int ox, int oy, int oz, int ow) {
        x *= ox;
        y *= oy;
        z *= oz;
        w *= ow;
        return this;
    }

    @Override
    public float dst2(PointI4 pt) {
        float x = pt.x - this.x;
        float y = pt.y - this.y;
        float z = pt.z - this.z;
        float w = pt.w - this.w;
        return x * x + y * y + z * z + w * w;
    }

    public float dst2(int ox, int oy, int oz, int ow) {
        float x = ox - this.x;
        float y = oy - this.y;
        float z = oz - this.z;
        float w = ow - this.w;
        return x * x + y * y + z * z + w * w;
    }

    public float dst(int ox, int oy, int oz, int ow) {
        return (float) Math.sqrt(dst2(ox, oy, oz, ow));
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, int.class);
        json.writeValue("y", y, int.class);
        json.writeValue("z", z, int.class);
        json.writeValue("w", w, int.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getInt("x");
        this.y = jsonData.getInt("y");
        this.z = jsonData.getInt("z");
        this.w = jsonData.getInt("w");
    }

    /** Converts this {@code PointI4} to a string in the format {@code (x,y,z,w)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + "," + w + ")";
    }

    /** Sets this {@code PointI4} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param v the string.
     * @return this vector for chaining */
    public PointI4 fromString (String v) {
        int s0 = v.indexOf(',', 1);
        int s1 = v.indexOf(',', s0 + 1);
        int s2 = v.indexOf(',', s1 + 1);
        if (s0 != -1 && s1 != -1  && s2 != -1 && v.charAt(0) == '(' && v.charAt(v.length() - 1) == ')') {
            int x = Integer.parseInt(v.substring(1, s0));
            int y = Integer.parseInt(v.substring(s0 + 1, s1));
            int z = Integer.parseInt(v.substring(s1 + 1, s2));
            int w = Integer.parseInt(v.substring(s2 + 1, v.length() - 1));
            return this.set(x, y, z, w);
        }
        throw new IllegalArgumentException("Not a valid format for a PointI4: " + v);
    }

}