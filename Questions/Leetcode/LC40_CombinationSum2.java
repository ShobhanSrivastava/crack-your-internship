import java.util.*;

public class LC40_CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {2,5,2,1,2};
        sort(candidates, 0, candidates.length-1);
        System.out.println("Sorted Array : "+Arrays.toString(candidates));
        Set<List<Integer>> answer = combination(candidates, 5, new ArrayList<Integer>(), 0);
        List<List<Integer>> list = new ArrayList<>();

        for(List<Integer> element : answer){
            list.add(element);
        }

        System.out.println(list);
    }

    static Set<List<Integer>> combination(int[] candidates, int target, ArrayList<Integer> list, int index){
        if(target == 0){
            Set<List<Integer>> result = new HashSet<>();
            result.add(list);
            System.out.println(result);
            return result;
        }
        Set<List<Integer>> result = new HashSet<>();

        for(int i = index ; i < candidates.length ; i++){
            if(target >= candidates[i]){
                list.add(candidates[i]);
                result.addAll(combination(candidates, target-candidates[i], new ArrayList(list), ++index));
                list.remove(list.size()-1);  
            }
        }

        return result;
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
