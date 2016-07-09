package di9zhang9_8;
interface Service{
	void method1();
	void method2();
	
}
interface ServiceFacotry{
	Service getService();
}
class Implementation1 implements Service{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("I1,m1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("I1,m2");

	}
}
class Implementation1Factory implements ServiceFacotry{

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		
		return new Implementation1();
	}
	
}
class Implementation2 implements Service{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("I2,m1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("I2,m2");

	}
}

class Implementation2Factory implements ServiceFacotry{

	@Override
	public Service getService() {
		// TODO Auto-generated method stub
		
		return new Implementation2();
	}
	
}

public class Factories {
	public static void serviceConsumer(ServiceFacotry fact)
	{
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args)
	{
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
		
	}
}
