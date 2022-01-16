import java.util.ArrayList;

public class Lc1823_WinnerOfGame {
    public static void main(String[] args) {
        int n = 6, k = 5;
        ArrayList<Integer> friends = new ArrayList<>();
        for(int i=1 ; i<=n ; i++){
            friends.add(i);
        }
        System.out.println(findWinner(friends, k, -1)); 
    }

    public static int findWinner(ArrayList<Integer> friends, int k, int curr){
        System.out.println(friends);
        if(friends.size() == 1){
            return friends.get(0);
        }

        curr += k;
        if(curr >= friends.size()){
            curr %= friends.size();
        }

        friends.remove(curr);
        return findWinner(friends, k, curr-1);
    }

    int[] arr = new int[5];
}
