import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,7,3,4,1,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int arr[], int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        
        while(start <= end){
            while(pivot > arr[start]){
                start++;
            }

            while(pivot < arr[end]){
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            System.out.println(Arrays.toString(arr)+"\n");
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    } 
}
