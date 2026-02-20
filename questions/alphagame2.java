import java.util.Scanner;

public class alphagame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String vowels = "aeiou";
        int q = sc.nextInt();

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int cons = 0, vows = 0;

            for (int i = l - 1; i < r; i++) {
                char ch = st.charAt(i);
                if (vowels.indexOf(ch) != -1)
                    vows++;
                else
                    cons++;
            }

            System.out.println(vows + " " + cons);
        }

        sc.close();
    }
}
