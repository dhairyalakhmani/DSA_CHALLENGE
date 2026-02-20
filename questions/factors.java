import java.util.ArrayList;
import java.util.Scanner;

public class factors {
    static ArrayList<Integer> getfactors(int n){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0)
            list.add(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        int N=sc.nextInt();
        int arr[]= new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();     
        }
        for(int i=0; i<N; i++){
            ArrayList<Integer> al = getfactors(arr[i]);
            ans.add(al);
        }
        for(int i=0; i<ans.size(); i++){
        System.out.println(ans.get(i));
        }
    }
}
