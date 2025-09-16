// paramatrised constructor


class Student1 {
   String name;
   int age;

   public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
   }

   // Parameterized constructor
   Student1(String name1, int age1) {
       this.name = name1;  // "this.name" refers to class variable, "name" is parameter
       this.age = age1;
   }
}

public class ooptwo {
    public static void main(String[] args) {
        Student1 s1 = new Student1("shriya", 22); // constructor with 2 parameters
        s1.printinfo();
    }
}


