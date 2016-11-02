package c1;
/*
* Given two strings, write a method to decide if one is a permutation of the other
*/
public class Q3 {

    /*
    * characters frequency of a string, in hashmap
    */
    public static java.util.HashMap<Character,Integer> charFrequency(String str) {
        java.util.HashMap<Character,Integer> map = new java.util.HashMap<Character,Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character strAt = new Character(str.charAt(i));
            map.put(strAt, map.containsKey(strAt) ? new Integer(map.get(strAt).intValue() + 1) : new Integer(1));
        }        
        return map;
    }

    /*
    * Naive approach
    * count the number of characters of both words and compare
    */
    public static boolean isPermutation(String fst, String snd) {
        if (fst.length() != snd.length())
            return false;        
        return charFrequency(fst).equals(charFrequency(snd));
    }    

    public static String sort(String s) {
        char[] tmp = s.toCharArray();
        java.util.Arrays.sort(tmp);
        return new String(tmp);
    }

    /*
    * think of the length of words
    */
    public static boolean isPermutation2(String fst, String snd) {
        if (fst.length() != snd.length())
            return false;
        return sort(fst).equals(sort(snd));
    }

    public static void main(String[] args) {
        String[] fsts = {"", "","he","oh","okko"};
        String[] snds = {"", "a","eh","abcdefgh","koko"};
        for (int i = 0; i < fsts.length; i++) {
            System.out.println(fsts[i] + " is a permutation of " + snds[i] + " ? " +
            isPermutation(fsts[i], snds[i]) + ',' +
            isPermutation2(fsts[i], snds[i]));
        }
    }

}