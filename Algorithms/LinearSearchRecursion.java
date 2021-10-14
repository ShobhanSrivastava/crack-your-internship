public class LinearSearchRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,46,7,8,23,22};
        System.out.println(linearSearch(arr, 99, 0));
    }

    public static int linearSearch(int[] arr, int target, int start) {
        if(start == arr.length){
            return -1;
        }
        if(arr[start] == target){
            return start;
        }
        else{
            return linearSearch(arr, target, start+1);
        }
    }
}
