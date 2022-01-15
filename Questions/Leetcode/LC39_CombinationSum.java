import java.util.ArrayList;
import java.util.List;

public class LC39_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        System.out.println(combination(candidates, 7, new ArrayList<Integer>()));
    }

    static List<List<Integer>> combination(int[] candidates, int target, ArrayList<Integer> list){
        if(target == 0){
            List<List<Integer>> result = new ArrayList<>();
            result.add(list);
            // System.out.println("Result : "+result);
            return result;
        }
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < candidates.length ; i++){
            if(target >= candidates[i]){
                if(!list.isEmpty() && list.get(list.size()-1) <= candidates[i]){
                    list.add(candidates[i]);
                    result.addAll(combination(candidates, target-candidates[i], new ArrayList(list)));
                    list.remove(list.size()-1);    
                }
                else if(list.isEmpty()){
                    list.add(candidates[i]);
                    result.addAll(combination(candidates, target-candidates[i], new ArrayList(list)));
                    list.remove(list.size()-1);    
                }
                else{
                    continue;
                }
            }
        }
        return result;
    }
}   
//     static void sort(int[] arr, int low, int high){
//         if(low>=high){
//             return;
//         }
        
//         int start = low;
//         int end = high;
//         int mid = start + (end - start)/2;
//         int pivot = arr[mid];
        
//         while(start <= end){
//             while(pivot > arr[start]){
//                 start++;
//             }
//             while(pivot < arr[end]){
//                 end--;
//             }
            
//             if(start<= end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//             }
//         }
        
//         sort(arr, low, end);
//         sort(arr, start, high);
//     }
// }
