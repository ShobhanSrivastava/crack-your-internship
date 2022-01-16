import java.util.ArrayList;

public class LC486_PredictTheWinner {
    static boolean result = false;
    public static void main(String[] args) {
        int[] nums = {1,5,233,7};
        ArrayList<Integer> options = new ArrayList<>();

        for(int i=0 ; i<nums.length ; i++){
            options.add(nums[i]);
        }

        checkWinner(options, 0, 0, 'A');
        System.out.println(result);
    }

    public static void checkWinner(ArrayList<Integer> options, int scoreA, int scoreB, char turn){
        System.out.println(options+" "+scoreA+" "+scoreB+" "+turn);
        if(options.size() == 0){
            if(scoreA >= scoreB)
                result = true;
            return;
        }

        int first = options.get(0);
        int last = options.get(options.size()-1);
        int element = first > last ? first : last;
        int index = element == first ? 0 : options.size()-1;

        if(turn == 'A'){
            scoreA += element;
            options.remove(index);
            checkWinner(new ArrayList<>(options), scoreA, scoreB, 'B');
            options.add(index, element);
            scoreA -= element;
        }
        else{
            scoreB += element;
            options.remove(index);
            checkWinner(new ArrayList<>(options), scoreA, scoreB, 'A');
            options.add(index, element);
            scoreB -= element;
        }
    }
}
