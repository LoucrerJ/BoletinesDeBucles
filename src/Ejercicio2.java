package boletinDeBucles;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*1.- Pedir dos números.
		 *2.- Sumar el primer número tantas veces como se indique en el segundo.
		 */
	Scanner keyboard= new Scanner(System.in);
	int num1,num2,i,calculate=0;
//	1-Pedimos los números.
	System.out.println("Introduce el número donde la aplicaremos su multiplo");
	num1=keyboard.nextInt();
	keyboard.nextLine();
	System.out.println("Introduce el múltiplo");
	num2=keyboard.nextInt();
	
//	2-Vamos sumando.
	for(i=1;i<=num2;i++) {
		
		System.out.printf("%d + %d = %d\n",num1, calculate, num1+calculate);
		calculate=num1+calculate;

	}
	keyboard.close();
	}

}
