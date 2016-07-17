package di3zhang_algorithm;

public class binarysearch {
	public int bin(int x){
	int a[] = {1,2,3,4,5,6,7,8,9,10,11};
	int i=0;
	int j =10;
	while(i<j){
		int m = (i+j)/2;
		if(x>a[m]){
			i=m+1;
			
		}
		else j=m;
	

	}	
	int location =0;
	if(x==a[i]){
		location=i;
	}
	else location=0;
	return location;
}
	public static void main(String[] args){
		binarysearch i = new binarysearch();
		System.out.println(i.bin(3));
	}
}