package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PairElement {

    public static int[][] pairElement(final int value, final int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int countPair = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    countPair++;
                    continue;
                }
            }
        }

        if (countPair == 0) {
            return null;
        }

        int[][] result = new int[countPair][2];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    result[index][0] = arr[i];
                    result[index][1] = arr[j];
                    index++;
                    continue;
                }
            }
        }

        return result;
    }

    @Test
    void testNullArray() {
        assertEquals(null, pairElement(10, null), "Return null with null array");
    }

    @Test
    void testEmptyArray() {
        assertEquals(null, pairElement(10, new int[]{}), "Return null with null array");
    }

    @Test
    void testRandomArray() {
        int[][] output;

        output = pairElement(10, new int[]{1, 2, 3, 4});
        assertArrayEquals(null, output, "Test Random Array");

        output = pairElement(4, new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[][]{{1, 3}}, output, "Test Random Array");

        output = pairElement(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        assertArrayEquals(new int[][]{{1, 9}, {2, 8}, {3, 7}, {4 ,6}}, output, "Test Random Array");

        output = pairElement(0, new int[]{1, 2, 3, 4, -1, -2});
        assertArrayEquals(new int[][]{{1, -1}, {2, -2}}, output, "Test Random Array");
    }
}
