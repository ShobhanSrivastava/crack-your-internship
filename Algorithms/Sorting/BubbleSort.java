package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-4, -5, -19, 0, 45, 2, 4, -10};
        
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=1 ; j<arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr,j-1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
