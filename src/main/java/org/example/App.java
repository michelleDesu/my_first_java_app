package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, \nMichelle!" );

        String my_first_name = "Michelle";
        System.out.println(my_first_name);

        String first = "Michelle",
                last = "Johansson";
        System.out.println(first + " " + last);

        float firstNum = 30.5f,
                secondNum = 20.2f,
                result = firstNum + secondNum;
        System.out.println(result);

        int score = 65;

        if(score >= 65){
            System.out.println("you passed");
        }else{
            System.out.println("You did not pass");
        }

        Scanner obj = new Scanner( System.in);
       System.out.println("\n\nType your name here");

       String name = obj.nextLine();
        System.out.println(name);


        class Car{
                String brand,
                        regNr,
                        ownerName;
                int     maxSpeed;
                void print() {
                    System.out.println(
                            "Owner: " + ownerName + "\n" +
                                    "Brand: " + brand + "\n" +
                                    "Regnumber: " + regNr + "\n" +
                                    "Max speed: " + maxSpeed + "\n"
                    );
                }
        }

        Car volvo = new Car();
        volvo.brand = "Volvo";
        volvo.regNr = "HSJ520";
        volvo.maxSpeed = 256;
        volvo.ownerName = "Ask av Grane";
        volvo.print();

        }
}
