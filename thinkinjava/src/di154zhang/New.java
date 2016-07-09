package di154zhang;

import java.util.*;

public class New {
	public static <K,V> Map<K,V>  map(){
		return new HashMap<K,V>();
		
	}
	public static <T> List<T> list(){
		return new ArrayList<T>();
		
	}
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
		
	}
	public static <T> Set<T> set(){
		return new HashSet();
		
	}
	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
		
	}

	
}
