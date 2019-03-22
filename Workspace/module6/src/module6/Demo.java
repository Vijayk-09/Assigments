package module6;
class User
{
	Mobile m=new Mobile();
	void using()
	{
		System.out.println("using the phone");
	}
}
class Mobile
{
	Setting s=new Setting();
	void on()
	{
		System.out.println("Switching on  the phone");
	}
}
class Setting
{
	Wifi w=new Wifi();
	void doset()
	{
		System.out.println("setting the phone");
	}
}
class Wifi
{
	void wifion()
	{
		System.out.println("switch on the wifi");
	}
}
public class Demo {
	public static void main(String[] args) {
		User u=new User();
		u.using();
		u.m.on();
		u.m.s.doset();
		u.m.s.w.wifion();	
	}

}
