public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 7;

        int index = BinaryRecursion(arr, 0, arr.length-1, key);
        System.out.println(index);
    }

    public static int BinaryRecursion(int[] arr, int start, int end, int key){
        if (start > end) {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == key)
            return mid;
        else if(arr[mid]<key)
            return BinaryRecursion(arr, mid+1, end, key);
        else
            return BinaryRecursion(arr, start, mid-1, key);
    }
}
