public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        bubbleSort(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
