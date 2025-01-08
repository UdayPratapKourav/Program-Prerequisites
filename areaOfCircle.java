import java.util.*;
class areaOfCircle{
	public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Area of Circle");
	System.out.println("Enter the redius of circle :");
	double redius =sc.nextDouble();
	double area = Math.PI*redius*redius;
	System.out.println("Area of Circle is :"+ area);
	}
}
	