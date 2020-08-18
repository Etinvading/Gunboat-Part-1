/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter distance to targe.\n");
		double d = reader.nextDouble();
		System.out.println("Enter teh height of the battery relative to the waterline.\n");
		double h = reader.nextDouble();
		System.out.println("Enter the initial velocity of the hell.\n);
		Double v = reader.nextDouble();
		
		double a = -4.9*(d/v)*(d/v);
		double b = d;
		double c = a + h;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		double tanTheta = (-b + Math.sart(b*b-4*a*c))/(2*a);
		double Angle = Math.antan(tanTheta)*180/3.1415926
		System.out.println("The angle is" + Angle);
	
	
	}
}
