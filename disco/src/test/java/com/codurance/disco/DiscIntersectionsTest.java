package com.codurance.disco;

import org.junit.*;
import static org.junit.Assert.*;

public class DiscIntersectionsTest {
    private DiscIntersections discIntersections;

    @Before
    public void setUp() {
        discIntersections = new DiscIntersections();

    }

    @Test
    public void should_return_minus_1_for_null_array() {
        assertEquals(-1, discIntersections.calculate(createDiscs()));
    }

    @Test
    public void should_return_0_for_one_disc() {
        assertEquals(0, discIntersections.calculate(createDiscs(10)));
    }

    private int[] createDiscs(int... radiusMeltdown){
        return radiusMeltdown;
    }
}
