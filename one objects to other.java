import java.util.*;
class Student{
    int id;
    String name;
    int marks; 
    //this is simply a method in the class
    void greet(){
        System.out.println("Good morning :-" + this.name);
    }
    //this is a constructor but here we are passing argumentsin this. 
    Student(int id,String name,int marks){
       this.id  = id;
       this.name = name;
       this.marks = marks;
    } 
    //this is another type of constructor which is having zero constructor.
    Student(){
        this.id = 33;
        this.name = "Kulsum";
        this.marks = 93;
    }
     Student(Student other){
        this.id = other.id;
        this.name = other.name;
        this.marks = other.marks;
    }
    
}
public class Main{
    public static void main(String [] args){
        Student aman = new Student(42,"Shaik Aman Sayer",98);
        Student kulsum = new Student(); 
        Student random = new Student(aman);
        aman.greet();
        System.out.println(aman.id);
        System.out.println(aman.name);
        System.out.println(kulsum.name);
        System.out.println(random.name);
    }
}
