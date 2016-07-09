package di8zhang;
class Actor{
	public void act(){}
}
class HappyActor extends Actor{
	public void act(){
		System.out.println("happyacotr");
	}
}
class SadActor extends Actor{
	public void act(){
		System.out.println("Sadactor");
	}
}
class Stage{
	private Actor actor = new HappyActor();
	public void change(){
		actor = new SadActor();
			
	}
	public void performPlay(){
		actor.act();
	}
}
public class Transmpgrify {
	public static void main(String[] args)
	{
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}
