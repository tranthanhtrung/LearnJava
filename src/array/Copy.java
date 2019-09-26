package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Copy {

    public static int[] copy(final int[] arr) {
        if (arr == null) {
            return null;
        }

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, copy(null), "Must return null with null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, copy(new int[]{}), "Must return empty array with empty array");
    }

    @Test
    void testRandomArray() {
        assertArrayEquals(new int[]{2}, copy(new int[]{2}), "Test random array");
        assertArrayEquals(new int[]{2,2,-3,4}, copy(new int[]{2,2,-3,4}), "Test random array");
        assertArrayEquals(new int[]{1,2,3,4,5}, copy(new int[]{1,2,3,4,5}), "Test random array");
    }
}
