package everis.eclipse.prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("Hola Mundo!");
		
		System.out.println("A�adiendo m�s codigo...");
		System.out.println("Hooola Buenas!");
		System.out.println("Hola Jes�s, soy Luis, encantado de conocerte.");
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("�Nos echaras de menos como tutor el curso que viene?");
		boolean si = scanner.nextBoolean();
		
		if (si) {
			
			System.out.println("Nosotros tambi�n...");
			
		} else {
			
			System.out.println("Ah vaya...");
			
		}
		scanner.close();
		
	}

}