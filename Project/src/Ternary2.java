import java.util.Scanner;
public class Ternary2

{
public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		String Result = (a>0)?"Positive":"Negative";
		System.out.println(Result);
		}
}