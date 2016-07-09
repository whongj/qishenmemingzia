package leetcode;

public class Solution2 {

	    public char[][] convert(String s, int numRows) {
	        char [] [] a = new char[numRows][10];
	        char [] b = s.toCharArray();
	        int p=1;
	        for(int j =0, x=0;x<b.length;)
	        {
	        if(p%numRows==0||p==1)
	            {
	            for(int i=0;i<numRows;i++)
	                {
	                    a[i][j]=b[x];
	                    x++;
	            
	                }
	            }
	        else {
	            for(int i =numRows;i>0;i--,j++)
	            {
	                a[i][j]=b[x];
	                x++;
	            }
	        }
	        p++;
	        
	    }
	        
	        for(int w=0,c=0;w<a.length;w++)
	        {
	        	
	        }
	    return a;
	}
	}

