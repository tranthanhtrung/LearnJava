package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NonZero {

    public static int[] nonZero(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        if (count == 0) {
            return new int[]{};
        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, nonZero(null));
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, nonZero(new int[]{}));
    }

    @Test
    void testRandomArray() {
        assertArrayEquals(new int[]{}, nonZero(new int[]{0}));
        assertArrayEquals(new int[]{1}, nonZero(new int[]{1}));
        assertArrayEquals(new int[]{10}, nonZero(new int[]{10}));
        assertArrayEquals(new int[]{}, nonZero(new int[]{0, 0, 0, 0}));
        assertArrayEquals(new int[]{1, 3, 4, 10}, nonZero(new int[]{1, 3, 4, 10}));
        assertArrayEquals(new int[]{1, 3, 4, 10}, nonZero(new int[]{1, 3, 0, 4, 10, 0}));
    }
}
