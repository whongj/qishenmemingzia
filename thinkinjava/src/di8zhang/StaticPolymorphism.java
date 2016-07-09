package di8zhang;
class StaticSuper{
	public static String staticGet(){
		return "Base staticGet()";
		
	}
	public String dynamicGet(){
		return "Base dynamicGet()";
	}
}
class staticSub extends StaticSuper{
	public static String staticGet(){
		return "Derived staticGet()";
	}
	public String dynamicGet(){
		return "Derived dynameicGet()";
		
	}
	
}
public class StaticPolymorphism {
	public static void main(String[] args)
	{
		StaticSuper sup = new staticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
		
	}
}
