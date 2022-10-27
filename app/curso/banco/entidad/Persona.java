package app.curso.banco.entidad;

public class Persona {

	protected int id;
	protected String nombre;
	protected String telefono;

	// CONSTRICTOR POR DEFECTO

	Persona() {

	}

	// CONTRUCTROR PARAMETRIZADO

	public Persona(int id, String nombre, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;

	}

	public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = Id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void mostrarInfo() {
		System.out.println("id :"  + this.id);
		System.out.println("nombre:"  + this.nombre);
		System.out.println("telefono:"  + this.telefono);
	}

}
