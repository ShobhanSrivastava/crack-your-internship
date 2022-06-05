// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        A = mergeSort(A);
        B = mergeSort(B);
        
        for(int i=0 ; i<N ; i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        
        return true;
    }
    
    public static long[] mergeSort(long[] arr){
        if(arr.length == 1){
            return arr;
        }
        
        int mid = arr.length/2;
        
        long[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        long[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right);
    }
    
    public static long[] merge(long[] arr1, long[] arr2){
        int i=0, j=0, k=0;
        long[] arr3 = new long[arr1.length + arr2.length];
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else{
                arr3[k++] = arr2[j++];
            }
        }
        
        while(i < arr1.length){
            arr3[k++] = arr1[i++];
        }
        
        while(j < arr2.length){
            arr3[k++] = arr2[j++];
        }
        
        return arr3;
    }
    
    
}