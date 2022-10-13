import java.util.*;
public class Pattern2 
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num+1;i++)
		{
			for(int b=1;b<=num+1-i;b++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=i+1-i;b++)
			{
				System.out.print(b);
			}
			for(int b=i-1;b>0;b--)
			{
				System.out.print(b);
			}
			System.out.println();
        }
}
}



