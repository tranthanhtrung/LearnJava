package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Contains {

    public static boolean isContains(final int value, final int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }

    @Test
    void testNull() {
        assertEquals(false, isContains(10, null), "Must return false with null array");
    }

    @Test
    void testEmpty() {
        assertEquals(false, isContains(10, new int[]{}), "Must return false with empty array");
    }

    @Test
    void testNotContains() {
        assertEquals(false, isContains(10, new int[]{1,3,9,11,12}), "Must return false with empty array");
    }

    @Test
    void testContains() {
        assertEquals(true, isContains(10, new int[]{1,3,9,10,12}), "Must return false with empty array");
    }
}
