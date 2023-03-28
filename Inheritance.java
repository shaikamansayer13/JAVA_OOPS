//when we inherit the properties of Base class into derived class and we do this with the help of extends keyword
//now with the below example you can understand it very easily.

//in this example iam taking the box as parent class and box weight as derived/child class 
import java.util.*;

 class Box
{
  double l;
  double b;
  double h;

    Box ()
  {
    this.l = l;
    this.b = b;
    this.h = h;
  }
  Box (double side)
  {
    this.l = l;
    this.b = b;
    this.h = h;
  }
  Box (double l, double b, double h)
  {
    this.l = l;
    this.b = b;
    this.h = h;
  }
}

class Boxweight extends Box
{
  double weight;
    Boxweight ()
  {
    this.weight = -1;
  }
  Boxweight(double l,double b ,double h,double weight){
  super(l,b,h);
  this.weight = weight;
}
}
public class Main
{
  public static void main (String[]args)
  {
   Boxweight box1 = new Boxweight(3,4,5,6);
   System.out.println(box1.h + " "+ box1.weight );
  }
}
