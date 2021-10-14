public class CheckSortedArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,8,9,10};
        System.out.println(checkSorted(arr, 0));
    }

    public static boolean checkSorted(int[] arr, int start) {
        if(start == arr.length-1){
            return true;
        }
        if(arr[start] < arr[start+1] && checkSorted(arr, start+1)){
            return true;
        }
        else{
            return false;
        }
    }
}
