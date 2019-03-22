package module4;
class Faculty
{
	float salary=3000;
}
class Science extends Faculty
{
	float bonus=2000;
}
public class Singleinheritance {
	public static void main(String[] args) {
		Science sc=new Science();
		System.out.println("Faculty salary is "+sc.salary);
		System.out.println("Faculty bonus is "+sc.bonus);
	}
}
