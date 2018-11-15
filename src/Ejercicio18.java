package boletinDeBucles;
import java.util.Scanner;
import static boletinDeBucles.Colores.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		String character;
		int base, aux=0, i=0, aux2=0;
//		18.Realiza un algoritmo que lea un número natural n y un carácter por teclado. La salida debe
//		ser un rombo compuesto del carácter y de la anchura que especifica el número n. Por
//		ejemplo, si n es 5 y el carácter es *, el rombo sería:
		
//		 *
//		* *
//	   * * *
//	  * * * *
//	 * * * * *
//	  * * * *
//	   * * *
//		* *
//		 *
		
		/*PROCEDIMIENTO
		 1º Pedir la base y el caracter que vamos ha utilizar para el crear el rombo.
		 2º Dibujamos las filas donde vamos ha representar el rombo.
		 	2.1 Dibujamos los espacios.
		 	2.2 Dibujamos los caracteres.
		 3º Invertimos el proceso para dibujar la mitad inferior del rombo.
		 */
		

//		1º Pedir la base y el caracter que vamos ha utilizar para el crear el rombo.
		System.out.println("Introduzca la base de nuestro rombo");
		base= keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Indruce el caracter con que vamos hacer el rombo.");
		character=keyboard.nextLine();	
		
//		2º Dibujamos las filas donde vamos ha representar el rombo.
		for (i=base-1;i>=0;i--) {
			aux++;
//			2.1 Dibujamos los espacios.
			for(int j=0;j<=i; j++) {
				System.out.print(FONDO_MORADO + " " + RESET);
			}
//			2.2 Dibujamos los caracteres.
			for (int k=0;k<=aux-1;k++) {
				System.out.printf("%s ", character);
			}
			System.out.println("");
		}
//		3º Invertimos el proceso para dibujar la mitad inferior del rombo.
		for (i=base-2;i>=0;i-- ) {
			aux2++;
			for(int z=0;z<=aux2-1; z++) {
				System.out.print(FONDO_MORADO + " " + RESET);
			}
			for(int j=0;j<=i; j++) {
				System.out.printf(" %s", character);
			}

			System.out.println("");
		}
		keyboard.close();
	}

}
