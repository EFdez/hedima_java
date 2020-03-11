package basicoshedima;
/**
 * 
 * @author Alumno
 *Esta clase representa un documento nacional
 *de identidad espa�ol
 */

public class Dni {
	
	private int numero; //comentario de l�nea
	private char letra; 
	
	static final String SECUENCIA_DE_LETRAS= "TRWAGMYFPDXBNJZSQVHLCKE";
	/**
	 * Esta funci�n calcula la letra de un dni
	 * @return la letra calculada
	 */
	
	//HACER M�TODO CALCULAR LETRA
	public char calcularLetra()
	{
		char letra_dni = ' ';
		int resto = this.numero % SECUENCIA_DE_LETRAS.length();
		letra_dni = SECUENCIA_DE_LETRAS.charAt(resto);
		return letra_dni; 
	}
	
	//Varios constructores : sobrecarga
	public Dni(int numero, char letra) { //constructor
		super();
		this.numero = numero;
		this.letra = letra;
	}

	public Dni() { //Constructor por defecto
		super();
		
	}

	//M�TODOS DE ACCESO
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return this.letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	
	//M�TODO NUEVO QUE VALIDE EL DNI PARA QUE SEA V�LIDO TIENE QUE CORRESPONDER NUM Y LET
	
	public boolean esValido() {
		boolean valido = false;
		
		char letra_real = calcularLetra();
		if (this.letra == letra_real) {
			System.out.println("La letra es correcta");
			valido = true;
		}else {
			System.out.println("La letra es incorrecta");
		}
		
		return valido;
	}
	
	
	

}
