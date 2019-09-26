package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Duplicate {

    public static int[] duplicate(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int countDuplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (IndexOf.indexOf(arr[i], arr) != LastIndexOf.lastIndexOf(arr[i], arr) && i == IndexOf.indexOf(arr[i], arr)) {
                countDuplicate++;
            }
        }

        if (countDuplicate == 0) {
            return new int[]{};
        }

        int[] result = new int[countDuplicate];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (IndexOf.indexOf(arr[i], arr) != LastIndexOf.lastIndexOf(arr[i], arr) && i == IndexOf.indexOf(arr[i], arr)) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, duplicate(null), "Must return null");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, duplicate(new int[]{}), "Must return empty");
    }

    @Test
    void testArrayNotDuplicate() {
        assertArrayEquals(new int[]{}, duplicate(new int[]{1,2,3,4,5,6}), "Must return empty with array have not duplicate");
    }

    @Test
    void testRandomArray() {
        assertArrayEquals(new int[]{1}, duplicate(new int[]{12,1,3,4,1,5}), "Test random array");
        assertArrayEquals(new int[]{1}, duplicate(new int[]{12,1,3,1,1,1}), "Test random array");
        assertArrayEquals(new int[]{1,2}, duplicate(new int[]{1,1,3,2,1,2}), "Test random array");
        assertArrayEquals(new int[]{1}, duplicate(new int[]{1,1,1,1}), "Test random array");
        assertArrayEquals(new int[]{1,3,2}, duplicate(new int[]{1,1,3,3,2,2}), "Test random array");
    }
}

