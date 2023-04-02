/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Student implements Cloneable{
    int rn;
    String name;
    int[] arr;
     public Student(int rn,String name){
        this.rn = rn;
        this.name = name;
        this.arr = new int[] {2,3,4,5,6};
    }
    public Student(Student other){
    this.rn = other.rn;
    this.name = other.name;
    this.arr = other.arr;
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
    System.out.println(aman.rn + " "+ kulsum.rn +" ");
    System.out.println(Arrays.toString(aman.arr));
    aman.arr[0] = 123;//you are changig 0 index of aman array but kulsum is also changed and this is what called as Shallow copy.
    System.out.println(Arrays.toString(kulsum.arr));
    }
}

