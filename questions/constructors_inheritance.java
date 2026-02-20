// Agar humne parent class ka constructor banaya hai aur humne derived class ka object banaya hai toh woh derived class ka object bhi parent class ke constructor ko class kar sakta hai aur agar derived class ka khud ka bhi ek constructor hai toh uska object banane par bhi oehle woh parent class ke constuctor ko call karega firr apne wale ko
class parent {
    public parent() {
        System.out.println("I am a constructor");
    }
    public parent(int a){
        System.out.println("I am an overloaded constructor with a value = "+a);
    }
    
}

class child extends parent {
    public child() {
        super(0);  //yeh hai super use karne ka tareeka
        System.out.println("I am a derived class constructor");
    }
}
// aur agar by chance parent class main contructor overloading hai toh by default toh jo constructor without without argument wala hoga wahi call hoga, lekin agar firr bhi hume argument wala constructor use karna hai toh hum "super" keyword ka istemaal karte hain
// super keyword ka use derived class ke constructor ke andar karenge taaki woh constructor parent class ke constructor ko(argument wale) call kare, same goes for the derived constructor overloading bas usme hume obj ke andar argument dene honge 
public class constructors_inheritance {
    public static void main(String[] args) {
        child obj = new child();
    }
}
