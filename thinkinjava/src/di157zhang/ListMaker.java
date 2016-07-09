package di157zhang;
import java.util.*;
public class ListMaker<T>{
	List<?> create(){
		return new ArrayList();
		
	}
	public static void main(String[] args)
	{
		ListMaker<String> stringMaker = new ListMaker<String>();
		List<String> stringlist = (List<String>) stringMaker.create();
		
	}

}
