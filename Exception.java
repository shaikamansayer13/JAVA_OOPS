public class Main
{
  public static void main (String[]args)
  {
    int a = 4;
    int b = 0;
      try
    {
      int c = a / b;
    }
    catch (Exception e)
    {
      System.out.println (e.getMessage ());
    }
    finally{
      System.out.print("it will run if there is an exception or if there is not an Exception");
  }
}
}



