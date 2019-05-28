package everis.eclipse.prueba;

import java.time.LocalDate;

public class Departamento {

	private String nombre;
	private LocalDate fechaCreacion;

	Departamento(String nombre , LocalDate fecha){
		this.nombre = nombre;
		this.fechaCreacion = fecha;
	}
	
	@Override
		public String toString() {
			String res = nombre +" "+fechaCreacion;
		
			return res;
		}
}