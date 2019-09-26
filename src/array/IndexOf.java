package array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndexOf {

    public static int indexOf(final int value, final int[] arr) {
        if (arr == null)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    @Test
    void testNullArray() {
        assertEquals(-1, indexOf(1, null), "Must return -1 with null array");
    }

    @Test
    void testEmptyArray() {
        assertEquals(-1, indexOf(1, new int[]{}), "Must return -1 with empty array");
    }

    @Test
    void testArrayOneElement() {
        assertEquals(0, indexOf(1, new int[]{1}),  "Must return index with array contains value");
        assertEquals(-1, indexOf(1, new int[]{3}), "Must return -1 with array not contains value");
    }

    @Test
    void testRamdomArray() {
        assertEquals(-1, indexOf(1, new int[]{2,5,6,7,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(3, indexOf(1, new int[]{2,5,6,1,9,2,4}), "Must return index with array contains value");
    }

    @Test
    void testArrayContainsManyValues() {
        assertEquals(0, indexOf(1, new int[]{1,5,6,1,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(0, indexOf(1, new int[]{1,1,1,1,1}), "Must return index with array contains value");
        assertEquals(1, indexOf(1, new int[]{5,1,1,9,2,4}), "Must return index with array contains value");
        assertEquals(2, indexOf(1, new int[]{5,6,1,9,2,1}), "Must return index with array contains value");
        assertEquals(4, indexOf(1, new int[]{5,6,10,9,1,1}), "Must return index with array contains value");
    }
}
