package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Duplicate {

    public static int[] duplicateNumber(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int countDuplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (IndexOf.indexOf(arr[i], arr) != LastIndexOf.lastIndexOf(arr[i], arr) && i == IndexOf.indexOf(arr[i], arr)) {
                countDuplicate++;
            }
        }

        if (countDuplicate == 0) {
            return null;
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


    public static String[] duplicateString(final String[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int countDuplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (IndexOf.stringIndexOf(arr[i], arr) != LastIndexOf.stringLastIndexOf(arr[i], arr) && i == IndexOf.stringIndexOf(arr[i], arr)) {
                countDuplicate++;
            }
        }

        if (countDuplicate == 0) {
            return null;
        }

        String[] result = new String[countDuplicate];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (IndexOf.stringIndexOf(arr[i], arr) != LastIndexOf.stringLastIndexOf(arr[i], arr) && i == IndexOf.stringIndexOf(arr[i], arr)) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }

    @Test
    void testNullArrayInt() {
       assertArrayEquals(null, duplicateNumber(null), "Must return null");
    }

    @Test
    void testEmptyArrayInt() {
        assertArrayEquals(null, duplicateNumber(new int[]{}), "Must return empty");
    }

    @Test
    void testArrayIntNotDuplicate() {
        assertArrayEquals(null, duplicateNumber(new int[]{1,2,3,4,5,6}), "Must return empty with array have not duplicate");
    }

    @Test
    void testRandomArrayInt() {
        assertArrayEquals(new int[]{1}, duplicateNumber(new int[]{12,1,3,4,1,5}), "Test random array");
        assertArrayEquals(new int[]{1}, duplicateNumber(new int[]{12,1,3,1,1,1}), "Test random array");
        assertArrayEquals(new int[]{1,2}, duplicateNumber(new int[]{1,1,3,2,1,2}), "Test random array");
        assertArrayEquals(new int[]{1}, duplicateNumber(new int[]{1,1,1,1}), "Test random array");
        assertArrayEquals(new int[]{1,3,2}, duplicateNumber(new int[]{1,1,3,3,2,2}), "Test random array");
    }

    @Test
    void testNullArrayString() {
        assertArrayEquals(null, duplicateString(null), "Must return null");
    }

    @Test
    void testEmptyArrayString() {
        assertArrayEquals(null, duplicateString(new String[]{}), "Must return empty");
    }

    @Test
    void testArrayStringNotDuplicate() {
        assertArrayEquals(null, duplicateString(new String[]{"", "a", "ab"}), "Must return empty with array have not duplicate");
        assertArrayEquals(null, duplicateString(new String[]{"a"}), "Must return empty with array have not duplicate");
    }

    @Test
    void testRandomArrayString() {
        assertArrayEquals(new String[]{"b"}, duplicateString(new String[]{"a", "b", "ab", "", "b", "trung"}), "Test random array");
        assertArrayEquals(new String[]{"b"}, duplicateString(new String[]{"a", "b", "ab", "b", "b", "trung"}), "Test random array");
        assertArrayEquals(new String[]{"b", "ab"}, duplicateString(new String[]{"a", "b", "ab", "b", "b", "ab"}), "Test random array");
        assertArrayEquals(new String[]{"a"}, duplicateString(new String[]{"a", "a", "a", "a"}), "Test random array");
        assertArrayEquals(new String[]{"a", "b", "c"}, duplicateString(new String[]{"a", "a", "b", "c", "b", "c"}), "Test random array");
    }
}

