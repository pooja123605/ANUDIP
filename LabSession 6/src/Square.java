import java.util.*;
import java.lang.*;
public class Square implements Runnable 
{
   public static void main(String[] args) 
   {
	 Runnable r=new Runnable()
	 {
	    public void run()
	    {
	    	int sum=0;
	    	float avg=0;
	    	for(int i=1;i<50;i++)
	    	{
	    		sum+=i;
	    		avg=(sum/50);
	    	}
	    	System.out.println("Average="+avg);
	    }
	 };
	 Runnable r1=()->
	 {
		 int array[]= {10,20,30,40,50};
		 for(int i=0;i<array.length;i++)
		 {
			 int sqr=array[i]*array[i];
			 System.out.println("\nSquare of "+array[i]+ " = " +sqr);
		 }
	 };
	 new Thread(r).start();
	 Thread t=new Thread(r1);
	 t.start();
	 
   }
   public void run()
   {
	   
   }
}
