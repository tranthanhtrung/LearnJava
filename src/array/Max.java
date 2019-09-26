package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Max {

    public static int max(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    @Test
    void testNullArray() {
        assertEquals(0, max(null), "Must return 0 with null array");
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, max(new int[]{}), "Must return 0 with empty array");
    }

    @Test
    void testRandomArray() {
        assertEquals(0, max(new int[]{0}), "Test random array");
        assertEquals(0, max(new int[]{0,-1,-3,-4}), "Test random array");
        assertEquals(8, max(new int[]{1,3,6,8}), "Test random array");
        assertEquals(9, max(new int[]{-1,5,9,0,-10}), "Test random array");
    }
}
