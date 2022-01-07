public class LC1155_NumberOfDiceRolls {
    public static void main(String[] args) {
        System.out.println(diceRolls(30, 30, 500) % ((int)Math.pow(10, 9) + 7));
    }   
    
    static int diceRolls(int n, int k , int target){
        if(target == 0){
            return 1;
        }
        else if(n == 0){
            return 0;
        }

        int count = 0;
        
        for(int j = 1 ; j <= k && j<= target ; j++){
            count += diceRolls(n-1, k, target-j);
        }
        return count;
    }
}
