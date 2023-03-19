import java.util.*;
class Student{
    int id;
    String name;
    int marks;
    //this is simply a method in the class
    void greet(){
        System.out.println("Good morning :-" + this.name);
    }
    //this is a constructor but here we are passing argumentsin this 
    Student(int id,String name,int marks){
       this.id  = id;
       this.name = name;
       this.marks = marks;
    }
}
public class Main{
    public static void main(String [] args){
        Student aman = new Student(42,"Shaik Aman Sayer",98);
        Student kulsum = new Student(15,"Kulsum",93); 
        aman.greet();
        System.out.println(aman.id);
        System.out.println(aman.name);
        System.out.println(kulsum.name);
    }
}
