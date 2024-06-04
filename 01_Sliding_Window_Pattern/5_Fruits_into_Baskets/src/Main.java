import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] fruits = {14,14,1,1,14,5,14,1,14,1,5,5,1,24,7,7,8,7,7,12,12,8,23,8,23,8,20,10,0,17};
        System.out.println(findLength(fruits,2));
    }

    private static int findLength(int[] fruits,int k) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int windowEnd=0;windowEnd<fruits.length;windowEnd++){
            int rightNum = fruits[windowEnd];
            frequencyMap.put(rightNum,frequencyMap.getOrDefault(rightNum,0)+1);

            while(frequencyMap.size()>k){
                int leftNum = fruits[windowStart];
                frequencyMap.put(leftNum,frequencyMap.get(leftNum)-1);
                if(frequencyMap.get(leftNum)==0){
                    frequencyMap.remove(leftNum);
                }
                windowStart++;
            }
            maxLength = Integer.max(maxLength,windowEnd-windowStart+1);
        }
        return  maxLength;
    }


}