package boletinDeBucles;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
				/* 1-Mostrar menu de la calculadora
				 * 2-Introducir datos solicitados.
				 * 3-Calcular según la opcion. 
				 * */
		Scanner keyboard= new Scanner(System.in);
		int option,continuar;
		double n1,n2;
		
		System.out.println("Calculadora");
		do {
			//1-Pedir los datos al usuario e introducimos los datos del usuario.
			System.out.println("\n----\nOperaciones disponibles: \n 1-Suma\n 2-Resta\n 3-Division\n 4-Multiplicación\n\nElija una opción: ");
			option=keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("\nPrimer operando: ");
			n1=keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("\nSegundo operando: ");
			n2=keyboard.nextDouble();
			keyboard.nextLine();
			
			//Realizamos el caso  según el número introducido.
			switch(option) {
				case 1:
					System.out.printf("\nResultado: %.2f + %.2f = %.2f\n\n",n1,n2,n1+n2 );
					break;
				case 2:
					System.out.printf("\nResultado: %.2f - %.2f = %.2f\n\n",n1,n2,n1-n2 );
					break;
				case 3:
					System.out.printf("\nResultado: %.2f / %.2f = %.2f\n\n",n1,n2,n1/n2 );
					break;
				case 4:
					System.out.printf("\nResultado: %.2f * %.2f = %.2f\n\n",n1,n2,n1*n2 );
					break;
				default:
					System.out.println("ERROR:No has introducido un número del menú"); 
					break;
			
			}
			System.out.println("¿Quiere realizar otro calculo?\n1-Si\n2-No\nElija una opción: ");
			continuar=keyboard.nextInt();
		
		} while(continuar==1);
		keyboard.close();
	}

}
