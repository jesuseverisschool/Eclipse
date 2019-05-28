package everis.eclipse.prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dime el nombre de la empresa: ");
		String nombreEmpresa = scanner.nextLine();
		
		System.out.println("Dime la dirección de la empresa: ");
		String direccionEmpresa = scanner.nextLine();
	
		scanner.close();
		
		Empresa empresa = new Empresa (nombreEmpresa, direccionEmpresa);
		
		System.out.println(empresa);
		
	}

}