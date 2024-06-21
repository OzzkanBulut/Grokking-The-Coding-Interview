public class Main {
    /*
    Problem:
        Climbing Stairs

        You are climbing a staircase. It takes n steps to reach the top.
        Each time you can either climb 1 or 2 steps.
        In how many distinct ways can you climb to the top ?

    Framework for Solving DP Problems:
        1. Define the objective function
            f(i) is the number of distinct ways to reach to i-th stair.
        2. Identify base cases
            f(0), f(1) and f(2) are base cases
        3. Write down a recurrence relation for the optimized objective function
            f(n) = f(n-1) + f(n-2)
        4. What's the order of execution ?
            bottom-up
        5. Where to look for the answer ?
            dp[n](f(n))

    */

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    // Time Complexity = O(n)
    // Space Complexity = O(n)
    private static int climbStairs(int n) {
        int [] dp = new int[n+1];
        dp[0]=1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];



    }
}