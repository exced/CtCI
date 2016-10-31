
/*
* Implement an algorithm to determine if a string has all unique characters. What if
* you cannot use additional data structures?
*/
/*
* Naive approach
*/ 
public class C1Q1N1 {

    public static boolean hasAllUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i != j)
                    if (str.charAt(i) == str.charAt(j))
                        return false;
            }
        }
        return true;
    }

}