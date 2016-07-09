package rumen;

public class MiniDuckSimluator {
	public static void main(String[] args)
	{
		 Duck mallard = new ModelDuck();
		 mallard.performFly();
		 mallard.setFlyBehavior(new FlyRocketPowered());
		 mallard.performFly();
	}
}
