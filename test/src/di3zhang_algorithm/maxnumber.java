package di3zhang_algorithm;

import java.util.Scanner;

public class maxnumber {
	public static void main(String[] args)
	{
		int i[] = new int [10];
		Scanner w=new Scanner(System.in);
		int q=0;
		for(int x=0;x<i.length;x++){
		
			i[x]=w.nextInt();
			if(x==0){
				q=i[0];
			}
			if(q<i[x]){
				q=i[x];
			}
			
		}
		System.out.println(q);
		
		w.close();
	}

}
