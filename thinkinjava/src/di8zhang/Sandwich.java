package di8zhang;
class Meal{
	Meal()
	{
		System.out.println("Meal()");
	}
}
class Bread{
	Bread(){
		System.out.println("bREAD(");
	}
}
class Cheese{
	Cheese(){
		System.out.println("cheese(");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("lETTUCE");
		
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("lunch");
	}
}

public class Sandwich {

}
