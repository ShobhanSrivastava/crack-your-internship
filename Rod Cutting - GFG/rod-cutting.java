//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        int[] length = new int[n];
        
        for(int i=1 ; i<=n ; i++) length[i-1] = i;
        
        Integer[][] table = new Integer[n+1][n+1];
        for(int i=0 ; i<=n ; i++) table[0][i] = 0;
        
        return findMaxProfit(table, price, length, n, n);
    }
    
    public int findMaxProfit(Integer[][] table, int[] price, int[] length, int n, int size) {
        if(table[n][size] != null) return table[n][size];
        
        if(length[n-1] <= size) {
            int withCut = findMaxProfit(table, price, length, n, size-length[n-1]) + price[n-1];
            int withoutCut = findMaxProfit(table, price, length, n-1, size);
            
            return table[n][size] = Math.max(withCut, withoutCut);
        }
        
        return table[n][size] = findMaxProfit(table, price, length, n-1, size);
    }
}