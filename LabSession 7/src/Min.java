import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class StudentInfo 
{
	private int id;
	private String name;
	private int age;
	private int Maths_marks;
	
	
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getMaths_marks() 
	{
		return Maths_marks;
	}
	public void setMaths_marks(int maths_marks) 
	{
		Maths_marks = maths_marks;
	}
	public StudentInfo (int id, String name, int age, int maths_marks)  // parameterized constructor
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Maths_marks = maths_marks;
	}
	public StudentInfo () 
	{
		
	}
	
	
}


public class Min
{

	public static void main(String[] args) 
	{
		List<StudentInfo > stud = new ArrayList<>();  
		stud.add(new StudentInfo (1,"Prerana",22,90));
		stud.add(new StudentInfo (2,"Riya",22,79));
		stud.add(new StudentInfo (3,"Priya",24,80));
		stud.add(new StudentInfo (4,"Pooja",21,86));
		stud.add(new StudentInfo (5,"Rutika",22,58));
		stud.add(new StudentInfo (6,"Athrav",22,70));
		
		System.out.println("Maximum Marks :");
		StudentInfo  SMax = stud.stream().max((stud1,stud2)->stud1.getMaths_marks()>stud2.getMaths_marks()?1:-1).get();
		System.out.println(SMax.getId()+" "+SMax.getName()+" "+SMax.getMaths_marks());
		
		
		
		System.out.println("Minimum Marks :"); 
		StudentInfo  SMin = stud.stream().min((stud1,stud2)->stud1.getMaths_marks()>stud2.getMaths_marks()?1:-1).get();
		System.out.println(SMin.getId()+" "+SMin.getName()+" "+SMin.getMaths_marks());

	}

}

