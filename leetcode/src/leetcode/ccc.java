package leetcode;

public class ccc{
public int countNumberOf2s(int n) {

	        // write code here
	            // write code here
	int x=0;
	for(;n>0;)
	{
		if(n%10==2)
		{
			x++;
		}
		n/=10;
	}
	return x;
	}
	    

public static void main(String [] args)
{
	ccc a = new ccc();
	System.out.println(a.countNumberOf2s(1232));
	
}
}