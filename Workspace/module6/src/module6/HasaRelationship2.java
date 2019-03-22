package module6;
class Address 
{  
	String city,state,country;  
	public Address(String city, String state, String country) 
	{  
    this.city = city;  
    this.state = state;  
    this.country = country;  
	}
}  
class Emp 
{  
	int id;  
	String name;  
	Address address;  
  
public Emp(int id, String name,Address address) 
{  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}   
void display()
{  
	System.out.println("Employee details");
	System.out.println("id:" +id);
	System.out.println("name: "+name);
	System.out.println("address details");
	System.out.println(address.city+"\n"+address.state+"\n"+address.country); 
	System.out.println();
}  
}
public class HasaRelationship2 {
	public static void main(String[] args) 
	{
		Address address1=new Address("Basavanagudi","Karntaka","india");  
		Address address2=new Address("rajajinagar","Karntaka","india");  
		  
		Emp e=new Emp(111,"varun",address1);  
		Emp e2=new Emp(112,"arun",address2);  	      
		e.display();  
		e2.display();  
	}
}
