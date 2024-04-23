package stack;

import java.util.LinkedList;

public class A1WoerterUmdrehen {
	
	/*
	 * - Implementiere eine Methode reverseString(String input), die einen String umkehrt, indem
	 *   sie einen Stack verwendet.
	 * - Teste deine Methode mit verschiedenen Eingaben, um sicherzustellen, dass sie korrekt
	 * 	 funktionieren.
	 */

	public static void main(String[] args) {
		System.out.println(reverseString("Hallo!"));
	}

	private static String reverseString(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
        	reversed.append(stack.pop());
        }
		return reversed.toString();		
	}
	
}
