package cl.usach.demo.pttrcommand;


public class ArchivoTexto {

	private String nombre;

	// constructor
	public ArchivoTexto(String nombre) {
		this.nombre = nombre;
	}

	//operacion abrir archivo texto
	public String open() {
		return "Opening file " + nombre;
	}

	//operacion guardar archivo texto
	public String save() {
		return "Saving file " + nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
