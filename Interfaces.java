
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
class Car implements Engine , Brake,Media{
    
    
    @Override
    public void brake(){
        System.out.println("BRAKE");
    }
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
        System.out.println("Accelerate");
    }
}
public class Main{
    public static void main(String [] args){
    Car cars = new Car();
    cars.start();
    cars.stop();
    cars.brake();
    cars.acc();
    //WHEN I WANT TO START THE MEDIA OF THE CAR THE ENGINE IS STARTING HOW CAN THIS BE POSSIBLE BECAUSE YOU ARE HAVING SAME NAMES OF THE METHODS IN ENGINE INTERFACE AND MEDIA INTERFACE DONT WORRY THIS CAN BE SOLVED.
    Media carss = new Car();
    carss.stop();
    carss.start();
    }
}
