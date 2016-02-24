package ejemplos;

import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int genera = (int)(Math.random() * 10 ) + 1;
		System.out.println("Primer into(" + genera + ")" + ": ");
		int numero = teclado.nextInt();
		if (numero == genera)
			System.out.println("Correcto.");
		else {
			System.out.println("Segundo intento: ");
			numero = teclado.nextInt();
			if (numero == genera)
				System.out.println("Correcto.");
			else { 
				System.out.println("Último intento: ");
				numero = teclado.nextInt();
				if (numero == genera)
					System.out.println("Mal.");
				else 
					System.out.println("Lo siento, el número era el " + genera);
			}
		}
		teclado.close();
		
	}

}
