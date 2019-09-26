package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Sum {

    public static int sum (final int[] arr) {
        int sum = 0;

        if (arr == null) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    @Test
    void testNullArray() {
        assertEquals(0, sum(null), "Must return 0 when input is NULL");
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, sum(new int[]{}), "Must return 0 when input is NULL");
    }

    @Test
    void testValidArray() {
        assertEquals(12, sum(new int[]{12}), "Calculation sum false");
        assertEquals(12, sum(new int[]{1,2,9}), "Calculation sum false");
    }
}
