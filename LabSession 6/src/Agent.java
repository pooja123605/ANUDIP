import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
class Agent1 implements Comparable<Agent1>
{
	private int id;
	private String name;
	private String area;
   Agent1(int id,String name,String area)
   {
	   this.id=id;
	   this.name=name;
	   this.area=area;
   }
   public int getId()
   {
	   return id;
   }
   public void setId(int id)
   {
	   this.id=id;
   }
   public String getName()
   {
	   return name;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public String getArea()
   {
	   return area;
   }
   public void setArea(String area)
   {
	   this.area=area;
   }
  public int compareTo(Agent1 a)
	{
		return this.area.compareTo(a.area);
	}
	}
public class Agent 
{
   public static void main(String[] args) 
   {
	ArrayList<Agent1> d=new ArrayList<>();
	d.add(new Agent1(1,"ram","delhi"));
	d.add(new Agent1(2,"aashish","haryana"));
	d.add(new Agent1(3,"deep","mumbai"));
	d.add(new Agent1(4,"neha","pune"));
	d.add(new Agent1(5,"aasha","satara"));
	d.add(new Agent1(6,"anshu","banglore"));
	Collections.sort(d);
	for(Agent1 i:d)
	{
		System.out.println(i.getId()+" "+i.getName()+" "+i.getArea());
	}
   }
}
