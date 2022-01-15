import java.util.ArrayList;
import java.util.Collections;

public class LC279_PerfectSquares {

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        int result = numSquares(13);
        System.out.println(result);
    }

    public static int numSquares(int n) {
        int[] qb = new int[n+1];
        ArrayList<Integer> list = ways(13, 0, qb);
        return Collections.min(list);
    }

    public static ArrayList<Integer> ways(int n, int count, int[] qb){
        if(n == 0){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(count);
            return list;
        }

        ArrayList<Integer> list = new ArrayList<>();

        count+=1;
        for(int i = (int)Math.sqrt(n) ; i >= 1 ; i--){
            list.addAll(ways(n - (i*i), count, qb));
        }

        return list;
    }
}
