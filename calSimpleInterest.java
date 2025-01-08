import java.util.*;
class calSimpleInterest{
	public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Principle :");
   double priciple = sc.nextDouble();
   System.out.println("Enter rate :");
   double rate = sc.nextDouble();
   
   System.out.println("Enter time :");
   double time = sc.nextDouble();
   
   double interest=(priciple*rate*time)/100;
   System.out.println("Simple interest is : " + interest);
   
   }
   
  }
   
   