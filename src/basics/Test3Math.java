package basics;

public class Test3Math {

	public static void main(String[] args) {
		
		int[] numbers = {5, -5000, 0, 234, -438, 63, -500};
		System.out.println("Min : " + findMin(numbers));
		System.out.println("Max : " + findMax(numbers));
		System.out.println("Avg : " + findAvg(numbers));
	}

	public static int findMin(int[] arr) {
		
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
		
	}
	
	public static int findMax(int[] arr) {
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findAvg(int[] arr) {
		
		int avg = 0;
		int sum = 0;
		int i;
		
		for(i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
	//	avg = sum / i;
		avg = sum / arr.length;
		
		return avg;
	}
	
}
