package boletinDeBucles;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//PROCEDIMIENTO:
		/* Solicitar datos al usuario.
		 * Introducir datos solicitado.
		 * Calcular tabla de multiplicar del dato introducido. 
		 * */
		
//		 1.Pedir un número entre 0 y 10 por teclado y mostrar la tabla de multiplicar de dicho número
		
		Scanner keyboard= new Scanner(System.in);
		int num1,multiply;
		
		System.out.println("Introduce un número entre 0 y 10");
		num1=keyboard.nextInt();
		keyboard.nextLine();
		
		for(multiply=1;multiply<=10;multiply++) {
		System.out.printf("%d*%d=%d\n",num1,multiply,num1*multiply);
		}
	keyboard.close();
	}
	

}
