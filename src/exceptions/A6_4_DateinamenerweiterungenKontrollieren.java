package exceptions;

public class A6_4_DateinamenerweiterungenKontrollieren {

	public static void main(String[] args) {
		try {
			System.out.println(checkFileExtension(""));
		}catch (IllegalInputtype e) {
			System.out.println("Dateiname ist leer.\n -1");
		}
	}

	private static int checkFileExtension(String fileName) {
		if(fileName.endsWith(".java")){
			return 1;
		}else if(fileName.isEmpty()) {
			throw new IllegalInputtype();
		}
		return 0;
	}
}
