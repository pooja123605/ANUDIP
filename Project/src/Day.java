public class Day 
{
  enum Level{MON,TUE,WED,THU,FRI,SAT,SUN};
  public static void main(String[] args) 
  {
	Level var=Level.FRI;
	
	switch(var)
	{
	case MON:
		System.out.println("Monday");
		break;
	case TUE:
		System.out.println("Tuesday");
		break;
	case WED:
		System.out.println("Wednesday");
		break;
	case THU:
		System.out.println("Thursday");
		break;
	case FRI:
		System.out.println("Friday");
		break;
	case SAT:
		System.out.println("Saturday");
		break;
	case SUN:
		System.out.println("Sunday");
		break;
		
	}
  }
}

