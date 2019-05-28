package everis.eclipse.prueba;

public class Empleado {
	private String nombre;
	private double sueldoHora;
	private int numHorasTrab;
	
	public Empleado(String nombre, double sueldoHora, int numHorasTrab) {
		super();
		this.nombre = nombre;
		this.sueldoHora = sueldoHora;
		this.numHorasTrab = numHorasTrab;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " | Sueldo Hora: " + sueldoHora + " | Num Horas Trabajadas: " + numHorasTrab;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHorasTrab() {
		return numHorasTrab;
	}

	public void setNumHorasTrab(int numHorasTrab) {
		this.numHorasTrab = numHorasTrab;
	}

	public double getSueldoHora() {
		return sueldoHora;
	}

	public void setSueldoHora(double sueldoHora) {
		this.sueldoHora = sueldoHora;
	}
	
	

}