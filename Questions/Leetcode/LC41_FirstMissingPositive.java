public class LC41_FirstMissingPositive {
    
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        int ans = firstMissingPositive(arr);

        System.out.println(ans);
    }

    public static int firstMissingPositive(int[] arr){

        cycleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }

        return arr.length+1;
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+1 && arr[i]>0 && arr[i]<arr.length) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
