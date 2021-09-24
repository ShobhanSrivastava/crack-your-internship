//BinarySearch only works for sorted arrays

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,8,10,15,44,100};
        int target = 15;
        
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
}
