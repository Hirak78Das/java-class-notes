import java.util.Scanner;
public class First{
    public static void main(String args[]){
        Student hirak=new Student(); // default constructor
                                     // A constructor basically defines what happen when an object is created
                                     // The default constructor initializes the object with default values (e.g., 0 for integers, false for booleans, null for objects).
        System.out.println(hirak.name);// prints the default value of String or object  



    }

}
class Student{
    int rno;
    String name;
    float cgpa;

    // make a constructor
    Student(){
        this.rno=14;
        this.name="Hirak Jyoti Das";
        this.cgpa=45.6f;

    }
}

