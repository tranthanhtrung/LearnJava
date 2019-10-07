package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Common {

    public static String[] common(final String[] a, final String[] b) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return null;
        }

        int countCommon = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                continue;
            }

            if (i == IndexOf.stringIndexOf(a[i], a) && IndexOf.stringIndexOf(a[i],b) != -1) {
                countCommon++;
            }
        }

        if (countCommon == 0) {
            return null;
        }

        String[] common = new String[countCommon];
        for (int i = 0, index = 0; i < a.length; i++) {
            if (a[i] == null) {
                continue;
            }

            if (i == IndexOf.stringIndexOf(a[i], a) && IndexOf.stringIndexOf(a[i],b) != -1) {
                common[index] = a[i];
                index++;
            }
        }

        return common;
    }

    @Test
    void testNullArray() {
        assertArrayEquals(null, common(null, new String[]{"abc", "tr", "dce"}), "Return null with one parameter is null array");
        assertArrayEquals(null, common(null, null), "Return null with one parameter is null array");
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(null, common(null, new String[]{}), "Return null with one parameter is empty array");
        assertArrayEquals(null, common(new String[]{"abc", "tr", "dce"}, new String[]{}), "Return null with one parameter is empty array");
    }

    @Test
    void testRandomArray() {
        String[] output;

        output = common(new String[]{"abc", "tr", ""}, new String[]{"abcd", "trung", "dcea"});
        assertArrayEquals(null, output, "Expected null, Output" + Arrays.toString(output));

        output = common(new String[]{"abc", "tr", ""}, new String[]{"abcd", "", "dcea"});
        assertArrayEquals(new String[]{""}, output, "Expected null, Output" + Arrays.toString(output));

        output = common(new String[]{"abc", "tr", ""}, new String[]{"abcd", null, "dcea"});
        assertArrayEquals(null, output, "Expected null, Output" + Arrays.toString(output));

        output = common(new String[]{"abc", "tr", null}, new String[]{"abcd", null, "dcea"});
        assertArrayEquals(null, output, "Expected null, Output" + Arrays.toString(output));

        output = common(new String[]{"abc", "tr", "dce"}, new String[]{"abcd", "trung", "dcea"});
        assertArrayEquals(null, output, "Expected null, Output" + Arrays.toString(output));

        output = common(new String[]{"abc", "tr", "dce"}, new String[]{"abcd", "trung", "dcea", "tr"});
        assertArrayEquals(new String[]{"tr"}, output, "Expected [tr], Output" + Arrays.toString(output));

        output = common(new String[]{"abc", "tr", "dce"}, new String[]{"abc", "tr", "dce"});
        assertArrayEquals(new String[]{"abc", "tr", "dce"}, output, "Expected [abc, tr, dce], Output" + Arrays.toString(output));

        output = common(new String[]{"abc", "tr", "tr", "dce"}, new String[]{"abc", "tr", "dce", "trung", "tr", "tr", "abc", "ung"});
        assertArrayEquals(new String[]{"abc", "tr", "dce"}, output, "Expected [abc, tr, dce], Output" + Arrays.toString(output));
    }
}
