import java.util.*;
public class Kid
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int a,b,c;
	  System.out.println("Enter the sides");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  c=sc.nextInt();
	  if(a<b+c && b<a+c && c<a+b)
	  {
		  if(a==b && b==c)
			  System.out.println("kid will get first prize");
		  else if(a==b|| b==c|| c==a)
			  System.out.println("kid will get second prize");
		  else
			  System.out.println("kid will get third prize");
	  }
	  else
		  System.out.println("cannot form traingle");
  }
}