package component;

import java.util.ArrayList;

public class Hello {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		insertElement();
		
	}

	
	public static void fruits() {
		String[] fruit = new String[]{"apple","banana"};
		//fruit[2]="cherry";
		
		//System.out.println(fruit[2]);
		
		ArrayList animals = new ArrayList();
				animals.add("tiger");
				animals.add("hen");
				System.out.println(animals.get(0));
			
	}
	
	public static void insertElement() {
		int[] arr = new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[3]=3;
		int n=arr.length;
		int x=4;
		int pos =1;
		for(int i=n-1;i>=pos;i--) {
			arr[i+1]=arr[i];
			arr[pos]=x;
			System.out.println(arr[1]);
		}
		
	}
}
