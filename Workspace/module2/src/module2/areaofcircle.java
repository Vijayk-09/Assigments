package module2;


public class areaofcircle {

	double pie=3.14;
	void area(double r)
	{
		double a=pie*r*r;
		System.out.println("area of circle is "+ a);
	}
	void circumference(double r)
	{
		double c=2*pie*r;
		System.out.println("circumfernce of the circle is "+ c);
	}
	public static void main(String[] args) {
		
		areaofcircle a=new areaofcircle();
		a.area(4.1);
		a.circumference(2.2);
	}
}
