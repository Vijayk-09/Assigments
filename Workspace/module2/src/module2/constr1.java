package module2;

class Student1
{
	String name;
	int id;
	Student1(String n, int i)
	{
		name=n;
		id=i;
	}
	void show()
	{
		System.out.println("name is "+name+" and id is "+id);
	}
}
public class constr1 {
	public static void main(String[] args) {
		
		Student1 s=new Student1("vijay",1);
		Student1 s2=new Student1("xyz",2);
		s.show();
		s2.show();	
	}
}
