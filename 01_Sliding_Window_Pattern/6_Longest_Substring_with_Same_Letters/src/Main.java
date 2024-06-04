import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestSubWithSame("abbcb",1));
    }

    public static int longestSubWithSame(String s, int k){
    // abbcb 1
        int windowStart = 0, maxLength=0,maxRepeating=0;
        Map<Character,Integer> frequencyMap = new HashMap<>();

        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            char rightChar = s.charAt(windowEnd);
            frequencyMap.put(rightChar,frequencyMap.getOrDefault(rightChar,0)+1);
            maxRepeating = Integer.max(maxRepeating,frequencyMap.get(rightChar));

            if(windowEnd-windowStart+1-maxRepeating>k){
                char leftChar = s.charAt(windowStart);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar)-1);
                windowStart++;
            }
            maxLength = Integer.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;


    }
}