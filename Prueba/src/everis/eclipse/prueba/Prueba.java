package everis.eclipse.prueba;

import java.time.LocalDate;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nombre");
			String nombre = sc.nextLine();
			
		System.out.println("Introduzca fecha año ");
	int any = sc.nextInt();
	System.out.println("Introduzca fecha mes ");
	int mes = sc.nextInt();
	System.out.println("Introduzca fecha dia ");
	int dia = sc.nextInt();
	sc.close();
	
	LocalDate fecha = LocalDate.of(any, mes, dia);

	Departamento dp1 = new Departamento(nombre,fecha);
	System.out.println(dp1);
	
}
}