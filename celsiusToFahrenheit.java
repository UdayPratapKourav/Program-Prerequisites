import java.util.*;
class celsiusToFahrenheit{
   public static void main(String [] args){
       System.out.println("Program Day01_practiceProblem!");
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the temperature in Celsius:");
	   double celsius = sc.nextDouble();
	   double fah = (celsius * 9/5)+32;
	   System.out.println("Temperature in Fahrenheit is : " + fah);
	   
	   }
	  }