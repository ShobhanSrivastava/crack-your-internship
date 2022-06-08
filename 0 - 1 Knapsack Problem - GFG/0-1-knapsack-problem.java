// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        Integer[][] dp = new Integer[n+1][W+1];
        
        return maxProfit(wt, val, W, n, dp);
    } 
    
    public static int maxProfit(int[] wts, int[] val, int cap, int n, Integer[][] dp){
        if(n == 0 || cap == 0){
            return 0;
        }
        
        if(dp[n-1][cap] != null){
            return dp[n-1][cap];
        }
        
        if(cap >= wts[n-1]){
            int subAns1 = maxProfit(wts, val, cap-wts[n-1], n-1, dp)+val[n-1];
            int subAns2 = maxProfit(wts, val, cap, n-1, dp);
            dp[n-1][cap] = Math.max(subAns1, subAns2);
        }
        else{
            
            dp[n-1][cap] = maxProfit(wts, val, cap, n-1, dp);
        }
        
        return dp[n-1][cap];
    }
}


