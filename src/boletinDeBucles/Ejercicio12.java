package boletinDeBucles;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
		   /* 1ºSolicitar datos.
			* 2ºCalcular método de Fibonacci.
			* 3ºMostrar resultado. 
			* */
		
		Scanner keyboard= new Scanner(System.in);
		int x=0,z,i=1;
//		1º Pedir datos
		System.out.println("Introduce un valor númerico");
		z=keyboard.nextInt();
//		2ºCalcular la función de Fibonacci.	
		do {
			System.out.printf("\nResultado es: %d+%d", x, i);
			x += i;
			i++;
		} while (x<=z);
	keyboard.close();
	}
}
