package everis.eclipse.prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los datos del ordenador: ");
		System.out.println("Introduce el modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Introduce el número de serie: ");
		String numeroSerie = sc.nextLine();
		Ordenador o = new Ordenador(modelo, numeroSerie);
		System.out.println("Datos del ordenador: " + o);
		
		System.out.print("Introduce el nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.print("Introduce el sueldo por hora: ");
		double sueldoHora = sc.nextDouble();
		
		System.out.print("Introduce el numero de horas trabajadas: ");
		int numHorasTrab = sc.nextInt();
		sc.close();
		
		Empleado emp1 = new Empleado(nombre, sueldoHora, numHorasTrab);
		
		System.out.println(emp1);
		
	}

}