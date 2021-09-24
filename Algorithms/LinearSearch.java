// LinearSearch works for any order of the array

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 8, 10, 15, 44, 100 };
        int target = 15;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target)
                return i;
        }

        return -1;
    }
    
}
