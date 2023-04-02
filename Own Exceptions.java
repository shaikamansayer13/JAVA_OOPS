import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
      Scanner sc = new Scanner(System.in);
      
    int a = sc.nextInt();
    int b = sc.nextInt();
      try
    {
     System.out.println(divide(a,b));
    }
    catch (Exception e)
    {
      System.out.println (e.getMessage ());
    }
    finally{
      System.out.print("it will run if there is an exception or if there is not an Exception");
  }
  }
  public static int divide(int a,int b) throws ArithmeticException{ //in which fuction you use throw you have to extend that with throws name of exception.
      if(b==0){
         throw new ArithmeticException("not with zero dude");   //remeber to use throw and new and then name of the exception.
      }
      return a/b;
  }
}

