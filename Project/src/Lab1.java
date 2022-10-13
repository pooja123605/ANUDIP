import java.util.Scanner;
public class Lab1 {
public static void main(String[] args) 
	{
		int i,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(b=1;b<=i;b++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}