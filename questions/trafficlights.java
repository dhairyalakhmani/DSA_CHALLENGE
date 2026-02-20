import java.util.Scanner;

public class trafficlights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        String s = sc.nextLine();

        String ss=s+s;
        // n*=2;
        int index=-1; int maxlen=0;
        for(int i = 2*n-1; i>=0; i++){
            if(s.charAt(i)=='g')
                index=i;
            else if(s.charAt(i)==c){
                int len;
                if(index>=i){
                    len=index-i;
                }
                else
                    len=n-i+index;
            }
            maxlen=Math.max(maxlen, len);
        }
        System.out.println(maxlen);
    }
}
