package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinMax {

    public static int[] minMax(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{0,0};
        }

        int[] minMax = new int[]{arr[0], arr[0]};
        for (int i = 1; i < arr.length; i++) {
            if (minMax[0] > arr[i]) {
                minMax[0] = arr[i];
            }
            if (minMax[1] < arr[i]) {
                minMax[1] = arr[i];
            }
        }

        return minMax;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(new int[]{0,0}, minMax(null), "Must return 0 with null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{0,0}, minMax(new int[]{}), "Must return 0 with empty array");
    }

    @Test
    void testRandomArray() {
        assertArrayEquals(new int[]{0, 0}, minMax(new int[]{0}), "Test random array");
        assertArrayEquals(new int[]{-4, 0}, minMax(new int[]{0, -1, -3, -4}), "Test random array");
        assertArrayEquals(new int[]{1, 8}, minMax(new int[]{1, 3, 6, 8}), "Test random array");
        assertArrayEquals(new int[]{-10, 9}, minMax(new int[]{-1, 5, 9, 0, -10}), "Test random array");
    }
}
