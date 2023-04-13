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
        return countWays(coins, N, sum, 0, table);
    }
    
    public long countWays(int coins[], int N, int sum, int index, Long[][] table) {
        if(sum == 0) return 1;
        
        if(index == N) return 0;
        
        if(table[index][sum] != null) return table[index][sum];
        
        if(coins[index] <= sum) {
            long waysByChoosingCoin = countWays(coins, N, sum-coins[index], index, table);
            long waysByNotChoosingCoin = countWays(coins, N, sum, index+1, table);
            
            return table[index][sum] = waysByChoosingCoin + waysByNotChoosingCoin;
        }
        else {
            long waysByNotChoosingCoin = countWays(coins, N, sum, index+1, table);
            return table[index][sum] = waysByNotChoosingCoin;
        }
    }
}