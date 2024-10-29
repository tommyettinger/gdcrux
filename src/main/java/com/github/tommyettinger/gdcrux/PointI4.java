package com.github.tommyettinger.gdcrux;

import com.badlogic.gdx.math.Vector4;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;
import com.github.tommyettinger.crux.Point4;
import com.github.tommyettinger.crux.Point5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import static com.badlogic.gdx.math.MathUtils.round;

public class PointI4 implements Point4<PointI4>, Json.Serializable, Externalizable {

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

    public PointI4(Vector4 p) {
        this(round(p.x), round(p.y), round(p.z), round(p.w));
    }

    public PointI4(PointI4 p) {
        this(p.x, p.y, p.z, p.w);
    }

    public PointI4(Point4<? extends Point4<?>> p) {
        this(p.xi(), p.yi(), p.zi(), p.zi());
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
    public PointI4 seti(int ix, int iy, int iz, int iw) {
        x = ix;
        y = iy;
        z = iz;
        w = iw;
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

    @SuppressWarnings("lossy-conversions")
    public PointI4 scl(Point4<?> pt) {
        x *= pt.x();
        y *= pt.y();
        z *= pt.z();
        w *= pt.w();
        return this;
    }

    @SuppressWarnings("lossy-conversions")
    public PointI4 scl(float value) {
        x *= value;
        y *= value;
        z *= value;
        w *= value;
        return this;
    }

    @SuppressWarnings("lossy-conversions")
    public PointI4 scl(float ox, float oy, float oz, float ow) {
        x *= ox;
        y *= oy;
        z *= oz;
        w *= ow;
        return this;
    }

    public PointI4 mul(Point4<?> pt) {
        return scl(pt);
    }

    public PointI4 mul(float value) {
        return scl(value);
    }

    public PointI4 mul(float ox, float oy, float oz, float ow) {
        return scl(ox, oy, oz, ow);
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

    /**
     * Gets the component at the specified index.
     * Kotlin-compatible using square-bracket indexing.
     * @param index which component to get, in order
     * @return the component
     */
    @SuppressWarnings("DefaultNotLastCaseInSwitch")
    public int get (int index) {
        switch (index){
            default: return x;
            case 1 : return y;
            case 2 : return z;
            case 3 : return w;
        }
    }

    /**
     * Sets the component at the specified index to the specified value.
     * Kotlin-compatible using square-bracket indexing with assignment.
     * @param index which component to set, in order
     * @param value the value to assign at index
     * @return this, for chaining
     */
    @SuppressWarnings("DefaultNotLastCaseInSwitch")
    public PointI4 set(int index, int value){
        switch (index){
            default: x = value;
            case 1 : y = value;
            case 2 : z = value;
            case 3 : w = value;
        }
        return this;
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

    @GwtIncompatible
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(x);
        out.writeInt(y);
        out.writeInt(z);
        out.writeInt(w);
    }

    @GwtIncompatible
    public void readExternal(ObjectInput in) throws IOException {
        x = in.readInt();
        y = in.readInt();
        z = in.readInt();
        w = in.readInt();
    }

    /** Converts this {@code PointI4} to a string in the format {@code (x,y,z,w)}.
     * @return a string representation of this object. */
    @Override
    public String toString () {
        return "(" + x + "," + y + "," + z + "," + w + ")";
    }

    /** Sets this {@code PointI4} to the value represented by the specified string according to the format of {@link #toString()}.
     * @param s the string.
     * @return this vector for chaining */
    public PointI4 fromString (String s) {
        int s0 = s.indexOf(',', 1);
        int s1 = s.indexOf(',', s0 + 1);
        int s2 = s.indexOf(',', s1 + 1);
        if (s0 != -1 && s1 != -1  && s2 != -1 && s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            int x = Integer.parseInt(s.substring(1, s0));
            int y = Integer.parseInt(s.substring(s0 + 1, s1));
            int z = Integer.parseInt(s.substring(s1 + 1, s2));
            int w = Integer.parseInt(s.substring(s2 + 1, s.length() - 1));
            return this.set(x, y, z, w);
        }
        throw new IllegalArgumentException("Not a valid format for a PointI4: " + s);
    }

}
