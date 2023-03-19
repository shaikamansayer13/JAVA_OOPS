/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// oops concept :- Constructor
import java.util.*;
//we should first write the class which we are going to include in the code .
    class Student{
        int rn;
        String name;
        float marks;
        
        void greeting(){
            System.out.println("Good morning :-" + this.name);
        }
        void changename(String newname){
            this.name = newname;
        }
        Student (){ //this line is a constructor.
        this.rn = 32;
		this.name = "Shaik Aman Sayer"; 
		this.marks = 462f;
        }
    }
    //then after the collection of data or properties and methods we have to write the Main 
    
    public class Main{
	public static void main(String[] args){
		Student aman = new Student();
		Student rahul = new Student();
		//this is the process to create the object. 
		//aman.rn = 32;//with the help of dot operator we can link the reference variable with the properties of instance variable 
		//aman.name = "Shaik Aman Sayer";
		//aman.marks = 462f;
		System.out.println(aman.rn);//simply printing the namew 
			System.out.println(aman.name);
				System.out.println(aman.marks);
				aman.changename("sayer");
				aman.greeting();
	}
    }


// we can also set the default values in the class itself

