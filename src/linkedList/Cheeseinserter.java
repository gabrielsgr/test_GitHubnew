package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class Cheeseinserter {

	// prvate = Sichtbarkeit auf die eigene Klasse beschränkt
	// static = unabhängig von einem Objekt, gehört zur Klasse
	// final = Wert der Variable bleibt nach der Initialisierung unverwendbar
	private static final Pattern vegetbles = Pattern.compile(
			"Zucchini|Paprikas?|Tomaten?|Zwiebeln?|Melanzani"
		);
	
	public static void insertCheeseAroounfVegetable(List<String> ingredients) {
		// For-Schleife mit Iterator als Laufvariable
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			// Auslesen der momentanen Zutat
			String ingredient = iterator.next();
			// Überprüfen, ob die Zutat zu unserem Vegetable-Pattern passt
			if(vegetbles.matcher(ingredient).matches()) {
				iterator.add("Käse");
			}
					
				}
	}
	
	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchi", "Zucchini", "Paprika", "Milch", "Zwiebeln", "Melanzani");
		insertCheeseAroounfVegetable(ingredients);
		System.out.println(ingredients);

	}

}
