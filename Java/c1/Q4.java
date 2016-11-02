package c1;
/*
* Write a method to replace all spaces in a string with '%20'. 
* You may assume that the string has sufficient space at the end of the string to hold the additional characters,
* and that you are given the "true" length of the string. 
* (Note: if implementing in Java, please use a character array so that you can perform this operation inplace.)
*/

public class Q4 {

    /*
    * Naive approach
    * you might think of this implementation first, but using aux buffer means this operation is not inplace...
    * Time : O(n)
    * Memory : O(n)
    */
    public static String replaceSpaces(String str) {
        java.lang.StringBuffer res = new java.lang.StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            res.append(str.charAt(i) == ' ' ? "%20" : str.charAt(i));
        }
        return res.toString();
    }



    public static void main(String[] args) {
        String[] words = { "", "te st", "test" };
        for (String word : words) {
            System.out.println("replace of " + word + " : " + replaceSpaces(word));
        }
    }

}