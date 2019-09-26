package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Remove {

    public static int[] remove(final int value, final int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                size--;
            }
        }

        int[] result = new int[size];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, remove(1, null), "Must return null with null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, remove(1, new int[]{}), "Must return null with empty array");
    }

    @Test
    void testArrayOneElement() {
        assertArrayEquals(new int[]{}, remove(1, new int[]{1}), "test array one element");
        assertArrayEquals(new int[]{3}, remove(1, new int[]{3}), "test rray one element");
    }

    @Test
    void testRadomArray() {
        assertArrayEquals(new int[]{2,3,4,5,6}, remove(1, new int[]{1,2,3,4,5,6}), "test array random element");
        assertArrayEquals(new int[]{2,3,4,5}, remove(1, new int[]{1,2,3,1,4,5,1}), "test array random element");
        assertArrayEquals(new int[]{2,3,4,5,6}, remove(1, new int[]{2,3,4,5,6}), "test array random element");
    }

    @Test
    void testRemoveAllElement() {
        assertArrayEquals(new int[]{}, remove(1, new int[]{1,1,1,1,1,1}), "test remove all element");
        assertArrayEquals(new int[]{}, remove(6, new int[]{6,6,6}), "test remove all element");
    }
}
