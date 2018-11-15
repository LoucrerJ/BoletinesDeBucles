package boletinDeBucles;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
//		16.Realiza un programa que dado un número entero positivo de n cifras, calcule el número con
//		sus cifras en orden inverso. El resultado debe quedar en una variable. No utilizar String ni
//		calcular previamente el número de cifras. Ej: 54.321 debe devolver 12.345
		
//		PROCEDIMIENTO
//			1ºIntroducir un número
//			2ºCalcular la inversa del número introducido
//			3ºMostrar el número en su inversa.
		Scanner keyboard = new Scanner(System.in);
		int num ,r;
//		1ºIntroducir un número
		System.out.println("Introduce el número entero");
		num=keyboard.nextInt();
//		2ºCalcular la inversa del número introducido
		while(num>0) {
			r=num%10;
			num/=10;
//		3ºMostrar el número en su inversa.	
			System.out.print(r);
		}
	keyboard.close();
	}

}
