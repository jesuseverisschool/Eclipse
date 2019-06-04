package everis.eclipse.prueba;

public class Ordenador {
	
	private String modelo;
	private String numeroSerie;
	
	public Ordenador(String modelo, String numeroSerie) {
		super();
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
	}
	
	@Override
	public String toString() {
		return modelo + " " + numeroSerie;
	}
	
	
}