package module2;

class Pen
{
	String color="black";
}
class Teacher
{
	Pen Giving()
	{
		Pen p=new Pen();
		System.out.println("Giving "+p.color+" pen to a studet");
		return p;
	}
}
class Student
{
	void accepting()
	{
		Teacher t=new Teacher();
		Pen p=t.Giving();
		System.out.println("Accepting "+p.color+" pen from teacher");
		
	}
}
public class Returntype {
	public static void main(String[] args) {
		Student s=new Student();
		s.accepting();
	}

}
