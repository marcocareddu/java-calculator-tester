
public class Ticket {

//  Const
	private final float KM_COST = 0.21F;
	private final int JUNIOR = 18;
	private final int SENIOR = 65;
	private final int JUNIOR_DISCOUNT = 20;
	private final int SENIOR_DISCOUNT = 40;
	
//	Properties
	private double price;
	private double discount;
	private double age;
	private int km;
	
//	Constructor
	public Ticket(double age, int km) {
		setAge(age);
		setKm(km);
	}

//	Getters
	public double getPrice() {
		return price;
	}
	private float getGrossTicket() {
		return km * KM_COST;
	}
	private double getFinalPrice() {
		return getGrossTicket() - discount;
	}
	
//	Setters
	public void setAge(double age) {
		if(age <= 0) {
			throw new IllegalArgumentException("Age must be greater than 0.");
		}
		this.age = age;
	}
	public void setKm(int km) {
		if(km <= 0) {
			throw new IllegalArgumentException("km must be greater than 0.");
		}
		this.km = km;
	}
	private void setDiscount() {
		if(age <= JUNIOR) {
			discount = (getGrossTicket() * JUNIOR_DISCOUNT)/100;
		} else if (age >= SENIOR) {
			discount = (getGrossTicket() * SENIOR_DISCOUNT)/100;
		}
	}
}
