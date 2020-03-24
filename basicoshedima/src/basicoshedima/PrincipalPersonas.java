package basicoshedima;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrincipalPersonas {

	private static void mostrarMenu() {
		System.out.println("");
		System.out.println("1. Crear un array de personas.");
		System.out.println("2. Insertar una persona en el array.");
		System.out.println("3. Mostrar las personas que componen el array.");
		System.out.println("4. Mostrar a la persona de mayor edad.");
		System.out.println("5. Vaciar el array.");
		System.out.println("6. Borrar a una persona del array por su nombre.");
		System.out.println("7. Salir.");
		System.out.println("");
	}

	private static int escogerOpcion() {

		Scanner respuesta = new Scanner(System.in);
		System.out.println("Introduce una opción, porfaplis:");

		int opcionRespuesta = respuesta.nextInt();
		System.out.println("Has elegido la opción:" + opcionRespuesta);

		return opcionRespuesta;

	}


	public static void main(String[] args) {

		// se declara la var array_personas a null
		Personas[] array_personas = null;

		// se declara la var opcion a 0
		int opcion = 0;

		// se declara el max de personas y el contador
		int MAX_PERSONAS = 5;
		int contador_personas = 0;

		do {

			// Mostrar el menú inicial
			mostrarMenu();

			// Se guarda la opción escogida en la var opcion
			opcion = escogerOpcion();

			// Se elige la opción en el menú
			switch (opcion) {

			case 1: // crear array
				array_personas = new Personas[5];// instancio el array
				System.out.println("Se ha creado un array de 5.");
				break;

			case 2: // insertar una persona
				if (MAX_PERSONAS > contador_personas) {
					//pedir intro persona por consola
					String nombre = null;
					int edad = 0;
					
					Scanner respuesta = new Scanner(System.in);
					System.out.println("Introduce un nombre: ");
					nombre = respuesta.nextLine();
					
					System.out.println("Introduce una edad: ");
					edad = respuesta.nextInt();

					
					// instancio una persona
					Personas p1 = new Personas(edad, nombre);
					array_personas[contador_personas] = p1;
					++contador_personas;
					System.out.println("Se ha creado una entrada: " + p1.getNombre() + "-" + p1.getEdad());
				} else {
					System.out.println("Array completo.");
				}
				break;

			case 3: // mostrar array
				if (MAX_PERSONAS == contador_personas) {
					// TODO mirar cómo hacerlo con for each
					for (int i = 0; i < array_personas.length; i++) {
						System.out.println("-----" + (i + 1) + ". Nombre: " + array_personas[i].getNombre()
								+ " | Edad: " + array_personas[i].getEdad());
					}
				} else {
					System.out.println(
							"Asegúrate antes de rellenar el array, porfa. Porque si no me da un error *NullPointerException*. Y no queremos errores. Gracias.");
				}
				break;

			case 4: // mostrar persona de más edad

				List<Personas> personas = Arrays.asList(array_personas);
				Personas persona_mayor = personas.stream()
						.collect(Collectors.maxBy(Comparator.comparingInt(Personas::getEdad))).get();

				System.out.println("La persona más mayor es: " + persona_mayor.getNombre() + " con "
						+ persona_mayor.getEdad() + " años.");
				// https://www.techiedelight.com/find-maximum-minimum-custom-objects-java/

				break;

			case 5:// borrar array
				array_personas = null;
				break;

			case 6: // borrar persona por nombre
				// TODO scanner para introducir nombre
				Scanner respuesta = new Scanner(System.in);
				System.out.println("Introduce el nombre que quieres borrar:");
				String nombre = respuesta.nextLine();

				for (int i = 0; i < array_personas.length; i++) {
					if (array_personas[i].getNombre().indexOf(nombre) > -1) {
						array_personas[i] = null;
					}
				}

				break;

			case 7: // cerrar programa
				System.out.println("Chau");
				System.exit(0);
				break;

			default: // en caso de que no se introduzca opción válida
				System.out.println("Céntrate, elige una opción. Pero bien.");
				escogerOpcion();
				break;
			}

		} while (opcion != 7);

	}
}
