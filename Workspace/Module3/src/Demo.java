//import org.omg.Messaging.SyncScopeHelper;

class Employee
{
	String id;
	String name;
	String designation;
	void swipecard()
	{
		System.out.println("Employee swiped the card");
	}
	void showdetails(String a,String b,String c)
	{
		this.id=a;
		this.name=b;
		this.designation=c;
	
		System.out.println("Employee id is "+id);
		System.out.println("Employee name is "+name);
		System.out.println("Employee designation is "+designation);
	}

}
class Developer extends Employee 
{
	void develop()
	{
		System.out.println("Developer Developing the application");
		System.out.println();
	}
}
class Tester extends Employee 
{
	void test()
	{
		System.out.println("tester testing the application");
		System.out.println();
	}
}
class Manager extends Employee 
{
	void Mangage()
	{
		System.out.println("manager managing the team");
		System.out.println();
	}
}
public class Demo {
public static void main(String[] args) {
	Developer d=new Developer();
	d.swipecard();
	d.showdetails("1da","vijay","developer");
	d.develop();
	Tester t=new Tester();
	t.swipecard();
	t.showdetails("2da","basheer","tester");
	t.test();
	Manager m=new Manager();
	m.swipecard();
	m.showdetails("3da","Satish","Manager");
	m.Mangage();
}
}
