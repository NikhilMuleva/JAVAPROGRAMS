package Abstraction;

public class CellingFan extends Fan {
	public CellingFan(String n, String c, int p) {
		this.name=n;
		this.color=c;
		this.price=p;
	}

	public static void main(String[] args) {
		CellingFan cf= new CellingFan("Usha", "red", 70000);
		cf.details();
		cf.switchOn();
		cf.switchOf();
		cf.incSpeed();
		cf.decSpeed();

	}

}
