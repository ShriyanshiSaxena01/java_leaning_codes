// copy constructor

class Student1 {
   String name;
   int age;

   public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
   }

   // copy constructor
   Student1(Student1 s2) {
       this.name = s2.name;  
       this.age = s2.age;
   }

   // default constructor (no arguments)
   Student1() {

   }
}

public class oopthre {
      public static void main(String[] args) {
        Student1 s1 = new Student1(); // calls default constructor
        s1.name = "shrya";
        s1.age = 24;

        Student1 s2 = new Student1(s1); // calls copy constructor
        s2.printinfo(); // prints copied values
    }
}
