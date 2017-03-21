package ctcilib;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public static Set<String> perm1(String str) {
        Set<String> perm = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = perm1(rem);
        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    private static void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }  

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    private static void perm3(String str) {
        perm3(str, "");
    }

    private static void perm3(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1, str.length());
                perm3(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String s = "AAC";
        String s1 = "ABC";
        String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + perm1(s));
        System.out.println("\nPermutations for " + s1 + " are: \n" + perm1(s1));
        System.out.println("\nPermutations for " + s2 + " are: \n" + perm1(s2));
        System.out.println("\nPermutations 3 for " + s2 + " are: ");
        perm3(s2);
        System.out.println("perm2 h43o");
        perm2("h43o".toCharArray(), 4);
    }
}