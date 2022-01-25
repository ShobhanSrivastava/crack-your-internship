import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoogleFoobar {
    public static void main(String[] args) {
        String num = "1211";
        int b = 10;

        Set<String> cycle = new HashSet<>();
        System.out.println(cycleCount(num, cycle, b)); 
    }

    public static int cycleCount(String num, Set<String> cycle, int b){
        if(Integer.parseInt(num) == 0){
            return 0;
        }
        
        cycle.add(num);
        int count = 1;
        
        String result = getResult(num, b);
        // System.out.println(cycle);
        count += cycleCount(result, cycle, b);
        
        if(cycle.contains(num)){
            return 0;
        }
        return count;
    }

    public static String getResult(String num, int b){
        int[] digits = strToIntArray(num);
        sort(digits, 'A', 0, digits.length-1);
        int[] asc = digits; //Digits in ascending order
        // System.out.println(Arrays.toString(asc));
        int[] desc = asc.clone();
        reverse(desc); // Digits in descending order
        // System.out.println(Arrays.toString(desc));

        int[] diff = difference(desc, asc, b);
        String result = intToString(diff);

        System.out.println("Received : "+num+" \nReturned : "+result+"\n");

        return result;
    }

    // Convert a string to an integer array
    public static int[] strToIntArray(String num){
        int[] digits = new int[num.length()];
        for(int i=0 ; i<num.length() ; i++){
            digits[i] = num.charAt(i) - 48;
        }
        return digits;
    }

    //To arrange values in ascending order
    public static void sort(int[] nums, char ch, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];

        while(start <= end){
            if(ch == 'A'){
                while(pivot > nums[start]){
                    start++;
                }
                while(pivot < nums[end]){
                    end--;
                }
            }

            if(ch == 'D'){
                while(pivot < nums[start]){
                    start++;
                }
                while(pivot > nums[end]){
                    end--;
                }
            }

            if(start<=end){
                swap(nums, start, end);
                start++;
                end--;
            }
        }

        sort(nums, ch, low, end);
        sort(nums, ch, start, high);
    }

    //Swap two elements in the array
    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    //To reverse the array and convert ascending into descending order array
    public static void reverse(int[] nums){
        for(int i=0 ; i<nums.length/2 ; i++){
            swap(nums, i, nums.length-i-1);
        }
    }

    //To find the difference of two integer arrays and return as integer array
    public static int[] difference(int[] nums1, int[] nums2, int b){
        int[] diff = new int[nums1.length];

        for(int i=nums1.length-1 ; i>=0 ; i--){
            if(nums1[i] >= nums2[i]){
                diff[i] = nums1[i] - nums2[i];
            }
            else{
                diff[i] = nums1[i] + b - nums2[i];
                nums1[i-1] -= 1;
            }
        }

        System.out.println(Arrays.toString(diff)+"\n");
        return diff;
    }

    //Convert the difference array and return it as string
    public static String intToString(int[] nums){
        String result = "";

        for(int i=0 ; i<nums.length ; i++){
            result += Integer.toString(nums[i]);
        }
        // System.out.println(result);
        return result;
    }
}

