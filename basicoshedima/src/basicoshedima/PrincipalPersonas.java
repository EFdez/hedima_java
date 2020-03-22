package basicoshedima;

import java.util.Scanner;

public class PrincipalPersonas {
	
		private static void mostrarMenu() {
		System.out.println("1. CREAR UN ARRAY DE PERSONAS");
		System.out.println("2. INSERTAR UNA NUEVA PERSONA EN EL ARRAY");
		System.out.println("3. MOSTRAR LAS PERSONAS QUE HAY EN EL ARRAY");
		System.out.println("4. MOSTRAR EL NOMBRE Y LA EDAD DE A LA PERSONA DE MAYOR EDAD");
		System.out.println("5. VACIAR EL ARRAY");
		System.out.println("6. BORRAR A UNA PERSONA DEL ARRAY POR SU NOMBRE");
		System.out.println("7. SALIR.");
		System.out.println("");
		System.out.println("Introduzca opción \n");
	
		}
		
		private static void escogerOpcion() {
			
			Scanner respuesta = new Scanner(System.in);
			System.out.println("Introduce una opción, porfaplis:");
			
			String opcionRespuesta = respuesta.nextLine();
			System.out.println("Has elegido la opción:" + opcionRespuesta);
			
			
			switch (opcionRespuesta) {
			
				
			case "5"://borrar array
				
				array_personas = null; 
				break;
				
			case "7": //cerrar programa
				System.out.println("Chau");
				System.exit(0);
				break;

			default: //en caso de que no se introduzca opción válida
				System.out.println("Céntrate, elige una opción. Pero bien.");
				escogerOpcion();
				break;
			}
		}
		
		private static void crearArray() {
			
			Personas[] array_personas = null;//declaro un variable tipo array de personas
			array_personas = new Personas[5];//instancio el array 
		}
		
		private static void introducirPersona() {
			Personas p1 = null;//declaro una varible de tipo persona 
			p1 = new Personas(23,"PEPE");//instancio una persona

			array_personas[0] = p1;//meto a la persona p1 en la primera posición del array
			
			System.out.println(array_personas[0].getEdad());//imprimo la edad de la primera persona del array
			System.out.println(array_personas[0].getNombre());//imprimo el nombre de la primera persona del array
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrarMenu();
		escogerOpcion();
		crearArray();
		
	}
}
