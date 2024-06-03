public class Main {
    public static void main(String[] args) {
        int[] arr = {2,1,5,2,3,2};
        int sum = 7;
        System.out.println(findSmallestSubArray(arr, sum));
    }

    public static int findSmallestSubArray(int[] arr, int sum){
        int windowStart = 0, windowSum =0;
        int minLength = Integer.MAX_VALUE;

        for(int windowEnd =0;windowEnd<arr.length;windowEnd++){
            windowSum = windowSum + arr[windowEnd];


            while(windowSum>=sum){
                minLength = Integer.min(minLength,windowEnd-windowStart+1);
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }


        }
        return minLength==Integer.MAX_VALUE ? 0:minLength;



    }
}