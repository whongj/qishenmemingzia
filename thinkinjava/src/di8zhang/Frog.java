package di8zhang;
class Characteristic{
	private String s;
	Characteristic(String s)
	{
		this.s=s;
		System.out.println("Creating Characteristic"+s);
	}
	protected void dispose(){
		System.out.println("disposing characteristic"+s);
	}
}
class Description{
	private String s;
	Description(String s)
	{
		this.s=s;
		System.out.println("Creating Description"+s);

	}
	protected void dispose(){
		System.out.println("disposing Description"+s);
	}
}
class LivingCreaure{
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	LivingCreaure(){
		System.out.println("LivingVCreature");
	}
}
class Animal extends LivingCreaure{
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("animal not vegetable");
	Animal(){
		System.out.println("Animals");
	}
	protected void dispose(){
		System.out.println("Animals dispose");
		t.dispose();
		p.dispose();
	}
}

class Amphibian extends Animal{
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	Amphibian(){
		System.out.println("Amphibian");
	}
	protected void dispose(){
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	Frog(){
		System.out.println("Frog");
	}
	protected void dispose(){
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	public static void main(String[] args)
	{
		Frog frog = new Frog();
		System.out.println("Bye");
		frog.dispose();
	}
}
