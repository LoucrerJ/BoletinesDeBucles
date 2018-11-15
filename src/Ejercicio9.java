package boletinDeBucles;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
		/* 1ºSolicitar datos.
		 * 2ºRealizar operaciones.
		 * 3ºMostrar  resultados. 
		 * */
//		 9.Realiza un programa que calcule x n,siendo x y n dos números enteros que se introducen por
//		 teclado. (Nota: no se puede utilizar Math.pow)

//		Creamos e inicializamos las variables.
		Scanner keyboard= new Scanner(System.in);
		int x,n,result;
		
//		Pedimos datos al usuario.
		System.out.println("Potencias:\n");
		System.out.println("\nIntrouzca su número:");
		x=keyboard.nextInt();
		System.out.println("\nIntroduce la potencia:");
		n=keyboard.nextInt();
		result=x;
		
//		Hacemos el bucle con operacion adentro.
			for(int i=1;i<=n;i++) {
				System.out.printf("\nResultado de la elevación %3$d^%1$d = %2$d \n",i,result,x );
				result=result*x;
			}	
		keyboard.close();
	}

}
