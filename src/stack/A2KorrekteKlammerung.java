package stack;

import java.util.LinkedList;
import java.util.regex.Pattern;

public class A2KorrekteKlammerung {

	/*
	 * - Entwickle eine Anwendung, die überprüft, ob Klammern in einem gegebenen Ausdruck 
	 *   korrekt geschachtelt sind. Verwende dazu einen Stack, um die öffnenden und schließenden 
	 *   Klammern zu verfolgen. 
	 * - Die Anwendung sollte "Korrekte Klammerung!" ausgeben, wenn die 
	 *   Klammern korrekt geschachtelt sind, und "Fehlerhafte Klammerung!" sonst.
	 */
	
	private static final Pattern klammern = Pattern.compile(
			"(|)|[|]|{|}"
		);
	private static final Pattern klammernZu = Pattern.compile(
			")|]|}"
		);
	
	
	public static void main(String[] args) {
		
		

	}
	
	
	private static boolean sameNumberOfClosedBrackets(String input) {
		LinkedList<Character> brackets = new LinkedList<>();
		char bracketNow;
        for (int i = 0; i < input.length(); i++) {
        	if(input.matches(klammern).mat) {
        		bracketNow = input.charAt(i);
        	}
        	if(brackets.getLast().equals(bracketNow)) {
        		brackets.pop();         
        	}else {
        		brackets.push(bracketNow);
        	}
        }
		return true;		
	}

}
