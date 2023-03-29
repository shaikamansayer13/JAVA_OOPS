//Abstract Class 

import java.util.*;
 abstract class Cars{
    int code;
    Cars(int code){
        this.code = code;
    }
    
    abstract void Engine();
    abstract void Colour();
}
class Lambo extends Cars{
    public Lambo(int code){
        super(code);
    }
    @Override
     void Engine(){
        System.out.println("Its lambo baby");
    }
    
    @Override
    void Colour(){
       System.out.println("Whats your lambo colour : black");
    }
}
class Benz extends Cars{
    public Benz(int code){
    super(code); 
    }
    @Override
   void  Engine(){
        System.out.println("Its Benz baby");
    }
    
    @Override
    void Colour(){
       System.out.println("Whats your Benz colour : White");
    }
}
public class Main{
    public static void main(String [] args){
        Lambo lambo = new Lambo(32);
        Benz benz = new Benz(43);
        lambo.Engine();
        benz.Engine();
        System.out.println(lambo.code);
        System.out.println(benz.code);
    }
}
