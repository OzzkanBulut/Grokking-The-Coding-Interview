public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3,4,1,5};
        int k = 2;
        System.out.println(findMaxSumOfSubArray(arr, k));

    }

    public static int findMaxSumOfSubArray(int[] arr, int k) {
        int windowStart =0;
        int maxSum = 0;
        int sum =0;
        int counter=0;

        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            sum = sum+arr[windowEnd];
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