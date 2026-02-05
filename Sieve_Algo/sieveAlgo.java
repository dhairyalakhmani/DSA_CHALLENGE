package DSA_CHALLENGE.Sieve_Algo;

public class sieveAlgo {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        sieve(n , primes);
    }

    public static void sieve(int n , boolean[] primes){
    // Since in a boolean array all the initial values are set as false , therefore we assume that are marked false till the end are actually prime
        for(int i = 2 ; i * i <= n ; i++){
           if(!primes[i]){
               for(int j = i * 2 ; j <= n ; j += i){
                   primes[j] = true;
               }
           }
        }
        for(int i = 2 ; i <= n ; i++){
            if(!primes[i])
                System.out.print(i + " ");
        }
    }
}
