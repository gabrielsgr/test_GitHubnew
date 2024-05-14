package recursion;

public class Faculty {

	public static void main(String[] args) {
		System.out.println(calculateFaculty(5));
	}

	public static int calculateFaculty(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calculateFaculty(n - 1);
		}
	}

}
