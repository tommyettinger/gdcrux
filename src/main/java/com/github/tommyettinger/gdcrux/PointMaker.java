package com.github.tommyettinger.gdcrux;

import com.github.tommyettinger.crux.PointN;
import com.github.tommyettinger.crux.PointPair;

/**
 * Utility class for constructing the various {@link PointN} types using types inferred from the parameter types.
 * This is meant to be statically imported, so you can call {@link #pt} with {@code PointI2 grid = pt(1, 2);} or
 * {@code PointF3 = pt(1f, 2f, 3f);} . You can also create {@link PointPair} objects with this in a similar way, just
 * using twice as many parameters for {@link #pair}.
 */
public final class PointMaker {
    private PointMaker() {
    }

    /**
     * Creates a {@link PointI2} from the given ints, x and y.
     * @param x x-coordinate, as an int
     * @param y y-coordinate, as an int
     * @return a new {@link PointI2}
     */
    public static PointI2 pt(int x, int y) {
        return new PointI2(x, y);
    }

    /**
     * Creates a {@link PointI3} from the given ints, x, y, and z.
     * @param x x-coordinate, as an int
     * @param y y-coordinate, as an int
     * @param z z-coordinate, as an int
     * @return a new {@link PointI3}
     */
    public static PointI3 pt(int x, int y, int z) {
        return new PointI3(x, y, z);
    }

    /**
     * Creates a {@link PointI4} from the given ints, x, y, z, and w.
     * @param x x-coordinate, as an int
     * @param y y-coordinate, as an int
     * @param z z-coordinate, as an int
     * @param w w-coordinate, as an int
     * @return a new {@link PointI4}
     */
    public static PointI4 pt(int x, int y, int z, int w) {
        return new PointI4(x, y, z, w);
    }

    /**
     * Creates a {@link PointI5} from the given ints, x, y, z, w, and u.
     * @param x x-coordinate, as an int
     * @param y y-coordinate, as an int
     * @param z z-coordinate, as an int
     * @param w w-coordinate, as an int
     * @param u u-coordinate, as an int
     * @return a new {@link PointI5}
     */
    public static PointI5 pt(int x, int y, int z, int w, int u) {
        return new PointI5(x, y, z, w, u);
    }

    /**
     * Creates a {@link PointI6} from the given ints, x, y, z, w, u, v.
     * @param x x-coordinate, as an int
     * @param y y-coordinate, as an int
     * @param z z-coordinate, as an int
     * @param w w-coordinate, as an int
     * @param u u-coordinate, as an int
     * @param v v-coordinate, as an int
     * @return a new {@link PointI6}
     */
    public static PointI6 pt(int x, int y, int z, int w, int u, int v) {
        return new PointI6(x, y, z, w, u, v);
    }

    /**
     * Creates a {@link PointF2} from the given floats, x and y.
     * @param x x-coordinate, as a float
     * @param y y-coordinate, as a float
     * @return a new {@link PointF2}
     */
    public static PointF2 pt(float x, float y) {
        return new PointF2(x, y);
    }

    /**
     * Creates a {@link PointF3} from the given floats, x, y, and z.
     * @param x x-coordinate, as a float
     * @param y y-coordinate, as a float
     * @param z z-coordinate, as a float
     * @return a new {@link PointF3}
     */
    public static PointF3 pt(float x, float y, float z) {
        return new PointF3(x, y, z);
    }

    /**
     * Creates a {@link PointF4} from the given floats, x, y, z, and w.
     * @param x x-coordinate, as a float
     * @param y y-coordinate, as a float
     * @param z z-coordinate, as a float
     * @param w w-coordinate, as a float
     * @return a new {@link PointF4}
     */
    public static PointF4 pt(float x, float y, float z, float w) {
        return new PointF4(x, y, z, w);
    }

    /**
     * Creates a {@link PointF5} from the given floats, x, y, z, w, and u.
     * @param x x-coordinate, as a float
     * @param y y-coordinate, as a float
     * @param z z-coordinate, as a float
     * @param w w-coordinate, as a float
     * @param u u-coordinate, as a float
     * @return a new {@link PointF5}
     */
    public static PointF5 pt(float x, float y, float z, float w, float u) {
        return new PointF5(x, y, z, w, u);
    }

    /**
     * Creates a {@link PointF6} from the given floats, x, y, z, w, u, v.
     * @param x x-coordinate, as a float
     * @param y y-coordinate, as a float
     * @param z z-coordinate, as a float
     * @param w w-coordinate, as a float
     * @param u u-coordinate, as a float
     * @param v v-coordinate, as a float
     * @return a new {@link PointF6}
     */
    public static PointF6 pt(float x, float y, float z, float w, float u, float v) {
        return new PointF6(x, y, z, w, u, v);
    }

    /**
     * Creates a {@link PointPair} of {@link PointI2} from the given ints for point A and then for point B.
     * @param xA x-coordinate for point A, as an int
     * @param yA y-coordinate for point A, as an int
     * @param xB x-coordinate for point B, as an int
     * @param yB y-coordinate for point B, as an int
     * @return a new {@link PointPair} of {@link PointI2}
     */
    public static PointPair<PointI2> pair(int xA, int yA, int xB, int yB) {
        return new PointPair<>(pt(xA, yA), pt(xB, yB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointI3} from the given ints for point A and then for point B.
     * @param xA x-coordinate for point A, as an int
     * @param yA y-coordinate for point A, as an int
     * @param zA z-coordinate for point A, as an int
     * @param xB x-coordinate for point B, as an int
     * @param yB y-coordinate for point B, as an int
     * @param zB z-coordinate for point B, as an int
     * @return a new {@link PointPair} of {@link PointI3}
     */
    public static PointPair<PointI3> pair(int xA, int yA, int zA, int xB, int yB, int zB) {
        return new PointPair<>(pt(xA, yA, zA), pt(xB, yB, zB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointI4} from the given ints for point A and then for point B.
     * @param xA x-coordinate for point A, as an int
     * @param yA y-coordinate for point A, as an int
     * @param zA z-coordinate for point A, as an int
     * @param wA w-coordinate for point A, as an int
     * @param xB x-coordinate for point B, as an int
     * @param yB y-coordinate for point B, as an int
     * @param zB z-coordinate for point B, as an int
     * @param wB w-coordinate for point B, as an int
     * @return a new {@link PointPair} of {@link PointI4}
     */
    public static PointPair<PointI4> pair(int xA, int yA, int zA, int wA, int xB, int yB, int zB, int wB) {
        return new PointPair<>(pt(xA, yA, zA, wA), pt(xB, yB, zB, wB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointI5} from the given ints for point A and then for point B.
     * @param xA x-coordinate for point A, as an int
     * @param yA y-coordinate for point A, as an int
     * @param zA z-coordinate for point A, as an int
     * @param wA w-coordinate for point A, as an int
     * @param uA u-coordinate for point A, as an int
     * @param xB x-coordinate for point B, as an int
     * @param yB y-coordinate for point B, as an int
     * @param zB z-coordinate for point B, as an int
     * @param wB w-coordinate for point B, as an int
     * @param uB u-coordinate for point B, as an int
     * @return a new {@link PointPair} of {@link PointI5}
     */
    public static PointPair<PointI5> pair(int xA, int yA, int zA, int wA, int uA,
                                          int xB, int yB, int zB, int wB, int uB) {
        return new PointPair<>(pt(xA, yA, zA, wA, uA), pt(xB, yB, zB, wB, uB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointI6} from the given ints for point A and then for point B.
     * @param xA x-coordinate for point A, as an int
     * @param yA y-coordinate for point A, as an int
     * @param zA z-coordinate for point A, as an int
     * @param wA w-coordinate for point A, as an int
     * @param uA u-coordinate for point A, as an int
     * @param vA v-coordinate for point A, as an int
     * @param xB x-coordinate for point B, as an int
     * @param yB y-coordinate for point B, as an int
     * @param zB z-coordinate for point B, as an int
     * @param wB w-coordinate for point B, as an int
     * @param uB u-coordinate for point B, as an int
     * @param vB v-coordinate for point B, as an int
     * @return a new {@link PointPair} of {@link PointI6}
     */
    public static PointPair<PointI6> pair(int xA, int yA, int zA, int wA, int uA, int vA,
                                          int xB, int yB, int zB, int wB, int uB, int vB) {
        return new PointPair<>(pt(xA, yA, zA, wA, uA, vA), pt(xB, yB, zB, wB, uB, vB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointF2} from the given floats for point A and then for point B.
     * @param xA x-coordinate for point A, as a float
     * @param yA y-coordinate for point A, as a float
     * @param xB x-coordinate for point B, as a float
     * @param yB y-coordinate for point B, as a float
     * @return a new {@link PointPair} of {@link PointF2}
     */
    public static PointPair<PointF2> pair(float xA, float yA, float xB, float yB) {
        return new PointPair<>(pt(xA, yA), pt(xB, yB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointF3} from the given floats for point A and then for point B.
     * @param xA x-coordinate for point A, as a float
     * @param yA y-coordinate for point A, as a float
     * @param zA z-coordinate for point A, as a float
     * @param xB x-coordinate for point B, as a float
     * @param yB y-coordinate for point B, as a float
     * @param zB z-coordinate for point B, as a float
     * @return a new {@link PointPair} of {@link PointF2}
     */
    public static PointPair<PointF3> pair(float xA, float yA, float zA, float xB, float yB, float zB) {
        return new PointPair<>(pt(xA, yA, zA), pt(xB, yB, zB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointF4} from the given floats for point A and then for point B.
     * @param xA x-coordinate for point A, as a float
     * @param yA y-coordinate for point A, as a float
     * @param zA z-coordinate for point A, as a float
     * @param wA w-coordinate for point A, as a float
     * @param xB x-coordinate for point B, as a float
     * @param yB y-coordinate for point B, as a float
     * @param zB z-coordinate for point B, as a float
     * @param wB w-coordinate for point B, as a float
     * @return a new {@link PointPair} of {@link PointF4}
     */
    public static PointPair<PointF4> pair(float xA, float yA, float zA, float wA, float xB, float yB, float zB, float wB) {
        return new PointPair<>(pt(xA, yA, zA, wA), pt(xB, yB, zB, wB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointF5} from the given floats for point A and then for point B.
     * @param xA x-coordinate for point A, as a float
     * @param yA y-coordinate for point A, as a float
     * @param zA z-coordinate for point A, as a float
     * @param wA w-coordinate for point A, as a float
     * @param uA u-coordinate for point A, as a float
     * @param xB x-coordinate for point B, as a float
     * @param yB y-coordinate for point B, as a float
     * @param zB z-coordinate for point B, as a float
     * @param wB w-coordinate for point B, as a float
     * @param uB u-coordinate for point B, as a float
     * @return a new {@link PointPair} of {@link PointF5}
     */
    public static PointPair<PointF5> pair(float xA, float yA, float zA, float wA, float uA,
                                          float xB, float yB, float zB, float wB, float uB) {
        return new PointPair<>(pt(xA, yA, zA, wA, uA), pt(xB, yB, zB, wB, uB));
    }

    /**
     * Creates a {@link PointPair} of {@link PointF6} from the given floats for point A and then for point B.
     * @param xA x-coordinate for point A, as a float
     * @param yA y-coordinate for point A, as a float
     * @param zA z-coordinate for point A, as a float
     * @param wA w-coordinate for point A, as a float
     * @param uA u-coordinate for point A, as a float
     * @param vA v-coordinate for point A, as a float
     * @param xB x-coordinate for point B, as a float
     * @param yB y-coordinate for point B, as a float
     * @param zB z-coordinate for point B, as a float
     * @param wB w-coordinate for point B, as a float
     * @param uB u-coordinate for point B, as a float
     * @param vB v-coordinate for point B, as a float
     * @return a new {@link PointPair} of {@link PointF6}
     */
    public static PointPair<PointF6> pair(float xA, float yA, float zA, float wA, float uA, float vA,
                                          float xB, float yB, float zB, float wB, float uB, float vB) {
        return new PointPair<>(pt(xA, yA, zA, wA, uA, vA), pt(xB, yB, zB, wB, uB, vB));
    }
}
