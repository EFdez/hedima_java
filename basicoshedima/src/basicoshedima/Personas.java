package basicoshedima;

public class Personas {

	private int edad;
	private String nombre;
	
	public Personas() {
		// TODO Auto-generated constructor stub
	}
	public Personas(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
