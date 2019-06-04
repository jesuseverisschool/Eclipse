package everis.eclipse.prueba;

public class Ordenador {
	
	private String modelo;
	private String numeroSerie;
	private String marca;
	
	public Ordenador(String modelo, String numeroSerie, String marca) {
		super();
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return modelo + " " + numeroSerie + " " + marca;
	}
	
	
}