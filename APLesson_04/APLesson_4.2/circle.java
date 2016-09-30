import java.util.Scanner;

public class circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the radius of your circle in inches?");
		r = kb.nextInt();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (r*r)*3.14;
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a " + r + " inch radius is %.5f.", area);
	}
}