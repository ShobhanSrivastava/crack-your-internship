public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6,8,9};
        System.out.println(checkSorted(arr, 1));
    }

    static boolean checkSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index] > arr[index-1]){
            return checkSorted(arr, ++index);
        }
        else{
            return false;
        }
    }
}
