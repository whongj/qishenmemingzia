package di157zhang;

public class ReturnGenericType<T extends Hasf> {
	private T obj;
	public  ReturnGenericType(T x){
		obj = x;
	
	}	
	public T get(){
			return obj;
			
		}
}
