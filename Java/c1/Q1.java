package c1;
/*
* Implement an algorithm to determine if a string has all unique characters. What if
* you cannot use additional data structures?
*/
public class Q1 {

    /*
    * Naive approach
    * Time : O(n^2)
    * Memory : O(1)
    */ 
    public static boolean hasAllUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        return false;
            }
        }
        return true;
    }

    /*
    * ASCII has 256 characters, word longer cannot have all unique chars
    * Time : O(n^2)
    * Memory : O(1)
    */
    public static boolean hasAllUniqueChars2(String str) {
        if (str.length() > 256)
            return false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        return false;
            }
        }
        return true;
    }

    /*
    * Time : O(n)
    * Memory : O(1)
    */
    public static boolean hasAllUniqueChars3(String str) {
        if (str.length() > 256)
            return false;        
        boolean[] boolSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (boolSet[index])
                return false;
            boolSet[index] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "abcd", "hello", "world", "aaqq", "bbad", "c", "" };
        for (String word : words) {
            System.out.println("word " + word + " has all uniques ? " + 
            hasAllUniqueChars(word) + ',' +
            hasAllUniqueChars2(word) + ',' +
            hasAllUniqueChars3(word));
        }
    }

}