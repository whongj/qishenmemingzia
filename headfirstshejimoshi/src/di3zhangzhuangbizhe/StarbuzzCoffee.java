package di3zhangzhuangbizhe;

public class StarbuzzCoffee {
	public static void main(String[] args){
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		//Beverage beverage2 = new DarkRost();
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription()+"$"+beverage.cost());

		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription()+"$"+beverage.cost());

		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription()+"$"+beverage.cost());
		System.out.println(beverage.description);
	}
}
