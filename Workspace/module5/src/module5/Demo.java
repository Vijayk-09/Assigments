package module5;
class Test
{
	public static void main(String[] args) {
		System.out.println("hi");
	}
}
class Sample extends Test
{
	public static void main(String[] args) {
		System.out.println("hello");
	}
}
public class Demo {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.main("vijay");
	}
}