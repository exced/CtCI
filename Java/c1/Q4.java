package c1;

public class Q4 {

    public static boolean isPalindromePermutation(String str){
        int nbOdd = 0;
        java.util.HashMap<Character,Integer> map = new java.util.HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
            Character strAt = new Character(str.charAt(i));
            /* if already present, increment. else create the field */
            map.put(strAt, map.containsKey(strAt) ? new Integer(map.get(strAt).intValue() + 1) : new Integer(1));
			if (map.get(strAt) % 2 == 1) {
				nbOdd++;
			}
			else {
				nbOdd--;
			}
		}
		return nbOdd <= 1;
    }

    public static void main(String []args){
        String[] words = { "", "aab", "kayak", "kkaay", "test" };
        for (String word : words) {
            System.out.println("isPalindromePermutation " + word + " : " + isPalindromePermutation(word));
        }		
    }

}