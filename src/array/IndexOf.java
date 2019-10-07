package array;

import org.junit.jupiter.api.Test;

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

    public static int stringIndexOf(final String value, final String[] arr) {
        if (arr == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    @Test
    void testNullArrayInt() {
        assertEquals(-1, indexOf(1, null), "Must return -1 with null array");
    }

    @Test
    void testEmptyArrayInt() {
        assertEquals(-1, indexOf(1, new int[]{}), "Must return -1 with empty array");
    }

    @Test
    void testArrayOneElementInt() {
        assertEquals(0, indexOf(1, new int[]{1}),  "Must return index with array contains value");
        assertEquals(-1, indexOf(1, new int[]{3}), "Must return -1 with array not contains value");
    }

    @Test
    void testRamdomArrayInt() {
        assertEquals(-1, indexOf(1, new int[]{2,5,6,7,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(3, indexOf(1, new int[]{2,5,6,1,9,2,4}), "Must return index with array contains value");
    }

    @Test
    void testArrayIntContainsManyValues() {
        assertEquals(0, indexOf(1, new int[]{1,5,6,1,9,2,4}), "Must return -1 with array not contains value");
        assertEquals(0, indexOf(1, new int[]{1,1,1,1,1}), "Must return index with array contains value");
        assertEquals(1, indexOf(1, new int[]{5,1,1,9,2,4}), "Must return index with array contains value");
        assertEquals(2, indexOf(1, new int[]{5,6,1,9,2,1}), "Must return index with array contains value");
        assertEquals(4, indexOf(1, new int[]{5,6,10,9,1,1}), "Must return index with array contains value");
    }

    @Test
    void testNullArrayString() {
        assertEquals(-1, stringIndexOf(null, null), "Test null array string");
        assertEquals(-1, stringIndexOf("t", null), "Test null array string");
        assertEquals(-1, stringIndexOf("", null), "Test null array string");
    }

    @Test
    void testEmptyArrayString() {
        assertEquals(-1, stringIndexOf(null, new String[]{}), "Test empty array string");
        assertEquals(-1, stringIndexOf("", new String[]{}), "Test empty array string");
        assertEquals(-1, stringIndexOf("trung", new String[]{}), "Test empty array string");
    }

    @Test
    void testArrayStringOneElement() {
        assertEquals(0, stringIndexOf("", new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringIndexOf(null, new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringIndexOf("a", new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringIndexOf("trung", new String[]{""}),  "Test array string one element");
        assertEquals(-1, stringIndexOf("", new String[]{"trung"}),  "Test array string one element");
        assertEquals(-1, stringIndexOf(null, new String[]{"trung", null, ""}),  "Test array string one element");
        assertEquals(-1, stringIndexOf("a", new String[]{"trung"}), "Test array string one element");
        assertEquals(0, stringIndexOf("trung", new String[]{"trung"}), "Test array string one element");
    }

    @Test
    void testRamdomArrayString() {
        String[] input = new String[]{"a", "abc", "", "trung"};

        assertEquals(-1, stringIndexOf(null, input), "Test ramdom array string");
        assertEquals(2, stringIndexOf("", input), "Test ramdom array string");
        assertEquals(0, stringIndexOf("a", input), "Test ramdom array string");
        assertEquals(3, stringIndexOf("trung", input), "Test ramdom array string");
    }

    @Test
    void testArrayStringContainsManyValues() {
        String[] input = new String[]{"", "", "", ""};

        assertEquals(0, stringIndexOf("", input), "Test array string contains many values");
        assertEquals(-1, stringIndexOf(null, input), "Test array string contains many values");
        assertEquals(-1, stringIndexOf("a", input), "Test array string contains many values");
        assertEquals(-1, stringIndexOf("trung", input), "Test array string contains many values");

        input = new String[]{"a", "", "a", "trung", "", "trung", "a"};
        assertEquals(1, stringIndexOf("", input), "Test array string contains many values");
        assertEquals(-1, stringIndexOf(null, input), "Test array string contains many values");
        assertEquals(0, stringIndexOf("a", input), "Test array string contains many values");
        assertEquals(3, stringIndexOf("trung", input), "Test array string contains many values");
        assertEquals(-1, stringIndexOf("abcd", input), "Test array string contains many values");
    }
}
