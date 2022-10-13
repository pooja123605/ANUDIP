import java.util.Scanner;
public class Traingle1 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Side AB= "); 
	int ab=sc.nextInt();
	System.out.println("Enter the Side BC= ");
	int bc=sc.nextInt();
	System.out.println("Enter the Side AC= ");
	int ac=sc.nextInt();

	  if(ab==ac && ab==bc && bc==ac)
	  {
      System.out.println("Equitaral Traingle");
	  }
	else if(ab==ac || ab==bc || bc==ac)
	{
		System.out.println("Isoscales Traingle");
	}
	else
	{
		System.out.println("Scalene Traingle");
	}
	}
  }

