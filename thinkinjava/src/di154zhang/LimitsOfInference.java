package di154zhang;

public class LimitsOfInference {
	static void f(Map<Person,List<? exnteds Pet>> petPeople){}
	public static void main(String[] args)
	{
		f(New.<Person,List<Pet>>map());
	}
}
