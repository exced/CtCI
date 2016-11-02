/*
* Assume you have a method isSubstring which checks if one word is a substring of another. 
* Given two strings, si and s2, write code to check If s2 is a rotation of s1 using only one call to
* isSubstring (e.g., "waterbottLe" is a rotation of "erbottLewat").
*/

public class Q8 {

    /*
    * aliasing contains String method
    */
    public static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        return isSubstring(s1+s1, s2);    
    }

    public static void main(String[] args) {
        String[] words1 = {"", "waterbottLe", "", "ab"};
        String[] words2 = {"", "erbottLewat", "a", "bac"};
        for (int i = 0; i < words1.length; i++) {
            System.out.println(words1[i] + " isRotation of " + words2[i] + " ? " +isRotation(words1[i],words2[i]));
        }
    }
}