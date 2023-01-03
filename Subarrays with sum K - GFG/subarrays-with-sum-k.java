//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.findSubArraySum(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findSubArraySum(int arr[], int N, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int prefixSum = 0, count = 0;
        
        for(int i=0 ; i<N ; i++){
            prefixSum += arr[i];
            
            if(prefixSum == k) count++;
            
            int req = prefixSum - k;
            
            count += map.getOrDefault(req, 0);
            
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, 1);
            }
            else{
                int previousCount = map.get(prefixSum);
                map.put(prefixSum, previousCount+1);
            }
        }
        
        return count;
    }
}