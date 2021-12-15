public class BinarySearchRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,1,2,3,6};
        int key = 5;
        System.out.println(binarySearch(arr, 0, arr.length-1, key));
    }

    public static int binarySearch(int[] arr, int start, int end, int key) {
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;

        if(arr[mid] == key) //Found
            return mid;

        if(key > arr[mid]){
            if(key < arr[end]){
                return binarySearch(arr, mid+1, end, key);
            }
            else{
                return binarySearch(arr, start, mid-1, key);
            }
        }
        else{
            if(key > arr[start]){
                return binarySearch(arr, start, mid-1, key);
            }
            else{
                return binarySearch(arr, mid+1, end, key);
            }
        }
    }
}
