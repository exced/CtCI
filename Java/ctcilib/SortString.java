package ctcilib;

import java.util.Arrays;

public class SortString {

    public static String sortString(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return (new String(ch));
    }
}