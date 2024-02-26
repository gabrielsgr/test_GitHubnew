package arrays;

public class Aufgabe1 {

	public static void main(String[] args) {
	
		int[] dailyGains = { 1000, 2000, 500, 9000, 9010 };
		
		
		System.out.println(count5PercentJumps(dailyGains));

	}
	
	public static int count5PercentJumps(int [] gains) {
		int erg = 0;
		if(gains == null) {
			System.out.println("Array ist null");
		}
		else {
			for(int i = 1; i< (gains.length-1); i++) {
				if(gains[i-1]*1.05 < gains[i]) {
					erg++;
				}
			}
		}
		return erg;
	}
	
	

}
