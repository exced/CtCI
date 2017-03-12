package c1;

public class Q5 {

    public static boolean oneEditAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }
        String longest = str1;
        String shortest = str2;
        boolean sameLength = str1.length() == str2.length();
        if (str1.length() < str2.length()) {
            longest = str2;
            shortest = str1;
        }
        if (shortest.length() == 0) {
            if (longest.length() != 1) {
                return false;
            }
        }
        int curs = 0;
        boolean diff = false;
        for (int i = 0; i < shortest.length(); i++) {
            if (shortest.charAt(i) != longest.charAt(curs)) {
                if (diff) {
                    return false;
                }
                diff = true;
                if (!sameLength) {
                    curs++;
                }
            }
            curs++;
        }
        return true;
    }
    public static void main(String []args) {
        String[] test1 = {"pale", "pales", "pale", "pale"};
        String[] test2 = {"ple", "pale", "bale", "bae"};
        for (int i = 0; i < test1.length; i++) {
            System.out.println(test1[i] + " oneEditAway " + test2[i] + " ? " + 
            oneEditAway(test1[i], test2[i]));
        }   
    }
}