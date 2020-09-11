package basics;

public class Test1Sum {

	public static void main(String[] args) {

		System.out.println(sum(5));
		
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}

}

/*
	int sum = 0;
	for(int i = 1; i <= n; i++) {
		sum = sum + i;
	}
	return sum;
*/