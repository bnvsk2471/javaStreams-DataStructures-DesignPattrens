package BUILDER_CREATIONALDESIGNPATTREN;

public interface mealBuilder {
	void buildBurger();
    void buildDrink();
    void buildFries();
    void buildDessert();
    meal getMeal();
}
