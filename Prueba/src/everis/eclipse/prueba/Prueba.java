package everis.eclipse.prueba;

import java.time.LocalDate;
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
		
		//------------------------------------------------------------------------------------	
		
		System.out.println("Dime el nombre de la empresa: ");
		String nombreEmpresa = sc.nextLine();
		System.out.println("Dime la dirección de la empresa: ");
		String direccionEmpresa = sc.nextLine();
		
		Empresa empresa = new Empresa (nombreEmpresa, direccionEmpresa);
		
		System.out.println(empresa);
		
		//------------------------------------------------------------------------------------
		
		System.out.print("Introduce el nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.print("Introduce el sueldo por hora: ");
		double sueldoHora = sc.nextDouble();
		System.out.print("Introduce el numero de horas trabajadas: ");
		int numHorasTrab = sc.nextInt();
		sc.nextLine();
		
		Empleado emp1 = new Empleado(nombre, sueldoHora, numHorasTrab);
		
		System.out.println(emp1);
		
		//------------------------------------------------------------------------------------
		
		System.out.println("Introduzca el nombre del departamento:");
		String nombreDep = sc.nextLine();
		System.out.println("Introduzca fecha año ");
		int any = sc.nextInt();
		System.out.println("Introduzca fecha mes ");
		int mes = sc.nextInt();
		System.out.println("Introduzca fecha dia ");
		int dia = sc.nextInt();
		
		LocalDate fecha = LocalDate.of(any, mes, dia);
		Departamento dp1 = new Departamento(nombreDep,fecha);
		
		System.out.println(dp1);
		
		sc.close();
	
	}
}