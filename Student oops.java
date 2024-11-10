

class Student {
  String name; 
  int age;
  
  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }
  
  Student () {
    System.out.println("Constructor Called");
  }
}

public class OOPS {
  public static void main (String [] args){
    Student s1 = new Student();
    s1.name = "Sutanuka";
    s1.age = 22;
    
    s1.printInfo();
  }
}