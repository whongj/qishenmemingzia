package leetcode;




public class Count2 {
    public int countNumberOf2s(int n) {
    	int i =1;
    	double w=n;
    	int y=0;
    	System.out.println(n);
    	for(;n>1;)
    	{
    		i++;
    		n=n/10;
    	}
    	System.out.println(i);
    	for(int x=0;x<i;x++,i--)
    	{
            if(i==1)
            {
    		if(2==w)
    		{
    			y++;
    		}
            }
           else
    		if(2==w/i*10)
    		{
    			y++;
    		}
    		w=w-Math.pow(10,i);
    	}
    	return y;
        // write code here
    }
    public static void main(String[] args)
    {
    	Count2 a = new  Count2();
    	System.out.println(a.countNumberOf2s(123));
    }
}