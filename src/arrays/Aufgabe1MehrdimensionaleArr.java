package arrays;

public class Aufgabe1MehrdimensionaleArr {

	public static void main(String[] args) {
		
		int [][] array = {{1, 2, 3}, {4, 5, 6}};
		
		magnigy(array, 2);
	}

	public static int[][] magnigy(int[][]array, int factor){
		int[][] arrayNew = new int [array.length * factor][array[0].length * factor];
		
		
		for(int z = 0; z < array[0].length; z++) {
			for(int s = 0; s < array.length; s++) {
				for(int a = 1; a <= factor; a++) {
					arrayNew[s][z] = array[s/factor][z/factor];
					System.out.println(arrayNew[s][z]);
				}
			}
		}
		return arrayNew;
	}
}
