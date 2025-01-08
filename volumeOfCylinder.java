import java.util.*;
class volumeOfCylinder{
  public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Calculate volume Of Cylinder");
  System.out.println("Enter the radius of cylinder :");
  double radius = sc.nextDouble();
  System.out.println("Enter the height of the cylinder :");
  double height = sc.nextDouble();
  double volume = Math.PI*radius*radius*height;
  
  
  System.out.println("Volume of Cylinder is :" + volume);
  }
 }
 
  