package exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class A6_1_AktuellesDatumInDateiSchreiben {

	public static void main(String[] args) {
		
		String dateiName = "time.txt";
		
		try(PrintWriter printWriter = new PrintWriter(dateiName)){
			printWriter.println(LocalDateTime.now().toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}