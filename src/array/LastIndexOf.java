package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LastIndexOf {
    public static int lastIndexOf(int value, int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    @Test
    void testNullArray() {
        assertEquals(-1, lastIndexOf(3,null), "Must return -1 with null array");
    }

    @Test
    void testEmptyArray() {
        assertEquals(-1, lastIndexOf(1, new int[]{}), "Must return -1 with empty array");
    }

    @Test
    void testArrayOneElement() {
        assertEquals(0, lastIndexOf(1, new int[]{1}), "Must return -1 with array not contains value");
        assertEquals(-1, lastIndexOf(1, new int[]{3}), "Must return index with array contains value");
    }

    @Test
    void testRamdomArray() {
        assertEquals(-1, lastIndexOf(1, new int[]{2,5,6,7,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(3, lastIndexOf(1, new int[]{2,5,6,1,9,2,4}), "Must return index with array contains value");
    }

    @Test
    void testArrayContainsManyValues() {
        assertEquals(3, lastIndexOf(1, new int[]{1,5,6,1,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(4, lastIndexOf(1, new int[]{1,1,1,1,1}), "Must return index with array contains value");
        assertEquals(2, lastIndexOf(1, new int[]{5,1,1,9,2,4}), "Must return index with array contains value");
        assertEquals(5, lastIndexOf(1, new int[]{5,6,1,9,2,1}), "Must return index with array contains value");
        assertEquals(6, lastIndexOf(1, new int[]{5,6,10,9,1,1,1}), "Must return index with array contains value");
    }
}
