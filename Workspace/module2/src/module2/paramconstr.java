package module2;

class param
{
	param(int i,double j)
	{
		System.out.println("hi");
		double c=i+j;
		System.out.println(c);
		}
	void show()
	{
		System.out.println("end of the parameterised constructor");
	}
}
public class paramconstr {

	public static void main(String[] args) 
	{

		param d=new param(10,10.1);
		d.show();
	}

}
