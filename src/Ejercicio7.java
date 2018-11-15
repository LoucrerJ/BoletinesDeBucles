package boletinDeBucles;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		
		//PROCEDIMIENTO:
				/* Solicitar datos al usuario.
				 * Realizar operaciones.
				 * Calcular. 
				 * */
//		 7.Realiza un programa que calcule la suma de los pares y de los impares comprendidos entre dos
//		 valores enteros a y b que se introducen por teclado (a < b).
		
		Scanner keyboard= new Scanner(System.in);
		
		int a,b,n1,n2,opt1,opt2;
		//Pedimos los datos al usuario.
		System.out.println("Haremos la suma de dos números enteros y nos mostrará si es par o impar.");
		System.out.println("Introduce su primer número entero.");
		n1=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Introduce su segundo número");
		n2=keyboard.nextInt();
		keyboard.nextLine();
		//Hacemos las operaciones necesarias y se las asiganamos a las variables.
		opt1=n1%n2;
		opt2=n1%n2;
		a=n1+n2;
		b=n1+n2;
		//Hacemos una estructura con condiciones.
		if (opt1==0) {
			System.out.printf("Su número es par: %d+%d=%d",n1,n2,a );
		}
		else if (opt2>1) {
			System.out.printf("Su número es impar: %d+%d=%d",n1,n2,b );
		}
		else {
			System.out.println("No ha introducido un numeo entero o valores númericos.");
		}
			
			
		keyboard.close();
	}

}
