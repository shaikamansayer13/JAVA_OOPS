import java.util.*;
interface Engine{
    
    static final int price = 123423;
    void start();
    void stop();
    void acc();
}
interface Brake{
    void brake();
}
interface Media{
    void start();
    void stop();
}
class brake implements Brake{
    @Override
    public void brake(){
        System.out.println("Brake");
    }
}
class powerengine implements Engine{
     @Override
    public void start(){
        System.out.println(" E Start");
    }
     @Override
    public void stop(){
        System.out.println("E Stop");
    }
     @Override
    public void acc(){
        System.out.println(" E Accelerate");
    }
}
class  electricengine implements Engine{
     @Override
    public void start(){
        System.out.println(" EV Start");
    }
     @Override
    public void stop(){
        System.out.println("EV Stop");
    }
     @Override
    public void acc(){
        System.out.println(" EV Accelerate");
    }
}
class cdplayer implements Media{
     @Override
    public void start(){
        System.out.println(" M  Start");
    }
     @Override
    public void stop(){
        System.out.println("M Stop");
    }
    
}
class Car  {
    private Engine engine;
    private Media player = new cdplayer();
    private Brake brakes = new brake();
    public Car(){
        engine = new powerengine();
    }
    public Car(Engine engine){
        this.engine = engine;
    }
    
    public void start(){
        engine.start();
    }
    public void stop(){
       engine.stop(); 
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void brake(){
        brakes.brake();
    }
    
}
public class Main{
    public static void main(String [] args){
    Car cars = new Car();
    cars.start();
    cars.stop();
    cars.startMusic();
    cars.stopMusic();
    cars.brake();
   // cars.acc();
}
}
