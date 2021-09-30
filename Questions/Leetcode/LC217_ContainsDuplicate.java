public class LC217_ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,}
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i != arr[i] - 1) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }
    
}