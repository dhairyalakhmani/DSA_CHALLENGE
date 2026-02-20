import java.util.Scanner;
public class hollowtriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<2*N-1; j++){
                if((i+j)==(N-1) || (j-i)==(N-1) || ((i%2!=0) && i==(N-1) && ((i+j) % 2!=0)) || ((i%2==0) && (i==N-1) && ((i+j)%2==0)))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }    
    }
}
