import java.util.Scanner;
public class Calculator1
{
  public static void main(String[] args) 
  {
	 int a,b,add,sub,mul,opt;
	 float div;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the first number");
	 a=s.nextInt();
	 System.out.println("Enter the second number");
	 b=s.nextInt();
	 while(true)
	 {
		 System.out.println("Enter 1 for addition");
		 System.out.println("Enter 2 for subtraction");
		 System.out.println("Enter 3 for multiplication");
		 System.out.println("Enter 4 for division");
		 System.out.println("Enter 5 to exit");
		 opt=s.nextInt();
		 switch(opt)
		 {
		 case 1:
			  add=a+b;
			  System.out.println("Result:"+add);
			  break;
			  
		 case 2:
			  sub=a-b;
			  System.out.println("Result:"+sub);
			  break;
			  
		 case 3:
			  mul=a*b;
			  System.out.println("Result:"+mul);
			  break;
			  
		 case 4:
			  div=a%b;
			  System.out.println("Result:"+div);
			  break;
			  
		 case 5:
			  System.exit(0);
			  
			   } } } }

