import java.util.*;
class Student implements Cloneable{
    int rn;
    String name;
     public Student(int rn,String name){
        this.rn = rn;
        this.name = name;
    }
    public Student(Student other){
    this.rn = other.rn;
    this.name = other.name;
}
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); 
    }
}
public class Main{
    public static void main(String [] args)throws CloneNotSupportedException{
    Student aman = new Student(32,"Aman");
  //  Student kulsum = new Student(aman);
    Student kulsum = (Student)aman.clone();
    System.out.println(aman.rn + " "+ kulsum.rn);
    }
}

