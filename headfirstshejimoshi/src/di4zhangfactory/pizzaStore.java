package di4zhangfactory;

public abstract class pizzaStore {
	public Pizz OrderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		
	}
	protected abstract Pizza createPizza(String type);
}
