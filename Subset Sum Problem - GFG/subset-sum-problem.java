//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        Boolean[][] dp = new Boolean[N+1][sum+1];
        for(int j=0 ; j<sum+1 ; j++) {
            dp[0][j] = false;
        }
        for(int i=0 ; i<N+1 ; i++) {
            dp[i][0] = true;
        }
        
        findSubset(arr, sum, N, dp);
        
        return dp[N][sum];
    }
    
    static Boolean findSubset(int[] arr, int sum, int N, Boolean[][] dp) {
        if(dp[N][sum]!=null) return dp[N][sum];
        
        if(arr[N-1] <= sum) {
            return dp[N][sum] = findSubset(arr, sum-arr[N-1], N-1, dp) || findSubset(arr, sum, N-1, dp);
        }
        else{
            return dp[N][sum] = findSubset(arr, sum, N-1, dp);
        }
    }
}