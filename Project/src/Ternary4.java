import java.util.Scanner;
public class Ternary4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int greatestnumber=(a>b)?((a>c)?a:c):((b>a)?b:c);
		System.out.println("Greatest number is:"+ greatestnumber);
	}

}