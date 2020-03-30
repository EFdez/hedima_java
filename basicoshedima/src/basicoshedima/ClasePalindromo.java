package basicoshedima;
import java.util.Scanner;


/**
 * El código de esta clase, es un poco misterioso. Algún
 * programador Clase "C", no ha usado nombres descriptivos y ahora, nos toca
 * pegarnos y descubrir qué narices hace este código, para poder usarlo en
 * nuestro proyecto. 
 * Se pide: 
 * * *
 * 1) Adivinar la funcionalidad del método adivinaQueHace 
 * 2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase 
 * 3) Idear un método equivalente, pero distinto. Es decir, crear un método que haga lo mismo que adivinaQueHace, pero de otra manera. Con otro algoritmo
 * *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión
 * recursiva **
 */


/**
 * Palíndromo: Del gr. παλίνδρομος palíndromos 'que recorre a la inversa'.
 * 1. m. Palabra o frase cuyas letras están dispuestas de tal manera que resulta la misma leída de izquierda a derecha que de derecha a izquierda; p. ej., anilina; dábale arroz a la zorra el abad.
 * 
 *1) El método comprueba si la cadena es un palíndromo. 
 *2) ClasePalindromo, comprobarPalindromo()
 *3) Líneas 34-48
 *4) Líneas 78-90 (CREO.)
 *
 * @author escarlata
 *
 */

public class ClasePalindromo {
	
	private static void comprobarPalindromoV2(String cad) {
		String al_verres = invertir(cad);
		if (al_verres.equals(cad)){
			System.out.println("Es un palíndromo.");
		}else {
			System.out.println("No es un palíndromo.");
			
		}		
	}
	
	private static String invertir(String palabra) {
		StringBuilder palabra_invertida = new StringBuilder(palabra);
		String palabra_invertida_str = palabra_invertida.reverse().toString();
		return palabra_invertida_str;	
	}

	private static boolean comprobarPalindromoV1(String cad) {
		boolean bd = true; //se declara un valor booleano y se inicializa a true
		int i = 0; //esta será la posición del primer caracter de la cadena
		int j = cad.length() - 1; //esta será la posición del último caracter de la cadena
		while ((i <= j) && (bd)) { //esto se ejecuta mientras i sea menor o igual que j (para comprobar todas las posiciones) y bd continue siendo true
			bd = cad.charAt(i) == cad.charAt(j); //se comprueba que la primera posición sea exacta a la última, de no ser así bd pasaría a ser false y el programa dejaría de ejecutarse
			i++; //la posición i pasa al caracter siguiente
			j--; //la posición j pasa al caracter anterior
		}
		return bd; //el método devuelve bd
	}
	
	public static void main(String[] args) {	
		boolean continuar = true;
		
		Scanner scanner = null;
		scanner = new Scanner(System.in);//
		
		
		System.out.println("----------Método comprobarPalíndromoV1----------");
		if (comprobarPalindromoV1("halamadrid")) {//se invoca al método pasándole un parámetro: si el método devuelve true se meterá por aquí
			System.out.println("VERDADERO");
		} else { //si devuelve false se meterá por aquí; no es que tenga afinidad futbolera ninguna, es que lo programaron así.
			System.out.println("FALSO");
		}
		
		
		do {
			System.out.println("----------Método comprobarPalíndromoV2----------");
			System.out.println("Introduce una palabra:");
			String palabra = scanner.nextLine();
			comprobarPalindromoV2(palabra);
			
			System.out.println("¿Quieres probar de nuevo? (y/n) :");
			char respuesta = scanner.next().charAt(0);
			if (respuesta != 'y'){
					continuar = false;
			}
				
		} while (continuar);
		
	}
	

}
