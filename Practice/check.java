public class check {
    public static void main(String[] args) {
        System.out.println(sort("210022", 3));
    }

    public static String sort(String nums, int base){
        int[] num = new int[base];
        for(int i=0 ; i<nums.length() ; i++){
            int digit = nums.charAt(i)-48;
            num[digit]++;
        }

        String sorted = "";
        for(int i=base-1 ; i>=0 ; i--){
            for(int j=1 ; j<=num[i] ; j++){
                sorted = sorted + i;
            }
        }

        return sorted;
    }
}
