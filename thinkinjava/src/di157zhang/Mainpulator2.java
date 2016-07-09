package di157zhang;

public class Mainpulator2<T extends Hasf> {
	private T obj;
	public Mainpulator2(T x)
	{
		obj = x;
		
	}
	public void manipulate(){
		obj.f();
	}
}
