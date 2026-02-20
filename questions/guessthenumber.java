import java.util.*;

class game {
    int n, target;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public game() {
        target = r.nextInt(0, 101);
    }

    public int takeUserInput() {
        System.out.print("Enter your guess: ");
        int num = sc.nextInt();
        n = num;
        return n;
    }

    //  target = 30
    // 

    public boolean isCorrectNumber() {
        if (n == target) {
            System.out.println("You guessed the Number correctly, CONGRATULATIONS!");
            return true;
        } else if (n<target && n>target-5) {
            System.out.println("You are really close!! You need to guess a slightly bigger number");
            return false;
        } else if (n>target && n<target+5) {
            System.out.println("You are really close!!you need to guess a slightly smaller number");
            return false;
        } else if (n > 0 && n < target) {
            System.out.println("You guessed a smaller number. KEEP TRYING!!");
            return false;
        } else if (n < 100 && n > target) {
            System.out.println("You guessed a bigger number. KEEP TRYING!!");
            return false;
        }
        return true;
    }
}

public class guessthenumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the game of guess the number.");
        System.out.println("A random number is generated and u need to guees it. Your attempts will be counted and score will be displayed...");
        int counter=1;
        game guess = new game();
        guess.takeUserInput();
        while (guess.isCorrectNumber() == false) {
            guess.takeUserInput();
            counter++;
        }
        System.out.println("You took "+ counter +" attempts.");
    }
}
