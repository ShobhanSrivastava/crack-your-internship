import java.util.Scanner;

public class CeilingOfANumber {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[size];
        
        // Input Array
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = in.nextInt();
        int ans = ceiling(arr,target);

        System.out.println("The ceiling for the given number in the array is :"+ans);
    }

    public static int ceiling(int[] arr, int target){

        //When the target is greater than the greatest element in the array, no ceiling exists.
        //Hence return -1
        if(target > arr[arr.length - 1])
            return -1;

        int start = 0, end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
