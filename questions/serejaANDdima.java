import java.util.Scanner;

public class serejaANDdima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        for(int i=0; i<n; i++){
            cards[i]=sc.nextInt();
        }
        int sereja=0,dima=0;
        int count=0;
        int left=0, right=n-1;
        int max=0;
        while(left<=right){
            max = Math.max(cards[left], cards[right]);
            if(max==cards[left])
                left++;
            else
                right--;
            
            // SEREJA first
            if(count%2==0){
                sereja+=max;
            }
            else
                dima+=max;
            count++;
            max=0;
        }
        System.out.print(sereja + " " + dima);
    }
}
