package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Reverse {

    public static int[] reverse(final int[] arr) {
        if (arr == null) {
            return null;
        }

        int[] result = new int[arr.length];
        int tmp;
        for (int i = 0; i < arr.length/2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, reverse(null), "Must return null with null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, reverse(new int[]{}), "Must return empty with empty array");
    }

    @Test
    void testOddArray() {
        assertArrayEquals(new int[]{1}, reverse(new int[]{1}), "Must return null with null array");
        assertArrayEquals(new int[]{1,2,3,4,5}, reverse(new int[]{5,4,3,2,1}), "Must return null with null array");
        assertArrayEquals(new int[]{1,2,3,4,3,2,1}, reverse(new int[]{1,2,3,4,3,2,1}), "Must return null with null array");
    }

    @Test
    void testEvanArray() {
        assertArrayEquals(new int[]{4,5}, reverse(new int[]{5,4}), "Must return null with null array");
        assertArrayEquals(new int[]{4,5,6,7}, reverse(new int[]{7,6,5,4}), "Must return null with null array");
    }
}
