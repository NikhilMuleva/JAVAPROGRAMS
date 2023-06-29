package Abstraction;

public class TableFan  extends Fan{
	public TableFan(String n ,String c ,int p) {
		this.name=n;
		this.color=c;
		this.price=p;
	}

	public static void main(String[] args) {
		TableFan t= new TableFan("Bajaj","black",5000);
		t.details();
		t.switchOf();
		t.switchOn();
		t.incSpeed();
		t.decSpeed();

	}

}
