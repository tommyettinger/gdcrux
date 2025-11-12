package com.github.tommyettinger.gdcrux;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {
    @Test
    public void testPointF2ToString () {
        assertEquals("(-5.0,42.00055)", new PointF2(-5f, 42.00055f).toString());
    }

    @Test
    public void testPointF2FromString () {
        assertEquals(new PointF2(-5f, 42.00055f), new PointF2().fromString("(-5,42.00055)"));
    }

    @Test
    public void testPointF3ToString () {
        assertEquals("(-5.0,42.00055,44444.32)", new PointF3(-5f, 42.00055f, 44444.32f).toString());
    }

    @Test
    public void testPointF3FromString () {
        assertEquals(new PointF3(-5f, 42.00055f, 44444.32f), new PointF3().fromString("(-5,42.00055,44444.32)"));
    }

    @Test
    public void testPointF4ToString () {
        assertEquals("(-5.0,42.00055,44444.32,-1.975)", new PointF4(-5f, 42.00055f, 44444.32f, -1.975f).toString());
    }

    @Test
    public void testPointF4FromString () {
        assertEquals(new PointF4(-5f, 42.00055f, 44444.32f, -1.975f), new PointF4().fromString("(-5,42.00055,44444.32,-1.9750)"));
    }

    @Test
    public void testPointF5ToString () {
        assertEquals("(-5.0,42.00055,44444.32,-1.975,-0.1)", new PointF5(-5f, 42.00055f, 44444.32f, -1.975f, -0.1f).toString());
    }

    @Test
    public void testPointF5FromString () {
        assertEquals(new PointF5(-5f, 42.00055f, 44444.32f, -1.975f, -0.1f), new PointF5().fromString("(-5,42.00055,44444.32,-1.9750,-0.1)"));
    }

    @Test
    public void testPointF6ToString () {
        assertEquals("(-5.0,42.00055,44444.32,-1.975,-0.1,1337.0)", new PointF6(-5f, 42.00055f, 44444.32f, -1.975f, -0.1f, 1337.0f).toString());
    }

    @Test
    public void testPointF6FromString () {
        assertEquals(new PointF6(-5f, 42.00055f, 44444.32f, -1.975f, -0.1f, 1337.0f), new PointF6().fromString("(-5,42.00055,44444.32,-1.9750,-0.1,1337.0)"));
    }
    @Test
    public void testPointI2ToString () {
        assertEquals("(-5,42)", new PointI2(-5, 42).toString());
    }

    @Test
    public void testPointI2FromString () {
        assertEquals(new PointI2(-5, 42), new PointI2().fromString("(-5,42)"));
    }

    @Test
    public void testPointI3ToString () {
        assertEquals("(-5,42,44444)", new PointI3(-5, 42, 44444).toString());
    }

    @Test
    public void testPointI3FromString () {
        assertEquals(new PointI3(-5, 42, 44444), new PointI3().fromString("(-5,42,44444)"));
    }

    @Test
    public void testPointI4ToString () {
        assertEquals("(-5,42,44444,-1975)", new PointI4(-5, 42, 44444, -1975).toString());
    }

    @Test
    public void testPointI4FromString () {
        assertEquals(new PointI4(-5, 42, 44444, -1975), new PointI4().fromString("(-5,42,44444,-1975)"));
    }

    @Test
    public void testPointI5ToString () {
        assertEquals("(-5,42,44444,-1975,-1)", new PointI5(-5, 42, 44444, -1975, -1).toString());
    }

    @Test
    public void testPointI5FromString () {
        assertEquals(new PointI5(-5, 42, 44444, -1975, -1), new PointI5().fromString("(-5,42,44444,-1975,-1)"));
    }

    @Test
    public void testPointI6ToString () {
        assertEquals("(-5,42,44444,-1975,-1,1337)", new PointI6(-5, 42, 44444, -1975, -1, 1337).toString());
    }

    @Test
    public void testPointI6FromString () {
        assertEquals(new PointI6(-5, 42, 44444, -1975, -1, 1337), new PointI6().fromString("(-5,42,44444,-1975,-1,1337)"));
    }
}
