/*
* Given two strings, write a method to decide if one is a permutation of the other
*/
public class Q3 {


    /*
    * Naive approach
    * count the number of characters of both words and compare
    */
    public static boolean isPermutation(String fst, String snd) {
        if (fst.length() != snd.length())
            return false;        
        java.util.HashMap<Character,Integer> fstMap = new java.util.HashMap<Character,Integer>();
        java.util.HashMap<Character,Integer> sndMap = new java.util.HashMap<Character,Integer>();
        /* count the occurence, fst and snd have same length */
        for (int i = 0; i < fst.length(); i++) {
            Character fstAt = new Character(fst.charAt(i));
            Character sndAt = new Character(snd.charAt(i));
            fstMap.put(fstAt, fstMap.containsKey(fstAt) ? new Integer(fstMap.get(fstAt).intValue() + 1) : new Integer(1));
            sndMap.put(sndAt, sndMap.containsKey(sndAt) ? new Integer(sndMap.get(sndAt).intValue() + 1) : new Integer(1));
        }
        return fstMap.equals(sndMap);
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