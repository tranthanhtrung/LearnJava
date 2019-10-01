package array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Average {

    public static double average (final int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum/arr.length;
    }

    @Test
    void testNullArray() {
        assertEquals(0, average(null), "Must return 0 when input is NULL");
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, average(new int[]{}), "Must return 0 when input is NULL");
    }

    @Test
    void testValidArray() {
        assertEquals(12, average(new int[]{12}), "Calculation sum false");
        assertEquals(4, average(new int[]{1,2,9}), "Calculation sum false");
        assertEquals(3.25, average(new int[]{1,2,8,2}), "Calculation sum false");
    }
}
