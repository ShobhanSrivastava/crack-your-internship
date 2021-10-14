import java.util.ArrayList;

public class FindAllOccurencesRecursion {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 7, 8, 46, 8, 7, 8, 23, 22 };
        findAllOccurences(arr, 8, 0);
        System.out.println(list);
    }

    public static void findAllOccurences(int[] arr, int target, int start) {
        if(start == arr.length-1){
            return;
        }
        if(arr[start] == target){
            list.add(start);
        }
        findAllOccurences(arr, target, start+1);
    }
}
