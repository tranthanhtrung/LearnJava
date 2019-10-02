package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveDuplicate {

    public static int[] removeDuplicate(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int[] duplicateArray = Duplicate.duplicateNumber(arr);
        if (duplicateArray == null || duplicateArray.length == 0) {
            return arr.clone();
        }

        int[] result = arr.clone();
        for (int i = 0; i < duplicateArray.length; i++) {
            result = Remove.remove(duplicateArray[i], result);
        }

        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, removeDuplicate(null), "Return null with null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, removeDuplicate(new int[]{}), "Return empty array with empty array");
    }

    @Test
    void testRandomArray() {
        int[] output;

        output = removeDuplicate(new int[] {1, 2, 3, 4});
        assertArrayEquals(new int[] {1, 2, 3, 4}, output, "Expected [1, 2, 3, 4], output " + Arrays.toString(output));

        output = removeDuplicate(new int[] {1, 1, 2, 3, 4});
        assertArrayEquals(new int[] {2, 3, 4}, output, "Expected [2, 3, 4], output " + Arrays.toString(output));

        output = removeDuplicate(new int[] {1, 1, 1, 1});
        assertArrayEquals(new int[] {}, output, "Expected [], output " + Arrays.toString(output));

        output = removeDuplicate(new int[] {1, 2, 2, 1, 3, 3});
        assertArrayEquals(new int[] {}, output, "Expected [], output " + Arrays.toString(output));

        output = removeDuplicate(new int[] {1, 1, 2, 2, 3, 5});
        assertArrayEquals(new int[] {3, 5}, output, "Expected [3, 5], output " + Arrays.toString(output));
    }
}
