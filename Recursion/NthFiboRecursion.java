public class NthFiboRecursion {
    
    public static void main(String[] args) {
        System.out.println(FiboRec(6));
    }

    public static int FiboRec(int n) {
        if(n < 2){
            return n;
        }
        return FiboRec(n-1) + FiboRec(n-2);
    }

}


