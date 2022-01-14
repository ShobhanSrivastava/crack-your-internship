import java.util.ArrayList;

public class LC39_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        sort(candidates, 0, candidates.length-1);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(combinationSum(candidates, 7, list));
    }

    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target, ArrayList<Integer> list){
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        if(target == 0){
            answer.add(list);
            return answer;
        }
        
        for(int i=0 ; i<arr.length ; i++){
            if(target - arr[i] >= 0){
                target-=arr[i];
                list.add(arr[i]);
                answer.addAll(combinationSum(arr, target, list));
                int index = list.lastIndexOf(arr[i]);
                list.remove(index);
                target+=arr[i];
            }
            else{
                break;
            }
        }

        return answer;
    }

    static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = arr[mid];

        while(start <= end){
            while(pivot > arr[start]){
                start++;
            }
            while(pivot < arr[end]){
                end--;
            }

            if(start<= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        sort(arr, low, end);
        sort(arr, start, high);
    }
}
