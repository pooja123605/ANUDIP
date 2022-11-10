

public class Shape 
{
    
    public static void main(String[] args)
    {
       CalculateArea ob = new CalculateArea();
	   ob.area(4);
	   ob.area(5.5);
    }
}
class CalculateArea
{
    void area(float x)
    {
        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}