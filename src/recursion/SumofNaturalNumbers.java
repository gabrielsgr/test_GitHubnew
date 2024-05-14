package recursion;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		System.out.println(sumN(5));

	}

	
	public static int sumN(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sumN(n - 1);
		}
	}
}
