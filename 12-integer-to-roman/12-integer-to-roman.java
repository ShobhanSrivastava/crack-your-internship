class Solution {
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        int i = 0;
        String result = "";
        
        while(num != 0){
            if(val[i] <= num){
                int q = num/val[i];
                num = num%val[i];
                
                while(q != 0){
                    result += symbol[i];
                    q--;
                }
            }
            i++;
        }
        
        return result;
    }
}