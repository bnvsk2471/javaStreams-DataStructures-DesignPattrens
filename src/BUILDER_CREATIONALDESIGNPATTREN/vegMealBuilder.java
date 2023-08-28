package BUILDER_CREATIONALDESIGNPATTREN;

public class vegMealBuilder implements mealBuilder {

	private meal meal=new meal();
	@Override
	public void buildBurger() {
		meal.setBurger("PannerBurger");
	}

	@Override
	public void buildDrink() {
		meal.setDrink("OrangeJuice");
	}

	@Override
	public void buildFries() {

		meal.setFries("PotatoFries");
	}

	@Override
	public void buildDessert() {

		meal.setDessert("Halwa");
	}

	@Override
	public meal getMeal() {

		return meal;
	}

}
