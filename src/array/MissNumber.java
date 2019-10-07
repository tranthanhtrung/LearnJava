package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MissNumber {

    public static int missNumber(final int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        if (IndexOf.indexOf(1, arr) == -1) {
            return 0;
        }

        int sum = (arr.length + 1)*(arr.length + 2)/2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }

        if (IndexOf.indexOf(sum, arr) != -1 || sum > arr.length + 1) {
            return 0;
        }
        return sum;
    }

    @Test
    void testNullArray() {
        assertEquals( 0, missNumber(null));
    }

    @Test
    void testEmptyArray() {
        assertEquals( 0, missNumber(new int[]{}));
    }

    @Test
    void testRandomArray() {
        assertEquals( 0, missNumber(new int[]{0, 1, 2, 3, 4}));
        assertEquals( 0, missNumber(new int[]{2, 3, 4}));
        assertEquals( 4, missNumber(new int[]{1, 2, 3, 5}));
        assertEquals( 0, missNumber(new int[]{1, 2, 3, 4, 9}));
        assertEquals( 5, missNumber(new int[]{1, 7, 2, 8, 3, 4, 6, 9}));
    }

}
