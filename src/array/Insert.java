package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insert {

    public static int[] insert(final int value, final int index, final int[] arr) {
        if (arr == null || (arr.length == 0 && index != 0)) {
            return arr;
        }

        if (arr.length == 0 && index == 0) {
            return new int[]{value};
        }

        if (index < 0 || index > arr.length) {
            return arr.clone();
        }

        int[] result = new int[arr.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (i < index) {
                result[i] = arr[i];
            }
            if (i > index) {
                result[i] = arr[i - 1];
            }
        }
        result[index] = value;

        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, insert(10, 1, null), "Return null with null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, insert(10, 1, new int[]{}), "Return empty array with invalid index");
        assertArrayEquals(new int[]{10}, insert(10, 0, new int[]{}), "Return array with index = 0");
    }

    @Test
    void testInvalidIndex() {
        assertArrayEquals(new int[]{1, 2, 3}, insert(10, -1, new int[]{1, 2, 3}), "Expected [1, 2, 3], Output" + Arrays.toString(insert(10, -1, new int[]{1, 2, 3})));
        assertArrayEquals(new int[]{1, 2, 3}, insert(10, 10, new int[]{1, 2, 3}), "Expected [1, 2, 3], Output" + Arrays.toString(insert(10, 10, new int[]{1, 2, 3})));
    }

    @Test
    void testRandomArray() {
        int[] output;

        output = insert(10, 0, new int[]{1, 2, 3});
        assertArrayEquals(new int[]{10, 1, 2, 3}, output, "Expected [10, 1, 2, 3], Output" + Arrays.toString(output));

        output = insert(10, 2, new int[]{1 ,2 ,3});
        assertArrayEquals(new int[]{1, 2, 10, 3}, output, "Expected [1, 2, 10, 3], Output" + Arrays.toString(output));

        output = insert(10, 3, new int[]{1 ,2 ,3});
        assertArrayEquals(new int[]{1, 2, 3, 10}, output, "Expected [1, 2, 3, 10], Output" + Arrays.toString(output));

        output = insert(10, 2, new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{1, 2, 10, 3, 4}, output, "Expected [1, 2, 10, 3, 4], Output" + Arrays.toString(output));

        output = insert(10, -1, new int[]{1});
        assertArrayEquals(new int[]{1}, output, "Expected [1], Output" + Arrays.toString(output));

        output = insert(10, 3, new int[]{1});
        assertArrayEquals(new int[]{1}, output, "Expected [1], Output" + Arrays.toString(output));

        output = insert(10, 0, new int[]{1});
        assertArrayEquals(new int[]{10, 1}, output, "Expected [1, 10], Output" + Arrays.toString(output));

        output = insert(10, 1, new int[]{1});
        assertArrayEquals(new int[]{1, 10}, output, "Expected [10, 1], Output" + Arrays.toString(output));
    }
}
