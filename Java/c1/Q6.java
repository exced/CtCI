package c1;
/*
* Implement a method to perform basic string compression using the counts of repeated characters. 
* For example, the string a a b c c c c c a a a would become a2blc5a3. 
* If the "compressed" string would not become smaller than the original string, your method should
* return the original string
*/

public class Q6 {

    public static boolean isCompressBetter(String str) {
        if (str.length() <= 1)
            return false;
        int compress_length = 0;    
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++; 
            if (i == str.length()-1 || str.charAt(i) != str.charAt(i+1)) {
                compress_length += 1 + String.valueOf(count).length();   
                count = 0; 
            }    
        }
        return compress_length < str.length();
    }

    public static String compress(String str) {
        if (!isCompressBetter(str))
            return str;
        java.lang.StringBuffer res = new java.lang.StringBuffer();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i == str.length()-1 || str.charAt(i) != str.charAt(i+1)) {
                res.append(str.charAt(i));
                res.append(count);
                count = 0;
            }                
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] words = { "", "abcd", "aaa", "baa", "aab", "aaabc", "aabbccc"};
        for (String word : words) {
            System.out.println("compression of " + word + " ? " + isCompressBetter(word) + " : " + compress(word));
        }
    }
}