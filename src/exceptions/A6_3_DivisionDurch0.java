package exceptions;

public class A6_3_DivisionDurch0 {

	public static void main(String[] args) {
		try {
			System.out.println(divide(1, 0));
		}catch (ArithmeticException e) {
			System.out.println("Die Gesamtzahl darf nicht 0 sein.");
		}
	}

	private static double divide(int x, int y){
		return x/y;
	}
}
