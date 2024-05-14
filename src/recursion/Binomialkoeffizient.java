package recursion;

public class Binomialkoeffizient {

	public static void main(String[] args) {
		System.out.println(calculaeBinomialkoeffizient(4, 2));

	}

	public static int calculaeBinomialkoeffizient(int n, int k) {
		if (k == 0 || n == k) {
			return 1;
		} else {
			return calculaeBinomialkoeffizient(n-1, k-1) + calculaeBinomialkoeffizient(n-1, k);		}
	}
}
