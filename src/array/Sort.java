package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Sort {

    public static int[] sortNumberic(final int[] arr) {
        if (arr == null) {
            return null;
        }

        int tmp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static String[] sortString(final String[] arr) {
        if (arr == null)
            return null;

        String tmp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    @Test
    void testNullArrayNumber() {
        assertArrayEquals(null, sortNumberic(null), "Must return null");
    }

    @Test
    void testEmptyArrayNumber() {
        assertArrayEquals(new int[]{}, sortNumberic(new int[]{}), "Must return empty array");
    }

    @Test
    void testValidArrayNumber() {
        assertArrayEquals(new int[]{0}, sortNumberic(new int[]{0}), "Must return array sorted");
        assertArrayEquals(new int[]{-1, 0, 1}, sortNumberic(new int[]{0, -1, 1}), "Must return array sorted");
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortNumberic(new int[]{5, 3, 1, 4, 2}), "Must return array sorted");
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortNumberic(new int[]{1, 2, 3, 4, 5}), "Must return array sorted");
    }

    @Test
    void testNullArrayString() {
        assertArrayEquals(null, sortString(null), "Must return null");
    }

    @Test
    void testEmptyArrayString() {
        assertArrayEquals(new String[]{"", ""}, sortString(new String[]{"", ""}), "Must return empty array");
    }

    @Test
    void testValidArrayString() {
        assertArrayEquals(new String[]{"a"}, sortString(new String[]{"a"}), "Must return array sorted");
        assertArrayEquals(new String[]{"a", "ab", "abc"}, sortString(new String[]{"a", "abc", "ab"}), "Must return array sorted");
        assertArrayEquals(new String[]{"", "", "a", "ab", "abc"}, sortString(new String[]{"abc", "a", "", "ab", ""}), "Must return array sorted");
    }

}
