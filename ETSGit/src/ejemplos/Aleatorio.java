package ejemplos;

public class Aleatorio {
	
	
	public static void main (String[] args) {
		
		//Número aleatorio entre 1 y 6 (lanzamineto de dado)
		int dado = (int)(Math.random() * 6) + 1;
		System.out.println("El valor es: " + dado + ".");
		
		//Número aleatorio entre 10 y 20 ambos incluidos
		int valor = (int)(Math.random() * 11) + 10;
		System.out.println("El valor es: " + valor + ".");
		
		//Número aleatorio entre 0 y 1 ambos incluidos
		int bit = (int)(Math.random() * 2);
		System.out.println("El bit es: " + bit + ".");
		
		//Número aleatorio entre 1 y 100 ambos incluidos
		int valor2 = (int)(Math.random() * 100) + 1;
		System.out.println("El valor entre 1 y 100 es: " + valor2 + ".");
		
	}
	

}









