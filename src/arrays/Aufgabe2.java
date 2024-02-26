package arrays;

public class Aufgabe2 {

	public static void main(String[] args) {
	
		String[]signs1 = { "f", "DO", "MOS", "MOS", "MOS", "WES"};
		
		System.out.println(isProbablyApproaching(signs1));

	}
	
	public static boolean isProbablyApproaching(String[] signs) {
		int count = 1;
		for(int i = 1; i < signs.length; i++) {
			if(signs[i-1].equals(signs[i])) {
				count++;
				if(count >= 4) {
					return true;
				}
			} else {
				count = 1;
			}
		}
		return false;
	}

}
