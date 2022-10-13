import java.util.Scanner;
public class For3{
	int m,n,i;
public static void main(String[] args) { 
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		int m=num*i;
		System.out.println(num+"*"+i+"="+m);
}
}
}
