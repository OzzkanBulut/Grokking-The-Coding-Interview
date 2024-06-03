public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3,4,1,5};
        int k = 2;
        System.out.println(findMaxSumOfSubArray(arr, k));

    }

    public static int findMaxSumOfSubArray(int[] arr, int k) {
        int sum = 0;
        int answer = 0;
        int windowStart = 0;
        for(int windowEnd=0;windowEnd<k;windowEnd++){
            sum = sum + arr[windowEnd];
            answer = sum;
        }

        for(int windowEnd = k;windowEnd<arr.length;windowEnd++){
            sum = sum + arr[windowEnd]-arr[windowStart];
            if(sum>=answer){
                answer = sum;
            }
            windowStart++;
        }
        return answer;
    }
}