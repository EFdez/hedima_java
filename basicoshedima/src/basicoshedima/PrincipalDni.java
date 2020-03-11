package basicoshedima;

public class PrincipalDni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Vamos a crear un DNI
		//TIPO VARIABLE
		Dni dni1 = null;
		//se ha creado un dni abstracto que no tiene info
		//y se ha inicializado en null
		
		//instanciar:
		dni1 = new Dni(5531017, ' '); //constructor
		Dni dni2 = new Dni(53130,' ');
		//El dni2 ya tiene infor determinada
		
		Dni dni3 = new Dni(13, 'a');
		
		/*System.out.println("Imprimir algo");
		//TODO la pregunta 9 del test
		
		String cadena = new String("Hola");
		char letra_cero = cadena.charAt(0);
		System.out.println(letra_cero);
		int longitud = cadena.length();
		System.out.println(longitud);
		char letra_final = cadena.charAt(longitud-1);
		System.out.println(letra_final);*/
		
		char letra_calculada = dni1.calcularLetra();
		System.out.println(letra_calculada);
		dni1.setLetra(dni1.calcularLetra());
		char letra_calculada2 = dni2.calcularLetra();
		System.out.println(letra_calculada2);
		dni2.setLetra(letra_calculada);
		
		System.out.println("Dni 1: " + dni1.getNumero() + dni1.getLetra());
		System.out.println("Dni 2: " + dni2.getNumero() + dni2.getLetra());
		
		System.out.println(dni1.esValido());
		System.out.println(dni3.esValido());
		
		
		
		
	}

}
