package di7zhang;

class Gizmo{
	public void spin(){}
}

public class FinalArguments {
	public final Gizmo o; 
	private final Poppet k;
	
	public FinalArguments(){
		
		o = new Gizmo();
		k=new Poppet(0);
		
	}
	void with(final Gizmo g)
	{
	  //a=new Gizmo();
	}
	void without(Gizmo g)
	{
		g=new Gizmo();
		g.spin();
	}
	int g(final int i )
	{
		return i+1;
		
	}
	public static void main(String[] args)
	{
		FinalArguments bf = new FinalArguments();
		bf.without(null);
		bf.with(null);
	}
}
