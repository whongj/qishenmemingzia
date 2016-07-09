package di7zhang;

class Soap{
	private String s;
	Soap(){
		System.out.println("Soap()");
		s="Constructed";
		
	}
	public String toString(){
		return s;
		
	}
	
}
public class Bath {
	private String s1="Happy",s2="happy",s3,s4;
	private Soap castille;
	private int i ;
	private float toy;
	public Bath(){
		System.out.println("Inside Bash()");
		s3="joy";
		toy=3.14f;
		castille = new Soap();
		
	}
	{
		i=47;
	}
	
}
