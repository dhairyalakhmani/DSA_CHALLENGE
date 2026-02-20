abstract class Shapes{
    public int l,b,r;
    public int getlen(int len){
      l=len;
      return l;
    }
    public int getbre(int bre){
      b=bre;
      return b;
    }
    public int getrad(int rad){
      r=rad;
      return r;
    }
    abstract void getArea();
}
   class rectangle extends Shapes{
    rectangle R= new rectangle();
    int L=R.getlen(5);
    int B=R.getlen(3);
    public void getArea(){
        System.out.println("The area is: "+ (L*B));
    }

   }
    class square extends Shapes{
        square S= new square();
        int side=S.getlen(7);
        public void getArea(){
            System.out.println("The area is: "+(side*side));
        }
    }
    class circle extends Shapes{
        circle C= new circle();
        int rad= C.getrad(7);
        public void getArea(){
            System.out.println("The area is: "+ (Math.PI*rad*rad));
        }
    }