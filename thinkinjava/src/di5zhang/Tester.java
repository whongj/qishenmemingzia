package di5zhang;

public class Tester {
	public static void main(String[] args)
	{
		Integer var1=new Integer(1);
		Integer var2=var1;
		int i =1;
		doSomething(i);
		System.out.println(i);
		doSomething(var2);
		System.out.println(var1.intValue());
		System.out.println(var2.intValue());

		System.out.println(var1==var2);
		System.out.println(var1.equals(var2));
	}
	public static void doSomething(Integer integer)
	{
		integer=4;
		integer = new Integer(2);
	}
}
