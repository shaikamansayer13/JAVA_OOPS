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
  
  this.weight = -1;
}
}
class Boxprice extends Boxweight{
    int cost;
    Boxprice(){
        this.cost = 32;
    }
    Boxprice(double l,double b ,double h,double weight,int cost){
        super(l,b,h,weight);
        this.cost = 34;
    }
}
public class Main
{
  public static void main (String[]args)
  {
   Boxweight box1 = new Boxweight(3,4,5,6);
   Boxprice box2 = new Boxprice();
   System.out.println(box2.h + " "+ box2.weight + " " +box2.cost );
   
  }
}
