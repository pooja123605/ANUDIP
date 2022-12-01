public class Patternnum 
{
	public static void main(String[] args) 
	{
      int n=0;
      for(int i=1;i<=5;i++)
      {
    	  for(int j=5;j>n;j--)
    	  {
    	  System.out.print(j);
    	  }
    	  for(int k=n+1;k<=5;k++)
    	  {
    		  System.out.print(k);  
    	  }
    	  System.out.println(); 
    	  n=n+1;
      }
	}
}