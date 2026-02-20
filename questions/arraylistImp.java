import java.util.*;
public class arraylistImp {
    public static void main(String[] args) {
        ArrayList<Integer> L1= new ArrayList<>();
        L1.add(6);//to add elements L1.add
        L1.add(4,7);  //to add at specific index l1.add(index, value)
        L1.add(1);
        L1.add(98);
        L1.add(45);
        L1.add(345);
        L1.add(62);
        for(int i=0; i<L1.size();i++){
            System.out.println(L1.get(i));
        }

        Collections.sort();
    }
}
// arr.size
// arr.add
// arr.remove
// arr.addAll
// arr.indexOf
// arr.lastIndexOf
// arr.clone
// arr.get
// arr.contains
