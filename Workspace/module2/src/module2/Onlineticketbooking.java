package module2;

class Ticket
{
	int no_oftickets=10;
	void availabilitytickets()
	{
		System.out.println("availability tickets are "+no_oftickets);
	}
	void Book(int n)
	{
		if(n<=no_oftickets)
		{
			no_oftickets=no_oftickets-n;
			System.out.println("User booked "+n+"tickets");
			System.out.println("Avaialbility tickets are "+no_oftickets);
		}
		else
		{
			System.out.println("No tickets availalbe to book");
		}
	}
		void cancel(int m)
		{
			no_oftickets=no_oftickets+m;
			System.out.println("no of tickets cancelled are "+m);
			System.out.println("availablity tickets are "+no_oftickets);
			
		}
	}

public class Onlineticketbooking {

	public static void main(String[] args) {
		Ticket t=new Ticket();
		t.availabilitytickets();
		t.Book(5);
		t.cancel(2);
		
	}
}
