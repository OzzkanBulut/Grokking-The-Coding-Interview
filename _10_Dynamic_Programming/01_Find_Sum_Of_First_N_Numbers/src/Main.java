public class Main {
    /*
    Problem:
    Find the sum of the first N numbers.

    Objective Function:
    f(i) is the sum of the first i elements.

    Recurrence Relation:
    f(n) = f(n-1) + n

    */


    public static void main(String[] args) {
        System.out.println(calculate(5));
    } // 1 2 3 4 5

    public static int calculate(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            dp[i] = dp[i-1]+i;
        }
    return dp[n];
    }
}