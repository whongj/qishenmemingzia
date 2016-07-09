package di5zhangdantengmoshi;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	static private ChocolateBoiler haha;
	private ChocolateBoiler (){
			empty=true;
			boiled=false;
		
			
	}
	public static ChocolateBoiler getCB(){
		if(haha==null){
			haha=new ChocolateBoiler();
			
		}
		return haha;
	}
}
