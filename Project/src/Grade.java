public class Grade 
{
  enum Level{LOW,MEDIUM,HIGH}
  public static void main(String[] args) 
  {
	Level var=Level.MEDIUM  ;
	switch(var)
	{
	case HIGH->
      System.out.println("High volume");
      
	case MEDIUM->
	  System.out.println("Medium volume");
	  
	case LOW->
	   System.out.println("Low volume");
	}
  }  
}
