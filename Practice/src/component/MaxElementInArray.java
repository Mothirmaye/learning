package component;

public class MaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,200,30,40,230};
		int result = maxElement(arr);
		System.out.println("max element id :"+result);
		int secondResult = secondLargest(arr,result);

		System.out.println("second max element is" + secondResult);
	}
	
	public static int maxElement(int[] arr) {
	
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		
		return max;
		
	}

	
	public static int secondLargest(int[] arr,int first) {
		int secondMax = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondMax && first > arr[i]) {
				secondMax=arr[i];
			}
			
		}
		
		return secondMax;
		
	}
}
