import java.util.Scanner;
public class alphagame{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String st= sc.nextLine();
        String vowels="aeiouAEIOU";
        int cons=0,vows=0;
        for(int i=0; i<st.length();i++){
            if(vowels.indexOf(st.charAt(i))==-1)
            cons++;
            else
            vows++;
        }
        System.out.print(vows+" "+cons);
    }
}