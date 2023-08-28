package BUILDER_CREATIONALDESIGNPATTREN;

public class waiter {
	private mealBuilder mealBuilder;

	public waiter(mealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}
	 public meal constructMeal() {
	        mealBuilder.buildBurger();
	        mealBuilder.buildDrink();
	        mealBuilder.buildFries();
	        mealBuilder.buildDessert();
	        return mealBuilder.getMeal();
	    }
	

}
