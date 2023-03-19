/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

******************************************************************************/
import java.util.*;

public class Staticblock{
    static int a = 4;
    static int b;
    //will only run once when the first object is created
    static{
        System.out.println("I am in Static Block");
        b = a * 5;
    }
    public static void main(String [] args){
        Staticblock obj = new Staticblock();
        System.out.println(Staticblock.a +" "+ Staticblock.b);
        Staticblock.b += 3;
        System.out.println(Staticblock.a +" "+ Staticblock.b);
    }
}
