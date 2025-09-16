// compile-time  polymorfism

class Student1 {
   String name;
   int age;

  public void printinfo(String name)
  {
    System.out.println(name);
  }
   public void printinfo(int age)
  {
    System.out.println(age);
  }
   public void printinfo(String name,int age)
  {
    System.out.println(name+" "+age);
  }
}


public class oopfoure {
    
      public static void main(String[] args) {
        Student1 s1 = new Student1(); 
        s1.name = "shrya";
        s1.age = 24;

        s1.printinfo(s1.name,s1.age);
    }
}
