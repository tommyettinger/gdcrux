package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.github.tommyettinger.crux.Point6;

import static com.badlogic.gdx.math.MathUtils.round;

public class PointI6 implements Point6<PointI6>, Json.Serializable {

    public int x, y, z, w, u, v;

    public PointI6() {
        super();
    }

    public PointI6(int x, int y, int z, int w, int u, int v) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.u = u;
        this.v = v;
    }

    public PointI6(float x, float y, float z, float w, float u, float v) {
        this(round(x), round(y), round(z), round(w), round(u), round(v));
    }

    public PointI6(PointI6 p) {
        this(p.x, p.y, p.z, p.w, p.u, p.v);
    }

    public PointI6(Point6<? extends Point6<?>> p) {
        this(p.xi(), p.yi(), p.zi(), p.zi(), p.ui(), p.vi());
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointI6 x(float f) {
        x = round(f);
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointI6 y(float f) {
        y = round(f);
        return this;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public PointI6 z(float f) {
        z = round(f);
        return this;
    }

    @Override
    public float w() {
        return w;
    }

    @Override
    public PointI6 w(float f) {
        w = round(f);
        return this;
    }

    @Override
    public float u() {
        return u;
    }

    @Override
    public PointI6 u(float f) {
        u = round(f);
        return this;
    }

    @Override
    public float v() {
        return v;
    }

    @Override
    public PointI6 v(float f) {
        v = round(f);
        return this;
    }

    @Override
    public int xi() {
        return x;
    }

    @Override
    public PointI6 xi(int next) {
        x = next;
        return this;
    }

    @Override
    public int yi() {
        return y;
    }

    @Override
    public PointI6 yi(int next) {
        y = next;
        return this;
    }

    @Override
    public int zi() {
        return z;
    }

    @Override
    public PointI6 zi(int next) {
        z = next;
        return this;
    }

    @Override
    public int wi() {
        return w;
    }

    @Override
    public PointI6 wi(int next) {
        w = next;
        return this;
    }

    @Override
    public int ui() {
        return u;
    }

    @Override
    public PointI6 ui(int next) {
        u = next;
        return this;
    }

    @Override
    public int vi() {
        return v;
    }

    @Override
    public PointI6 vi(int next) {
        v = next;
        return this;
    }

    @Override
    public PointI6 set(float fx, float fy, float fz, float fw, float fu, float fv) {
        x = round(fx);
        y = round(fy);
        z = round(fz);
        w = round(fw);
        u = round(fu);
        v = round(fv);
        return this;
    }

    @Override
    public PointI6 seti(int ix, int iy, int iz, int iw, int iu, int iv) {
        x = ix;
        y = iy;
        z = iz;
        w = iw;
        u = iu;
        v = iv;
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
    public PointI6 cpy() {
        return new PointI6(x, y, z, w, u, v);
    }

    @Override
    public float len2() {
        return (float) x * x + y * y + z * z + w * w + u * u + v * v;
    }

    @Override
    public PointI6 set(PointI6 pt) {
        x = pt.x;
        y = pt.y;
        z = pt.z;
        w = pt.w;
        u = pt.u;
        v = pt.v;
        return this;
    }

    @Override
    public PointI6 setZero() {
        x = y = z = w = u = v = 0;
        return this;
    }

    @Override
    public PointI6 sub(PointI6 pt) {
        x -= pt.x;
        y -= pt.y;
        z -= pt.z;
        w -= pt.w;
        u -= pt.u;
        v -= pt.v;
        return this;
    }

    public PointI6 sub(int ox, int oy, int oz, int ow, int ou, int ov) {
        x -= ox;
        y -= oy;
        z -= oz;
        w -= ow;
        u -= ou;
        v -= ov;
        return this;
    }

    public PointI6 sub(int value) {
        x -= value;
        y -= value;
        z -= value;
        w -= value;
        u -= value;
        v -= value;
        return this;
    }

    @Override
    public PointI6 add(PointI6 pt) {
        x += pt.x;
        y += pt.y;
        z += pt.z;
        w += pt.w;
        u += pt.u;
        v += pt.v;
        return this;
    }

    public PointI6 add(int ox, int oy, int oz, int ow, int ou, int ov) {
        x += ox;
        y += oy;
        z += oz;
        w += ow;
        u += ou;
        v += ov;
        return this;
    }

    public PointI6 add(int value) {
        x += value;
        y += value;
        z += value;
        w += value;
        u += value;
        v += value;
        return this;
    }

    @Override
    public PointI6 scl(PointI6 pt) {
        x *= pt.x;
        y *= pt.y;
        z *= pt.z;
        w *= pt.w;
        u *= pt.u;
        v *= pt.v;
        return this;
    }

    public PointI6 scl(int value) {
        x *= value;
        y *= value;
        z *= value;
        w *= value;
        u *= value;
        v *= value;
        return this;
    }

    public PointI6 scl(int ox, int oy, int oz, int ow, int ou, int ov) {
        x *= ox;
        y *= oy;
        z *= oz;
        w *= ow;
        u *= ou;
        v *= ov;
        return this;
    }

    @Override
    public float dst2(PointI6 pt) {
        float x = pt.x - this.x;
        float y = pt.y - this.y;
        float z = pt.z - this.z;
        float w = pt.w - this.w;
        float u = pt.u - this.u;
        float v = pt.v - this.v;
        return x * x + y * y + z * z + w * w + u * u + v * v;
    }

    public float dst2(int ox, int oy, int oz, int ow, int ou, int ov) {
        float x = ox - this.x;
        float y = oy - this.y;
        float z = oz - this.z;
        float w = ow - this.w;
        float u = ou - this.u;
        float v = ov - this.v;
        return x * x + y * y + z * z + w * w + u * u + v * v;
    }

    public float dst(int ox, int oy, int oz, int ow, int ou, int ov) {
        return (float) Math.sqrt(dst2(ox, oy, oz, ow, ou, ov));
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, int.class);
        json.writeValue("y", y, int.class);
        json.writeValue("z", z, int.class);
        json.writeValue("w", w, int.class);
        json.writeValue("u", u, int.class);
        json.writeValue("v", v, int.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getInt("x");
        this.y = jsonData.getInt("y");
        this.z = jsonData.getInt("z");
        this.w = jsonData.getInt("w");
        this.u = jsonData.getInt("u");
        this.v = jsonData.getInt("v");
    }

    /** Converts this {@code PointI6} to a string in the format {@code (x,y,z,w,u,v)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + "," + w + "," + u + "," + v + ")";
    }

    /** Sets this {@code PointI6} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointI6 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        int s1 = s.indexOf(',', s0 + 1);
        int s2 = s.indexOf(',', s1 + 1);
        int s3 = s.indexOf(',', s2 + 1);
        int s4 = s.indexOf(',', s3 + 1);
        if (s0 != -1 && s1 != -1 && s2 != -1 && s3 != -1 && s4 != -1
                && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            int x = Integer.parseInt(s.substring(1, s0));
            int y = Integer.parseInt(s.substring(s0 + 1, s1));
            int z = Integer.parseInt(s.substring(s1 + 1, s2));
            int w = Integer.parseInt(s.substring(s2 + 1, s3));
            int u = Integer.parseInt(s.substring(s3 + 1, s4));
            int v = Integer.parseInt(s.substring(s4 + 1, s.length() - 1));
            return this.set(x, y, z, w, u, v);
        }
        throw new IllegalArgumentException("Not a valid format for a PointI6: " + s);
    }

}
