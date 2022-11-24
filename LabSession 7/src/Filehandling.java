import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Filehandling 
{
	public static void main(String[] args) throws IOException {
     File f=new File("D:\\File Handling\\java.txt");
     System.out.println("Print words whos length greater than 5: ");
     Scanner sc=new Scanner(f);
     String st="";
     String s=sc.nextLine();
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)!=' ') 
    	 {
    		 st+=s.charAt(i);
    	 }
    	 else
    	 {
    		if(st.length()>5)
    			System.out.println(st+" ");
    		st=" "; 
    	 }
     }
     sc.close();
	}
}