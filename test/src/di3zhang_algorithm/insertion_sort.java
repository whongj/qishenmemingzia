package di3zhang_algorithm;

public class insertion_sort {
	public void doinsert(int[] a){				
		int insertNum = 0;
		int j = 0;
		for (int i = 1; i < a.length; i++) {
		insertNum = a[i];
		j = i - 1;
		while (j >= 0 && insertNum < a[j]) {
		a[j + 1] = a[j];
		j--;
		}
		a[j + 1] = insertNum;
		}
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
		}

	public static void main(String[] args){
		insertion_sort a = new insertion_sort();
		int[] x={12,32,12,32,41,321,431};
			for(int p:x){
			System.out.println(p);
		}
			a.doinsert(x);
	}
}
