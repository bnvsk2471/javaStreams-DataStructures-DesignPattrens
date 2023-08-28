package BUILDER_CREATIONALDESIGNPATTREN;

public class nonVegMealBuilder implements mealBuilder {

	private meal meal=new meal();
	@Override
	public void buildBurger() {
		meal.setBurger("ChickenBurger");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("coke");
	}

	@Override
	public void buildFries() {

		meal.setFries("wingfries");
	}

	@Override
	public void buildDessert() {

		meal.setDessert("jamun");
	}

	@Override
	public meal getMeal() {

		return meal;
	}

}
