/*
* Given two strings, write a method to decide if one is a permutation of the other
*/
public class Q3 {

    public static String sort(String s) {
        char[] tmp = s.toCharArray();
        java.util.Arrays.sort(tmp);
        return new String(tmp);
    }

    /*
    * Naive approach
    */
    public static boolean isPermutation(String fst, String snd) {
        return sort(fst).equals(sort(snd));
    }

    /*
    * think of the length trick
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
            System.out.println(fsts[i] + " is a permutation of " + snds[i] + " ? " + isPermutation2(fsts[i], snds[i]));
        }
    }

}