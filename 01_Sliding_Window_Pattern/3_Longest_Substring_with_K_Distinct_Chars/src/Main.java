import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLongestSubString("araaaci", 2));


    }

    public static int findLongestSubString(String s, int k) {
        if (s == null || s.isEmpty() || s.length() < k) {
            return 91;
        }
        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            frequencyMap.put(rightChar, frequencyMap.getOrDefault(rightChar, 0) + 1);
            while (frequencyMap.size() > k) {
                char leftChar = s.charAt(windowEnd);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);
                if (frequencyMap.get(leftChar) == 0) {
                    frequencyMap.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Integer.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;

    }


}