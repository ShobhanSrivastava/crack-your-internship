class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res = 0;
        int len = s.length();
        
        res += map.get(s.charAt(len-1));
        int i=len-2;
        while(i>=0){
            char curr = s.charAt(i);
            char next = s.charAt(i+1);
            
            if(map.get(curr) >= map.get(next)){
                res += map.get(curr);
            }
            else{
                res -= map.get(curr);
            }
            i--;
        }
        
        return res;
    }
}