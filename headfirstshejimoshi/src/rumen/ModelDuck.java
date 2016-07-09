package rumen;

public class ModelDuck extends Duck{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm model duck");
	}
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior=new Quack();
		
	}
	
}
