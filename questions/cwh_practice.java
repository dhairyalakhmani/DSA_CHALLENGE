class cylinder{
    float radius,height,area,volume;
public float getRadius(){
    return radius;
}
public float setRadius(float newRad){
    radius=newRad;
    return radius;
}
public float getHeight(){
    return height;
}
public float setHeight(float newH){
    height=newH;
    return height;
}
public float giveArea(){
    area=2*3.14f*radius*(radius+height);
    return area;
}
public float giveVolume(){
    volume=3.14f*radius*radius*height;
    return volume;
}
public cylinder(float radiuss,float heightt){
    radius = radiuss;
    height = heightt;
}
}

public class cwh_practice {
    public static void main(String[] args) {
         cylinder kuchbhi = new cylinder(5.3f, 8.6f);
         System.out.println("The radius of cylinder ="+kuchbhi.getRadius());
         System.out.println("The height of cylinder ="+kuchbhi.getHeight());
         System.out.println("The area of cylinder ="+kuchbhi.giveArea());
         System.out.println("The volume of cylinder ="+kuchbhi.giveVolume());

    }
}
// class obj = new class
// obj.method(8278)


// 
