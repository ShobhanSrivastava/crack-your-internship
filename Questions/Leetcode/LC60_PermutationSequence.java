import java.util.*;

public class LC60_PermutationSequence {
    public static void main(String[] args) {
        List<String> result = permutations(3, "", new int[4]);
        System.out.println(result.get(3-1));
    }

    public static List<String> permutations(int n, String current, int[] qb){
        if(current.length() == n){
            List<String> result = new ArrayList<>();
            // System.out.println(current);
            result.add(current);
            return result;
        }

        List<String> result = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){
            if(qb[i] == 0){
                qb[i] = i;
                result.addAll(permutations(n, current + Integer.toString(i), qb));
                qb[i] = 0;
            }
        }

        return result;
    }
}
