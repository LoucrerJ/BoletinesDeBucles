package boletinDeBucles;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
				/* 1ºSolicitar datos.
				 * 2ºRealizar la factorización.
				 * 3ºMostrar resultados. 
				 * */
		Scanner keyboard = new Scanner(System.in);
		int x; 
		
//		1ºPedir datos al usuario.
		System.out.println("Introduzca el número que vamos ha factorial");
		x=keyboard.nextInt();
//		2ºCalcular el número factorial y mostramos el resultado.
		System.out.printf("Su número factorial es: %d",factorial(x) );
		
		keyboard.close();
		
	}
	
	public static int factorial(int n){
//	En está función calculamos el número factorial de cierto número que le digamos.
		int result=1;
		
		for(int i=2;i<=n;i++) {
			result*=i;
		}		
		
		return result;
	}
}
