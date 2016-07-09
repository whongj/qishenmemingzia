package di9zhang9_8;

class A {
	public interface B{
		void f();
		
	}
	
	public class BImp implements B {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
	}
	
	

public class BImp2 implements B{
	public void f(){}
}
 	public interface C{
 		void f();
 	}
	
	public class CImp implements C {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	private class CImp2 implements C {

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}

	}

	private interface D{
		void f();
	}
	private class DImp implements D{
		public void f(){}
		
	}
	public class DImp2 implements D{
		public void f(){}
		
	}
	public D getD(){
		return new DImp2();
	}
	private D dRef;
	public void receiveD(D d)
	{
		dRef =d;
		dRef.f();
	}

}

 
 interface E{
	 interface G{
		 void f();
		 
	 }
	 public interface H{
		 void f();
	 }
	 void g();
	 
 }
 
public class NestingInterfaces {
	public class BImp implements A.B{
		public void f(){}
	}
	class CImp implements A.C{
		public void f(){}
	}
	//class DImp2 implements A.D   //因为是私有的
	class EImp implements E{
		public void g(){};
	}
	class EGImp implements E{
		public void g(){}
		class EG implements E.G{
			public void f(){}
		}
	}
	public static void main(String[] args)
	{
		A a = new A();
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}
