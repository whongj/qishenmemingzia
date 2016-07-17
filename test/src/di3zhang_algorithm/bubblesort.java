package di3zhang_algorithm;

public class bubblesort {
	public int[] dobubblesot(int i[]){
		for(int x=0;x<i.length-1;x++){
			for(int q=1;q<i.length-x;q++){
				if(i[q]>i[1+q]){
					int y=i[q];
					i[q]=i[q+1];
					i[q+1]=y;
					
				}
			}
		}
		return i;
	}
	public static void main(String[] args){
		bubblesort a = new bubblesort();
		int []i={1,3,6,1,9,2,4,10};
		i=a.dobubblesot(i);
		for(int w :i){
			System.out.println(w);
		}
	}
}
