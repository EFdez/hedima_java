package basicoshedima;

public class PrincipalCadenas {

	public static void main(String[] args) {

		if (args == null) {
			System.out.println("argumentos es null");
		} else if (args.length == 0) {
			System.out.println("tengo 0 params");
		} else {
			System.out.println("tengo " + args.length + " param");
		}

		/**
		 * TODO Hacer un main que imprima por pantalla los argumentos con tamaño mayor o
		 * igual a cinco
		 * 
		 */

		for (int i = 0; i < args.length; i++) {
			if (args[i].length() >= 5) {
				System.out.println(args[i]);
			}

		}

		/**
		 * Hacer un main que imprima por pantalla el argumento de mayor longitud
		 */

		String max_palabra = null;
		int max_long = 0;
		for (int i = 0; i < args.length; i++) {
			int a = args[i].length();
			if (a > max_long) {
				max_long = a;
				max_palabra = args[i];
			}
		}
		System.out.println("La cadena más larga es: " + max_palabra);
		;

		/**
		 * Hacer un main que imprima por pantalla los argumentos que contengan la a
		 */
		/*
		 * for (int i = 0; i < args.length; i++) { for (int j = 0; j < args[i].length();
		 * j++) { if (args[i].charAt(j) == 'a') { System.out.println("Palabras con a: "
		 * +args[i]); } //BUSCAR CONTAINS }
		 * 
		 * }
		 */
		
		/**
		 * Sigue sin ser eficiente porque no hace break después de encontrarlo.
		 */
		int a = 0;
		do {
			if (args[a].contains("a")) {
				System.out.println("Palabras con a: " + args[a]);
			}
			a++;
		} while (args.length > a);
		
		/**
		 * Ejemplo clase profe
		 */
		String palabra_actual = null;
		int posicion_actual = 0;
		boolean encontrado = false;
		
		for (int i = 0; i < args.length; i++) {
			posicion_actual = 0;
			palabra_actual = args[i];
			encontrado = false;
			do {
				if (palabra_actual.charAt(posicion_actual)=='a') 
				{
					encontrado = true;
					System.out.println("Ejemplo profe, palabra encontrada: " +palabra_actual);	
				}else {
					posicion_actual++;
				}
				
			} while ((!encontrado) && (posicion_actual < palabra_actual.length()));
		}
		
		//FOR EACH
		for (String cadena : args) {
			System.out.println("For each de args: "+ cadena);
		}

	}

}
