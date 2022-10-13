import java.util.*;
public class Digit 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int n=sc.nextInt();
	  if(n<=9)
	  {
		  System.out.println("One digit");  
	  }
	  else if(n<=99)
	  {
		  System.out.println("two digit");
	  }
	  else if(n<=999)
	  {
		  System.out.println("Three digit");
	  }
	  
  }
}
