import java.util.Scanner;
public class Fibonacci1
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int num=sc.nextInt();
	  System.out.println("Fibonacci serieas are: ");
	  int f1,f2=0,f3=1;
	  for(int i=1;i<=num;i++)
	  {
		  System.out.println(f3+" ");
		  f1=f2;
		  f2=f3;
		  f3=f1+f2;
	  }
  }
}
