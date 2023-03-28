import java.util.*;

class Shapes
{
  void area ()
  {
    System.out.println ("i am in the shapes");
  }
}
class square extends Shapes
{
  void area ()
  {
    System.out.println ("i am in the square");
  }
}
class triangle extends Shapes
{
  void area ()
  {
    System.out.println ("i am in the triangle");
  }
}

public class Main{
    public static void main(String [] args){
        Shapes obj = new Shapes();
        square square = new square();
        triangle tri = new triangle();
        Shapes squ = new square();
        obj.area();
        square.area();
        tri.area();
        squ.area();
    }
}
//another good example 
import java.util.*;
class Sum{
    int a ;
    int b ;
    int c ; 
    //its method overloading same name constructor but having different arguments
    Sum(){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Sum(int a ,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int  Sum(int a ,int b){
        return a+b;
    }
    public int Sum(int a , int b, int c){
        return a+b+c;
    }
}
public class Main{
    public static void main(String [] args ){
        Sum s = new Sum(1,2,3); // iam using second constructor
        System.out.println(s.Sum(1,2,3));//using second method of same name Sum 
    }
}
