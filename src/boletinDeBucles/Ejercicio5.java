package boletinDeBucles;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
				/* Pedir el número menor y máximo del rango.
				 * Mostrar los números comprendidos de ese rango 15 veces.
				 * */
		
		
		//ENUNCIADO
		//		 Generar 15 números aleatorios entre el rango de dos números solicitados al usuario.
		
		
		Scanner keyboard= new Scanner(System.in);
		Random range= new Random();
		int random,n1,n2;
		
		//Pedir datos al usuario
		
		System.out.println("Vamos ha realizar un ejercicio de calcular un rango entre dos números asignados");
		System.out.println("Introduce el número menor del rango");
		n1=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Introduce el número mayor del rango");
		n2=keyboard.nextInt();
		
		//Comenzamos con el bucle
		for (int i=1;i<=15;i++) {
			if (n1<n2) {
			random=(range.nextInt(n2-n1+1)+n1);
			System.out.printf("Su número %d del rango es:%d\n",i,random );
		}
			else {
				System.out.println("El primer número introducido no es menor que el segundo, vuelva ha escribir los valores correctamente.");
			}
	}
		keyboard.close();
}

}
