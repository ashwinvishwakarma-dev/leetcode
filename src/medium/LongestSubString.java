package medium;

import java.util.HashMap;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcabxyz";
        findLongestUniqueSubstring(s);
    }

    private static void findLongestUniqueSubstring(String str) {
        int start = 0;
        int maxStart = 0;
        int maxLength = 0;
        HashMap<Character, Integer> seen = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);

            if (seen.containsKey(c) && seen.get(c) >= start) {
                start = seen.get(c) + 1;
            }

            seen.put(c, end);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }
        String result = str.substring(maxStart, maxStart + maxLength);
        System.out.printf("%s - %d", result, maxLength);
    }
}
