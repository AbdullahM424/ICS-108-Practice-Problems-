import java.util.*;
public class Temperature{
     public static void main(String[] args){
        double farenhit, celsius;
        System.out.println("Please enter the temperature in celsius:");
        Scanner input= new Scanner(System.in);
        celsius= input.nextDouble();

        farenhit= (celsius*9/5)+32;
        
        System.out.println("Celsius    "+"Fahrenheit");
        System.out.print(celsius+"        ");
        System.out.print(farenhit);
     }


    
}