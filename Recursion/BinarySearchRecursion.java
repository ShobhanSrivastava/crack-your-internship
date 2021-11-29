public class BinarySearchRecursion {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 1;
        System.out.println(binarySearch(arr, 0, arr.length-1, key));

    }

    public static int binarySearch(int[] arr, int start, int end, int key) {

        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == key)
            return mid;
        else if(key < arr[mid]){
            end = mid-1;
            return binarySearch(arr, start, end, key);
        }
        else{
            start = mid+1;
            return binarySearch(arr, start, end, key);
        }

    }
}
