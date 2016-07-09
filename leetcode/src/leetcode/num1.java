package leetcode;

public class num1 {
	public static void main(String[] args)
	{
		Solution1 a = new Solution1();
		int [] b = {0,0,0,0};
		int [] c = new int [2];
		
		c=a.twoSum(b, 4);
		for(int i=0;i<2 ; i++)
		{
			System.out.println(c[i]);
		}
	}
	
}
