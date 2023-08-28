package BUILDER_CREATIONALDESIGNPATTREN;

public class meal {
	private String burger;
    private String drink;
    private String fries;
    private String dessert;
	public String getBurger() {
		return burger;
	}
	public void setBurger(String burger) {
		this.burger = burger;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getFries() {
		return fries;
	}
	public void setFries(String fries) {
		this.fries = fries;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	public meal(String burger, String drink, String fries, String dessert) {
		super();
		this.burger = burger;
		this.drink = drink;
		this.fries = fries;
		this.dessert = dessert;
	}
    public meal() {
    	
    }
	@Override
	public String toString() {
		return "meal [burger=" + burger + ", drink=" + drink + ", fries=" + fries + ", dessert=" + dessert + "]";
	}
    
    

}
