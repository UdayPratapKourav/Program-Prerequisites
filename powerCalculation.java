import java.util.*;
class powerCalculation{
   public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter base :");
   double base = sc.nextDouble();
   System.out.println("Enter exponent :");
   double expo = sc.nextDouble();
   
   
   
   double ans=Math.pow(base,expo);
   System.out.println("Answer is : " + ans);
   
   }
   
  }
   