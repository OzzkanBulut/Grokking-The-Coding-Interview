import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18}; // 2 3 7 101
        System.out.println(longestIncreasing(arr));
    }

    public static int longestIncreasing(int[] arr){
        int length = 0,maxLength =0 ;
        int min = Integer.MAX_VALUE;

        for(Integer num:arr){
            min = Integer.min(num,min);
        }
        // {10,9,2,5,3,7,101,18};  2 3 7 101
        for(int i=0;i<arr.length;i++){





        }



        return 0;

    }
}