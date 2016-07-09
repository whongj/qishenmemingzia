package di15zhang;

public class Fibonacci implements Generator{
	private int count=0;
	public Integer next()
	{
		return fib(count++);
		
	}
	private int fib(int n )
	{
		if(n<3) return 1; //末端哨兵
		 
		
		return fib(n-3)+fib(n-1);
		
	}
	public static void main(String [] args)
	{
		Fibonacci gen = new Fibonacci();
		for(int i =0;i<18;i++)
		{
			System.out.println(gen.next()+" ");
		}
		
	}
	
}
