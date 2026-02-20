import java.util.Scanner;
public class replacechar {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s=sc.nextLine();
       char c1= sc.next().charAt(0);
       char c2= sc.next().charAt(0);
       s=s.replace(c1,c2);
       System.out.println(s);
    }
    
}
