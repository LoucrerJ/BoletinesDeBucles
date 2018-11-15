package boletinDeBucles;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
//		 17.Realiza un algoritmo que lea un número natural n por teclado y dibuje un triángulo de
//		 asteriscos con base y altura n. Por ejemplo si n = 5 debería dibujarse:
//		  *
//		 * *
//		* * *
//	   * * * *
//	  * * * * *
		
//		PROCEDIMIENTO:
//			1º Pedir el número de filas donde se dibujara la piramide.
//			2ºDibujar el dibujo.
//				2.1 Dibujar las filas.
//				2.2 Dibujar los espacios en blanco, para dibujar los espacios restamos el número de filas con la fila en que estamos.
//				2.3 Dibujar los asteriscos, para dibujar los asteriscos restamos al número de filas introducidos los espacios en blanco.
				Scanner keyboard = new Scanner(System.in);
		int nf,i;
//		1º Pedir el número de filas donde se dibujara la piramide.
		System.out.println("Introduce el número de filas que tendrá nuestra piramide");
		nf=keyboard.nextInt();
		do {
			//		2ºDibujar el dibujo.
			//		2.1 Dibujar las filas.
			for (i = 1; i <= nf; i++) {
			}
			//		2.2 Dibujar los espacios en blanco, para dibujar los espacios restamos el número de filas con la fila en que estamos.
			for (i = 1; i <= (nf - i); i++) {
				System.out.print(" ");
			}
			//		2.3 Dibujar los asteriscos, para dibujar los asteriscos restamos al número de filas introducidos los espacios en blanco.
			for (i = 1; i <= (nf - (nf - i)); i++) {
				System.out.println("* ");
			} 
		} while (i<=nf);
				System.out.println();
				keyboard.close();
			}

}
