class employee {
  String name;
  int id;

  // public String getName() {
  //   return name;
  // }

  // public void setName(String n) {
  //   name = n;
  // }

  // public int getId() {
  //   return id;
  // }

  // public void setId(int a) {
  //   id = a;
  // }
    public employee(int idd,String namee){
      id = idd;
      name = namee;
    }
}

public class abcd {
  public static void main(String[] args) {
    employee Dhairya = new employee(23,"Dhairya");
    System.out.println(Dhairya.id);
    System.out.println(Dhairya.name);
  }
  

}