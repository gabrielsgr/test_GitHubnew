package stack;

import java.util.Stack;

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
		Stack<Character> stack = new Stack<>();
		
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
        	reversed += stack.pop();
        }
		return reversed;		
	}
	
}
