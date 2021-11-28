public class BubbleSortRecursion {
    public static void main(String[] args) {
        
    }

    public static void bubbleSort(int[] arr, int unsortedLength, int i) {
        if(i < unsortedLength){
            if(arr[i] > arr[i+1])
                swap(arr, i, i+1);
        }
    }
    
    public static void swap(int[] arr, int a, int b) {
        
    }
}
