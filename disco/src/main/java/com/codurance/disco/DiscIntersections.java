package com.codurance.disco;

public class DiscIntersections {
    public int calculate(int[] discs) {
        return isEmpty(discs) ? -1:0;
    }

    private boolean isEmpty(int[] discs) {
        return discs == null || discs.length == 0;
    }
}
