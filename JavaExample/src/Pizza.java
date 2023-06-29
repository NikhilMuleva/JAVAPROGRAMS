
public class Pizza {
	String type="Regular";
	String toping1,toping2;
	boolean cheese;
	int price=150;
	
	public Pizza(boolean cheese) {
		this.cheese=cheese;
		
		if(cheese==true)
		{
			this.price=this.price+60;
		}
	}
	public Pizza(boolean cheese,String toping1) {
		this.toping1=toping1;
		this.cheese=cheese;
		if(cheese==true)
		{
			this.price=this.price+60+40;
		}
		else
		{
			this.price=this.price+60;
		}
	}
	public Pizza(String toping1,String toping2,boolean cheese) {
		this.toping1=toping1;
		this.toping2=toping2; this.cheese=cheese;
		if(cheese=true)
		{
			this.price=this.price+60+40+50;
			
		}
		else
		{
			this.price=this.price+60+40;
		}
	}
	
	void bill()
	{
		double gst=0.18+this.price;
		double total=gst+this.price;
		System.out.println("Type"+this.type);
		System.out.println("Toping1: "+this.toping1);
		System.out.println("toping2: "+this.toping2);
		System.out.println("Cheese: "+this.cheese);
		
		System.out.println("price"+this.price);
		System.out.println("Gst:"+gst);
		System.out.println("Total: "+total);
	}

	public static void main(String[] args) {
		Pizza p = new Pizza("onion", "Paneer", true);
		p.bill();
		
	}

}
