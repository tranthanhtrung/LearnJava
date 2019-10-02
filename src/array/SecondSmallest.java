package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondSmallest {

    public static int secondSmallest(final int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        int min = arr[0] < arr[1] ? arr[0] : arr[1];
        int second = arr[0] > arr[1] ? arr[0] : arr[1];

        for (int i = 2; i < arr.length; i++) {
            if (min > arr[i]) {
                second = min;
                min = arr[i];
            }
            if (second > arr[i] && min < arr[i]) {
                second = arr[i];
            }
        }
        return second;
    }

    @Test
    void testNullArray() {
        assertEquals(0, secondSmallest(null), "Return 0 if array is null");
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, secondSmallest(new int[]{}), "Return 0 if array is empty");
    }

    @Test
    void testArrayOneElement() {
        assertEquals(0, secondSmallest(new int[]{1}), "Return 0 if array have one element");
    }

    @Test
    void testRandomArray() {
        int output;

        output = secondSmallest(new int[]{1, 2});
        assertEquals(2, output, "Expected 1, Output " + output);

        output = secondSmallest(new int[]{1, 2, 0});
        assertEquals(1, output, "Expected 1, Output " + output);

        output = secondSmallest(new int[]{1, 2, 3, 4, 5});
        assertEquals(2, output, "Expected 4, Output " + output);

        output = secondSmallest(new int[]{1, 2, -1, -10});
        assertEquals(-1, output, "Expected 1, Output " + output);

        output = secondSmallest(new int[]{10, 2, -1, 9});
        assertEquals(2, output, "Expected 1, Output " + output);

        output = secondSmallest(new int[]{100, 2, 99, 0});
        assertEquals(2, output, "Expected 1, Output " + output);
    }
}
