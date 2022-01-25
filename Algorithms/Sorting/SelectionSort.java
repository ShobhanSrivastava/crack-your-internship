import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {38,26,95,52,13,20};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            swap(arr, max, arr.length-1-i);
            System.out.println(i+1+" "+Arrays.toString(arr));
        }
    }
}
