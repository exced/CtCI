package c1;

/*
* Given 2 strings, write a method to check if one string is a permutation of the other.
*/
public class Q2 {

    /*
    * without using data structures and sort
    */
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] s1_char_set = new int[256];
        /* feed the first array  with the first string*/
        for (char c : s1.toCharArray()) {
            s1_char_set[c]++;
        }
        /* pop with the second string */
        for (char c : s2.toCharArray()) {
            if (s1_char_set[c] >= 0)
                s1_char_set[c]--;
            else
                return false;   
        }            
        return true;
    }

    /*
    * characters frequency of a string, in hashmap
    */
    public static java.util.HashMap<Character,Integer> charFrequency(String str) {
        java.util.HashMap<Character,Integer> map = new java.util.HashMap<Character,Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character strAt = new Character(str.charAt(i));
            /* if already present, increment. else create the field */
            map.put(strAt, map.containsKey(strAt) ? new Integer(map.get(strAt).intValue() + 1) : new Integer(1));
        }
        return map;
    }

    /*
    * Naive approach
    * count the number of characters of both words and compare
    */
    public static boolean isPermutation2(String fst, String snd) {
        if (fst.length() != snd.length())
            return false;        
        return charFrequency(fst).equals(charFrequency(snd));
    }    

    /*
    * aux function to sort string, will be useful -> CtciLib
    */
    public static String sortString(String s) {
        char[] char_set = s.toCharArray();
        java.util.Arrays.sort(char_set);
        return new String(char_set);
    }

    /*
    * sorted arrays should be equals.
    */
    public static boolean isPermutation3(String s1, String s2) {
        return s1.length() != s2.length() ? false : sortString(s1).equals(sortString(s2));
    }

    public static void main(String[] args) {
        String[] test1 = {"abcd", "a", "", "baba"};
        String[] test2 = {"abc", "a", "", "bbaa"};
        for (int i = 0; i < test1.length; i++) {
            System.out.println(test1[i] + " isPermutation of " + test2[i] + " ? " + 
            isPermutation(test1[i], test2[i]) + " , " + 
            isPermutation2(test1[i], test2[i]) + " , " + 
            isPermutation3(test1[i], test2[i]));
        }
    }
}