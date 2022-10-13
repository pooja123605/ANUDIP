public class Month 
{
	enum Level{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEPT,OCT,NOV,DEC};
	  public static void main(String[] args) 
	  {
		Level var=Level.MAR;
		
		switch(var)
		{
		case JAN:
			System.out.println("January");
			break;
		case FEB:
			System.out.println("Feburary");
			break;
		case MAR:
			System.out.println("March");
			break;
		case APR:
			System.out.println("April");
			break;
		case MAY:
			System.out.println("May");
			break;
		case JUN:
			System.out.println("June");
			break;
		case JUL:
			System.out.println("July");
			break;
		case AUG:
			System.out.println("August");
			break;
		case SEPT:
			System.out.println("Septamber");
			break;
	    case OCT:
			System.out.println("October");
			break;
		case NOV:
			System.out.println("November");
			break;
		case DEC:
			System.out.println("December");
			break;
		}
	  }
	}

