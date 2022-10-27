 import java.util.*;
 class Shape
 {
	 static final double PI=Math.PI;
	 	void Area(float a)
	 	{
	 		float A=a*a;
	 		System.out.println("Area of the square:"+A);
	 		
	 	}
 void Area(double a)
	{
		double A=PI*a*a;
		System.out.println("Area of the Circle:"+A);
		
	}
}
public class Circle
{
	public static void main(String[] args) 
	{
		Shape s=new Shape();
		s.Area(20.7);
		s.Area(9);
	}
}