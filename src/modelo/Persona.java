package modelo;

public class Persona {
	private String nombre;
	private String apellido1;
	private int edad;
	
	public Persona(String nombre, String apellido1, int edad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
