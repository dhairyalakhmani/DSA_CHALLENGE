import java.util.Scanner;

public class armstrong_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int num = sc.nextInt();
        int dummy = num;
        int sum = 0;
        while (num > 0) {
            int a = num % 10;

            int b = a * a * a;

            sum += b;

            num = num / 10;
        }
        if (sum == dummy)
            System.out.println("Arm");
        else
            System.out.println("No nO noooo");
    }

}
