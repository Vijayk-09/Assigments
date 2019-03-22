package module2;

class Tree
{
	String name="fruits";
}
class Fruits
{
	String type="Fruits";
}
class Former
{
	Tree Growing()
	{
		Tree t=new Tree();
		System.out.println("Farmer Growing "+t.name+" tree");
		return t;
	}
	Fruits Giving()
	{
		Fruits s=new Fruits();
		System.out.println("tree giving "+s.type);
		return s;
	}
}
class people
{
	void eating()
	{
		Former f=new Former();
		Tree t=f.Growing();
		Fruits s=f.Giving();
		System.out.println("people eating "+t.name);	
	}
}
public class returntype2 {

	public static void main(String[] args) {
		people p=new people();
		p.eating();
	}
}
