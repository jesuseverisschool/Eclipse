package everis.eclipse.prueba;

public class Empresa {

	private String nombre;
	private String direccion;
	
	Empresa (String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		
	}
	
	@Override
	public String toString () {
		
		return "Nombre y dirección de la empresa: " + nombre + ";" + direccion;
		
	}
	
}