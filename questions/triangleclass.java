class triangle{
    double base;
    double height;
    public void setBase(double b){
        base=b;
    }
    public void setHeight(double h){
        height=h;
    }

    public double area(){
        double areas=(base*height)/2;
        return areas;
    }
}
public class triangleclass {
    public static void main(String[] args) {
        triangle t= new triangle();
        t.setBase(4.7);
        t.setHeight(8.32);
        System.out.print(t.area());    
    }
}
