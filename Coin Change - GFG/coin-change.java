//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int N, int sum) {
        Long[][] table = new Long[N+1][sum+1];
        
        for(int i=0 ; i<=N ; i++) table[i][0] = 1L;
        ways(table, coins, N, sum);
        
        return table[N][sum];
    }
    
    private long ways(Long[][] table, int coins[], int N, int sum) {
        if(sum == 0) return 1;
        
        if(N == 0) return 0;
        
        if(table[N][sum] != null) return table[N][sum];
        
        if(coins[N-1] <= sum) {
            long choose = ways(table, coins, N, sum-coins[N-1]);
            long notChoose = ways(table, coins, N-1, sum);
            
            return table[N][sum] = choose + notChoose;
        }
        else {
            return table[N][sum] = ways(table, coins, N-1, sum);
        }
    }
}