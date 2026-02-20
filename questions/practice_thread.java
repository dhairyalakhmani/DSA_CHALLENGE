class gm extends Thread{
    public void run(){
     while (true) {
        System.out.println("Good Morning pineapple, looking very good very nice");
     }
    }
}
class welc extends Thread{
    public void run(){
        while (true) {
            try {
                Thread.sleep(20);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome hai ji aapka");
        }
    

} 
}
public class practice_thread {
    public static void main(String[] args) {
        gm obj1=new gm();
        welc obj2 = new welc();
        obj1.start();
        obj2.start();
    }
}
