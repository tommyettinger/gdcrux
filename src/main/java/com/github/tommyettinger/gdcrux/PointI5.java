package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.github.tommyettinger.crux.Point5;

import static com.badlogic.gdx.math.MathUtils.round;

public class PointI5 implements Point5<PointI5>, Json.Serializable {

    public int x, y, z, w, u;

    public PointI5() {
        super();
    }

    public PointI5(int x, int y, int z, int w, int u) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.u = u;
    }

    public PointI5(float x, float y, float z, float w, float u) {
        this(round(x), round(y), round(z), round(w), round(u));
    }

    public PointI5(PointI5 p) {
        this(p.x, p.y, p.z, p.w, p.u);
    }

    public PointI5(Point5<? extends Point5<?>> p) {
        this(p.xi(), p.yi(), p.zi(), p.zi(), p.ui());
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public PointI5 x(float f) {
        x = round(f);
        return this;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public PointI5 y(float f) {
        y = round(f);
        return this;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public PointI5 z(float f) {
        z = round(f);
        return this;
    }

    @Override
    public float w() {
        return w;
    }

    @Override
    public PointI5 w(float f) {
        w = round(f);
        return this;
    }

    @Override
    public float u() {
        return u;
    }

    @Override
    public PointI5 u(float f) {
        u = round(f);
        return this;
    }

    @Override
    public int xi() {
        return x;
    }

    @Override
    public PointI5 xi(int next) {
        x = next;
        return this;
    }

    @Override
    public int yi() {
        return y;
    }

    @Override
    public PointI5 yi(int next) {
        y = next;
        return this;
    }

    @Override
    public int zi() {
        return z;
    }

    @Override
    public PointI5 zi(int next) {
        z = next;
        return this;
    }

    @Override
    public int wi() {
        return w;
    }

    @Override
    public PointI5 wi(int next) {
        w = next;
        return this;
    }

    @Override
    public int ui() {
        return u;
    }

    @Override
    public PointI5 ui(int next) {
        u = next;
        return this;
    }

    @Override
    public PointI5 set(float fx, float fy, float fz, float fw, float fu) {
        x = round(fx);
        y = round(fy);
        z = round(fz);
        w = round(fw);
        u = round(fu);
        return this;
    }

    @Override
    public PointI5 seti(int ix, int iy, int iz, int iw, int iu) {
        x = ix;
        y = iy;
        z = iz;
        w = iw;
        u = iu;
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
    public PointI5 cpy() {
        return new PointI5(x, y, z, w, u);
    }

    @Override
    public float len2() {
        return (float) x * x + y * y + z * z + w * w + u * u;
    }

    @Override
    public PointI5 set(PointI5 pt) {
        x = pt.x;
        y = pt.y;
        z = pt.z;
        w = pt.w;
        u = pt.u;
        return this;
    }

    @Override
    public PointI5 setZero() {
        x = y = z = w = u = 0;
        return this;
    }

    @Override
    public PointI5 sub(PointI5 pt) {
        x -= pt.x;
        y -= pt.y;
        z -= pt.z;
        w -= pt.w;
        u -= pt.u;
        return this;
    }

    public PointI5 sub(int ox, int oy, int oz, int ow, int ou) {
        x -= ox;
        y -= oy;
        z -= oz;
        w -= ow;
        u -= ou;
        return this;
    }

    public PointI5 sub(int value) {
        x -= value;
        y -= value;
        z -= value;
        w -= value;
        u -= value;
        return this;
    }

    @Override
    public PointI5 add(PointI5 pt) {
        x += pt.x;
        y += pt.y;
        z += pt.z;
        w += pt.w;
        u += pt.u;
        return this;
    }

    public PointI5 add(int ox, int oy, int oz, int ow, int ou) {
        x += ox;
        y += oy;
        z += oz;
        w += ow;
        u += ou;
        return this;
    }

    public PointI5 add(int value) {
        x += value;
        y += value;
        z += value;
        w += value;
        u += value;
        return this;
    }

    @Override
    public PointI5 scl(PointI5 pt) {
        x *= pt.x;
        y *= pt.y;
        z *= pt.z;
        w *= pt.w;
        u *= pt.u;
        return this;
    }

    public PointI5 scl(int value) {
        x *= value;
        y *= value;
        z *= value;
        w *= value;
        u *= value;
        return this;
    }

    public PointI5 scl(int ox, int oy, int oz, int ow, int ou) {
        x *= ox;
        y *= oy;
        z *= oz;
        w *= ow;
        u *= ou;
        return this;
    }

    @Override
    public float dst2(PointI5 pt) {
        float x = pt.x - this.x;
        float y = pt.y - this.y;
        float z = pt.z - this.z;
        float w = pt.w - this.w;
        float u = pt.u - this.u;
        return x * x + y * y + z * z + w * w + u * u;
    }

    public float dst2(int ox, int oy, int oz, int ow, int ou) {
        float x = ox - this.x;
        float y = oy - this.y;
        float z = oz - this.z;
        float w = ow - this.w;
        float u = ou - this.u;
        return x * x + y * y + z * z + w * w + u * u;
    }

    public float dst(int ox, int oy, int oz, int ow, int ou) {
        return (float) Math.sqrt(dst2(ox, oy, oz, ow, ou));
    }

    @Override
    public void write(Json json) {
        json.writeValue("x", x, int.class);
        json.writeValue("y", y, int.class);
        json.writeValue("z", z, int.class);
        json.writeValue("w", w, int.class);
        json.writeValue("u", u, int.class);
    }

    @Override
    public void read(Json json, JsonValue jsonData) {
        this.x = jsonData.getInt("x");
        this.y = jsonData.getInt("y");
        this.z = jsonData.getInt("z");
        this.w = jsonData.getInt("w");
        this.u = jsonData.getInt("u");
    }

    /** Converts this {@code PointI5} to a string in the format {@code (x,y,z,w,u)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + "," + w + "," + u + ")";
    }

    /** Sets this {@code PointI5} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointI5 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        int s1 = s.indexOf(',', s0 + 1);
        int s2 = s.indexOf(',', s1 + 1);
        int s3 = s.indexOf(',', s2 + 1);
        if (s0 != -1 && s1 != -1 && s2 != -1 && s3 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            int x = Integer.parseInt(s.substring(1, s0));
            int y = Integer.parseInt(s.substring(s0 + 1, s1));
            int z = Integer.parseInt(s.substring(s1 + 1, s2));
            int w = Integer.parseInt(s.substring(s2 + 1, s3));
            int u = Integer.parseInt(s.substring(s3 + 1, s.length() - 1));
            return this.set(x, y, z, w, u);
        }
        throw new IllegalArgumentException("Not a valid format for a PointI5: " + s);
    }

}