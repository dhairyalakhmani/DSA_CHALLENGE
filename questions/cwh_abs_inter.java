// abstract class pen{
//     abstract void write();
//     abstract void refill();
// }
// class fountainPen extends pen{
//     void write(){
//         System.out.println("Writing...");
//     }
//     void refill(){
//         System.out.println("Pen empty, Refilling...");
//     }
    
//     public void changeNib(){
//         System.out.println("Changing the nib...");
//     }
// }

class monkey{
    public void jump(){
        System.out.println("Monkey Jumps...");
    }
    public void bite(){
        System.out.println("Monkey Bites...");
    }
}
    interface BasicAnimal{
    public void eat();
    public void sleep();
}
class hooman extends monkey implements BasicAnimal{
    public void speak(){
              System.out.println("");
    }
      public void eat(){
        System.out.println("Eating");
    }
      public void sleep(){
        System.out.println("Sleeping..");
    }

}
public class cwh_abs_inter {
    public static void main(String[] args) {
        // fountainPen nayiPen = new fountainPen();
        // nayiPen.changeNib();
        hooman Dhairya = new hooman();
        Dhairya.eat();
    }
    
}
