/**
 * PrimeUsingSieve
 */
public class PrimeUsingSieve {

    public static void main(String[] args) {
        int num = 40;
        boolean[] ans = new boolean[num-1];

        ans = sieve(num, ans);

        for(int i = 0; i<ans.length ; i++){
            if(ans[i] == false){
                System.out.println(ans[i+2]);
            }
        }
    }

    public static boolean[] sieve(int num, boolean[] prime) {
        int i=2;
        while (i*i <= num) {
            prime[i-2] = checkPrime(i);
            if(!checkPrime(i)){
                for(int j=i*2 ; j<=num ; j+=i){
                    prime[j-2] = true;
                }
            }
            i++;
        }
        return prime;
    }

    public static boolean checkPrime(int num) {

        int i = 2;
        while(i*i < num){
            if(num%i == 0){
                return true; //true -> not prime
            }
        }

        return false; //false -> prime
    }

}