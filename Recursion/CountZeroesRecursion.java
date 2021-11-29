public class CountZeroesRecursion {
    public static void main(String[] args) {
        System.out.println(CountZeroes(90029400));
    }

    public static int CountZeroes(int num) {
        if(num == 0){
            return 0;
        }
        else if(num%10 == 0){
            return 1 + CountZeroes(num/10);
        }
        else{
            return CountZeroes(num/10);
        }
    }
}
