package BUILDER_CREATIONALDESIGNPATTREN;

public class Main {
	
	public static void main(String[] args) {
		mealBuilder vegMealBuilder=new nonVegMealBuilder();
		waiter waiter=new waiter(vegMealBuilder);
		meal vegMeal=waiter.constructMeal();
		System.out.println(vegMeal);
		
		houseBuilder01 houseBuilder= new SingleStoreyHouse01();
		HouseDirector01 houseDirector=new HouseDirector01(houseBuilder);
		System.out.println(houseDirector.buildHouse());
	}

}
