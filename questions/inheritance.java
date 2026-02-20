class animals {
    public void AnimalSounds() {
        System.out.println("Animals make sound");
    }
}

class dog extends animals {
    public void DogSound() {
        System.out.println("Dog barks");
    }

}

class cat extends dog {
    void makeSounds() {
        System.out.println("Cat mewos");
    }
}

public class inheritance{
    public static void main(String[] args) {
        cat abcd = new cat();
        abcd.AnimalSounds();
        abcd.DogSound();
        abcd.makeSounds();
    }
}
// if you extend a class using another class and further extend the subclass
// with another class and so on,the last class will inherit the attributes of
// all the above classes, hence creating an object ofthe last class will be able
// access the methods of all the classes.....