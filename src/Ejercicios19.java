package boletinDeBucles;
import java.util.Scanner;
import static boletinDeBucles.Colores.*;

public class Ejercicios19 {

	public static void main(String[] args) {

		Scanner keyboard= new Scanner(System.in);

		int base, aux=0, i=0, result,total;
		
//		19.Elabore un programa que imprima el triángulo hasta un valor dado. El triángulo contiene los
//		números naturales correlativos, uno en la primera línea, dos en la segunda, etc.; es decir, en
//		la fila n-esima aparecen n valores. Ejemplo:
//		1
//	   1 2
//	  1 2 3
//	 1 2 3 4
//  1 2 3 4 5
		
	/*PROCEDIMIENTO
	 1º Pedir la base y el caracter que vamos ha utilizar para el crear el triangulo de números.
	 2º Dibujamos las filas donde vamos ha representar el triangulo.
	 	2.1 Dibujamos los espacios.
	 	2.2 Dibujamos los números y Hacemos el incremento.
	 */
		

//		1º Pedir la base y el número que vamos ha utilizar para el crear el triangulo.
		System.out.println("Introduzca la base de nuestro triangulo");
		base= keyboard.nextInt();
		System.out.println("Indruce el número con que vamos hacer el triangulo.");
		total=keyboard.nextInt();	
		
//		2º Dibujamos las filas donde vamos ha representar el triangulo.
		for (i=base-1;i>=0;i--) {
			aux++;
//			2.1 Dibujamos los espacios.
			for(int j=0;j<=i; j++) {
				System.out.print(FONDO_MORADO + " " + RESET);
			}
//			2.2 Dibujamos los números y en su siguiente aparicion de la siguiente fila le incrementamos 1.
			for (int k=0;k<=aux-1;k++) {
				result=total+k;
				System.out.printf(VERDE + "%d " + RESET, result);
			}
			System.out.println("");
		}
		keyboard.close();
	}

}
