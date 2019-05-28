package everis.eclipse.prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);

		System.out.println("Introduce los datos del ordenador: ");
		System.out.println("Introduce el modelo: ");
		String modelo = scanner.nextLine();
		System.out.println("Introduce el número de serie: ");
		String numeroSerie = scanner.nextLine();
		
		Ordenador o = new Ordenador(modelo, numeroSerie);
		System.out.println("Datos del ordenador: " + o);

		scanner.close();
		
	}

}