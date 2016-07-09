package di4zhangfactory;

public class NYPizzaStore extends pizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")){
			return null;
		}else return null;
	}
	
}
