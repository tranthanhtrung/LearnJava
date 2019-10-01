package array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LastIndexOf {

    public static int lastIndexOf(final int value, final int[] arr) {
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

    public static int stringLastIndexOf(final String value, final String[] arr) {
        if (arr == null) {
            return -1;
        }

        for (int i = arr.length - 1; i >=0; i--) {
            if (arr[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    @Test
    void testNullArrayInt() {
        assertEquals(-1, lastIndexOf(3,null), "Must return -1 with null array");
    }

    @Test
    void testEmptyArrayInt() {
        assertEquals(-1, lastIndexOf(1, new int[]{}), "Must return -1 with empty array");
    }

    @Test
    void testArrayIntOneElement() {
        assertEquals(0, lastIndexOf(1, new int[]{1}), "Must return -1 with array not contains value");
        assertEquals(-1, lastIndexOf(1, new int[]{3}), "Must return index with array contains value");
    }

    @Test
    void testRamdomArrayInt() {
        assertEquals(-1, lastIndexOf(1, new int[]{2,5,6,7,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(3, lastIndexOf(1, new int[]{2,5,6,1,9,2,4}), "Must return index with array contains value");
    }

    @Test
    void testArrayIntContainsManyValues() {
        assertEquals(3, lastIndexOf(1, new int[]{1,5,6,1,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(4, lastIndexOf(1, new int[]{1,1,1,1,1}), "Must return index with array contains value");
        assertEquals(2, lastIndexOf(1, new int[]{5,1,1,9,2,4}), "Must return index with array contains value");
        assertEquals(5, lastIndexOf(1, new int[]{5,6,1,9,2,1}), "Must return index with array contains value");
        assertEquals(6, lastIndexOf(1, new int[]{5,6,10,9,1,1,1}), "Must return index with array contains value");
    }

    @Test
    void testNullArrayString() {
        assertEquals(-1, stringLastIndexOf(null, null), "Test null array string");
        assertEquals(-1, stringLastIndexOf("t", null), "Test null array string");
        assertEquals(-1, stringLastIndexOf("", null), "Test null array string");
    }

    @Test
    void testEmptyArrayString() {
        assertEquals(-1, stringLastIndexOf(null, new String[]{}), "Test empty array string");
        assertEquals(-1, stringLastIndexOf("", new String[]{}), "Test empty array string");
        assertEquals(-1, stringLastIndexOf("trung", new String[]{}), "Test empty array string");
    }

    @Test
    void testArrayStringOneElement() {
        assertEquals(0, stringLastIndexOf("", new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringLastIndexOf(null, new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringLastIndexOf("a", new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringLastIndexOf("trung", new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringLastIndexOf("", new String[]{"trung"}),  "Test array string one element");
        assertEquals(-1, stringLastIndexOf(null, new String[]{"trung"}),  "Test array string one element");
        assertEquals(-1, stringLastIndexOf("a", new String[]{"trung"}), "Test array string one element");
        assertEquals(0, stringLastIndexOf("trung", new String[]{"trung"}), "Test array string one element");
    }

    @Test
    void testRamdomArrayString() {
        String[] input = new String[]{"a", "abc", "", "trung"};

        assertEquals(-1, stringLastIndexOf(null, input), "Test ramdom array string");
        assertEquals(2, stringLastIndexOf("", input), "Test ramdom array string");
        assertEquals(0, stringLastIndexOf("a", input), "Test ramdom array string");
        assertEquals(3, stringLastIndexOf("trung", input), "Test ramdom array string");

        input = new String[]{"a", "ab", "abc", "b"};

        assertEquals(1, stringLastIndexOf("ab", input), "Test ramdom array string");
    }

    @Test
    void testArrayStringContainsManyValues() {
        String[] input = new String[]{"", "", "", ""};

        assertEquals(3, stringLastIndexOf("", input), "Test array string contains many values");
        assertEquals(-1, stringLastIndexOf(null, input), "Test array string contains many values");
        assertEquals(-1, stringLastIndexOf("a", input), "Test array string contains many values");
        assertEquals(-1, stringLastIndexOf("trung", input), "Test array string contains many values");

        input = new String[]{"a", "", "a", "trung", "", "trung", "a"};
        assertEquals(4, stringLastIndexOf("", input), "Test array string contains many values");
        assertEquals(-1, stringLastIndexOf(null, input), "Test array string contains many values");
        assertEquals(6, stringLastIndexOf("a", input), "Test array string contains many values");
        assertEquals(5, stringLastIndexOf("trung", input), "Test array string contains many values");
        assertEquals(-1, stringLastIndexOf("abcd", input), "Test array string contains many values");
    }
}
