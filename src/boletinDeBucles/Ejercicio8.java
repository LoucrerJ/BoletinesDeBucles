package boletinDeBucles;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
		/* Solicitar datos al usuario.
		 * Realizar operaciones.
		 * Mostrar resultados. 
		 * */
		
//		8.Utilizando un bucle for con dos contadores, realiza un programa que dados dos números enteros
//		a y b que se introducen por teclado(a<b), vaya aumentando a al doble de su valor y
//		disminuyendo b a la mitad de su valor hasta que a>b.
		
		Scanner keyboard= new Scanner(System.in);
		int a,b,i,j;
		
		
		System.out.println("Introduce el primer número entero");
		a=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Introduce el segundo número entero");
		b=keyboard.nextInt();
		keyboard.nextLine();
		
		for (i=a,j=b;i<j;i=(i*2),j=(j/2)) {
			System.out.printf("i: %d j:%d\n",i,j);
		}
		
		keyboard.close();
	}

}
