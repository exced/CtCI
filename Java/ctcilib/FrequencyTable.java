package ctcilib;

import java.util.HashMap;

public class FrequencyTable {


    public static HashMap<Character, Integer> frequencyTable(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // create
        for (Character c : str.toCharArray()) { // feed
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 0);
        }
        return map;
    }
}