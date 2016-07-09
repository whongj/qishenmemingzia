package leetcode;
public class Solution3 {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        if(x==0)
        {
            return true;
        }
        int base=1;
        int i =x;
        while(i/10>0)
        {	
        	i/=10;
            base*=10;
        }
        while(x!=0)
        {
            int right = x/base;
            int left  = x%10;
            if(right!=left)
            {
                return false;
            }
            x-=base*left;
            base /=100;
            x/=10;
            
        }
        return true;
    }
    public static void main(String [] args)
    {
    	Solution3 a = new Solution3();
    	a.isPalindrome(100);
    }
}