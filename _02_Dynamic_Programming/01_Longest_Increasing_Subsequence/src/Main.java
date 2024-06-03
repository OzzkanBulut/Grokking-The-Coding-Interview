import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {
       if(nums==null || nums.length==0){
           return 0;
       }
       int[] dp = new int[nums.length];
       Arrays.fill(dp,1);

       // 10,9,2,5,3,7,101,18
       //  1,1,1,1,1,1,1,1
       for(int i=1;i<nums.length;i++){
           for(int j=0;j<i;j++){
               if(nums[i]>nums[j]){
                   dp[i] = Integer.max(dp[i],dp[j]+1);
               }
           }
       }

        int maxLength = Arrays.stream(dp).max().orElse(0);
        return maxLength;
    }
}