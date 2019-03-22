package module4;
class Faculty1
{
	float total_sal=0;
	float salary=30000;
}
class HRA extends Faculty1
{
	float hra=2000;
}
class DA extends HRA
{
	float da=2000;
}
class Bonus extends DA
{
	float bns=1000;
}

public class multilevelinheritance {
	public static void main(String[] args) {
		Bonus bn=new Bonus();
		bn.total_sal=bn.bns+bn.da+bn.hra+bn.salary;
		System.out.println("total salary is "+bn.total_sal);
	}
}
