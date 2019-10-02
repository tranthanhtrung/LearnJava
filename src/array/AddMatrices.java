package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AddMatrices {

    public static int[][] addMatrices(final int[][] a, final int[][] b) {
        if(a == null || a.length == 0) {
            return a;
        }
        if(b == null || b.length == 0) {
            return b;
        }

        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, addMatrices(null, null), "Return null with null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[][]{}, addMatrices(new int[][]{}, new int[][]{}), "Return null with null array");
    }

    @Test
    void testRandomArray() {
        int[][] output;

        output = addMatrices(new int[][]{{1}}, new int[][]{{2}});
        assertArrayEquals(new int[][]{{3}}, output, "Test random array");

        output = addMatrices(new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{2, 9, 3}, {4, -9, 6}});
        assertArrayEquals(new int[][]{{3, 11, 6}, {8, -4, 12}}, output, "Test random array");

        output = addMatrices(new int[][]{{1, 2, 3}, {4, 5, 6}, {-1, -1, -1}}, new int[][]{{2, 9, 3}, {4, -9, 6}, {-1, -2, 3}});
        assertArrayEquals(new int[][]{{3, 11, 6}, {8, -4, 12}, {-2, -3, 2}}, output, "Test random array");

        output = addMatrices(new int[][]{{1, 2}, {4, 5}}, new int[][]{{2, 9}, {4, -9}});
        assertArrayEquals(new int[][]{{3, 11}, {8, -4}}, output, "Test random array");
    }
}
