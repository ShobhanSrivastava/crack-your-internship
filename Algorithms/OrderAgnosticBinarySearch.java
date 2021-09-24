import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[size];

        // Input Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = in.nextInt();

        int ans = orderAgnosticBinarySearch(arr, target);

        System.out.println("The index for the given number in the array is :" + ans);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target){

        boolean isAsc = arr[0] < arr[arr.length - 1];
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid])
                return mid;

            if(isAsc == true){
                if(arr[mid] < target)
                    start = mid+1;
                else
                    end = mid-1;
            }
            else{
                if(arr[mid]<target)
                    end = mid-1;
                else
                    start = mid+1;
            }
        }

        return -1;

    }

}
