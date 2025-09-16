class pen {
    String color;
    String type;  //ballpoint , gel

    //function performs

    public void write()
    {
        System.out.println("write something");
    }
    //till here its a blue print

    public void printcolor()
    {
        System.out.println(this.color);
    }
}
// Default constructor

class student
{
    String name;  
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Default constructor
    student() {
        System.out.println("constructor called");
    }
    

}



public class oops1 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        pen pen2 = new pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printcolor();
        pen2.printcolor();



        //student

        student s1=new  student();
        s1.name="shriya";
        s1.age=22;

        s1.printinfo();
    }
}
