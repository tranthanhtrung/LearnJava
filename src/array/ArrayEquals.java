package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayEquals {

    public static boolean arrayEquals(final int[] a, final int[] b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    @Test
    void testNullArray() {
        assertEquals(true, arrayEquals(null, null), "Return true if two array the same is null");
        assertEquals(false, arrayEquals(new int[]{}, null), "Test Null Array");
        assertEquals(false, arrayEquals(new int[]{1, 2, 3}, null), "Test Null Array");
    }

    @Test
    void testEmptyArray() {
        assertEquals(true, arrayEquals(new int[]{}, new int[]{}), "Test Empty Array");
        assertEquals(false, arrayEquals(new int[]{}, new int[]{1, 2, 3}), "Test Empty Array");
    }

    @Test
    void testDiffLengthArray() {
        assertEquals(false, arrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4}), "Test Random Array");
    }

    @Test
    void testDiffIndexArray() {
        assertEquals(false, arrayEquals(new int[]{1, 2, 3}, new int[]{1, 3, 2}), "Test Random Array");
        assertEquals(false, arrayEquals(new int[]{5, 6, 9}, new int[]{9, 5, 6}), "Test Random Array");
    }

    @Test
    void testRandomArray() {
        assertEquals(true, arrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}), "Test Random Array");
        assertEquals(true, arrayEquals(new int[]{1}, new int[]{1}), "Test Random Array");
        assertEquals(false, arrayEquals(new int[]{1, 5}, new int[]{1, 9, 3}), "Test Random Array");
        assertEquals(true, arrayEquals(new int[]{1, 10, 8, 9}, new int[]{1, 10, 8, 9}), "Test Random Array");
    }
}
