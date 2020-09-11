package basics;

public class Test2Factorial {

	public static void main(String[] args) {
		
		System.out.println(fac(5));
		
	}

	public static int fac(int n) {
		
		if(n == 0) {
			return 1;
		}
		else {
			System.out.println(n);
			return fac(n-1) * n;
		}
		
	}
	
}


/*
	if(n==0) {
		return 1;
	}
	else {
		return fac(n-1)*n;
	}
*/