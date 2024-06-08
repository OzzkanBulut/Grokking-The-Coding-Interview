public class Solution {
    public static void main(String[] args) {
        // 2,1,5,1,3,2 k=3  answ: 9
        int[] arr = {2,3,4,1,5};
        System.out.println(maxSum(arr,2));

    }

    public static int maxSum(int[] arr, int k){

        int sum =0;
        int windowStart = 0;
        int maxSum =0;
        int counter = 0;

        for(int windowEnd =0;windowEnd<arr.length;windowEnd++){
            sum = sum + arr[windowEnd];
            counter++;
            while(counter>k){
                sum = sum - arr[windowStart];
                windowStart++;
                counter--;

            }
            maxSum = Integer.max(maxSum,sum);


        }
        return maxSum;


    }
}
