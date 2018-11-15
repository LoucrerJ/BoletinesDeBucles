package boletinDeBucles;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
		/* 1-Introducir mínimo y máximo.
		 * 2-Introducir números de intentos.
		 * 3-Nos muestra el resultado si lo ha adivinado. 
		 * */
		Scanner keyboard=new Scanner(System.in);
		double num1,num2,random;
		int continuar,i,intent,test;
		i=1;
//		1-Introducir mínimo y máximo.
		System.out.println("Introduzca el mínimo\n");
		num1=keyboard.nextDouble();
		System.out.println("Introduzca el máximo\n");
		num2=keyboard.nextDouble();
//		2-Introducir números de intentos
		do {
			System.out.println("¿Cuántos intentos vamos ha tener?");
			intent = keyboard.nextInt();
		} while (intent<=0);
		random=aleatorio(num1,num2);
//		3-Nos muestra el resultado si lo ha adivinado.
		do {
			System.out.printf("\nintroduzca su %d intento\n",i);
			test=keyboard.nextInt();
			keyboard.nextLine();
			if (test < random) {
				System.out.printf("El número introducido es menor: %d", test);
			} else if (test > random) {
				System.out.printf("El número introducido es mayor: %d\n", test);
			} else if (test == random) {
				System.out.printf("¡Correcto! Ha adivinado el número. %.2f = %d", random, intent);
				break;
			}
			System.out.println("\n¿Lo has adivinado?\n1-Si\n2-No\nElija una opción: ");
			continuar=keyboard.nextInt();
			i++;
		} while (continuar==2&&i<=intent);
		keyboard.close();		
	}
//	Creamos una función para sacar un número aleatorio entre un rango establecido por un mínimo y máximo.
	public static double aleatorio(double n1, double n2) {
		return Math.floor(Math.random() * (n2 - n1)) + n1;
	}

}
