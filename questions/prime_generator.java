import java.util.Scanner;

public class prime_generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till which u want primes to ne diplayed...");
        int limit = sc.nextInt();
        for (int i = 2; i <= limit; i++) {
            int counter = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0)
                   counter++;
            }
            // System.out.println(counter);
            if(counter==1){
                System.out.println(i);
            }
        }

    }

}
