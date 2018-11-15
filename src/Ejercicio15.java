package boletinDeBucles;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio15 {

	public static void main(String[] args) {
//		Realizar un programa en java para jugar con el ordenador a un juego de adivinanza. El
//		programa tendrá que adivinar una letra o un número pensado por el usuario. Para ello, el
//		juego consta de dos partes.
//		En la primera parte, el programa tendrá que adivinar el tipo, que puede ser:
//		• Un número del 0 al 9
//		• Una vocal minúscula
//		• Una consonante minúscula (sin contar la ñ)
//		El programa tendrá dos intentos como máximo para averiguar ese tipo. Si no lo adivina, el
//		juego termina y el ordenador habrá perdido.
//		Si lo adivina, se continúa jugando con la segunda parte donde tendrá que adivinar la letra o
//		el número concreto. Para ello tendrá los siguientes intentos:
//		• El número entre 0 y 9: tres intentos
//		• La vocal minúscula: dos intentos
//		• La consonante minúscula: cinco intentos. En este caso, el usuario le irá ayudando
//		diciéndole al ordenador si es mayor o menor según el orden alfabético.
//		Si el programa, dentro de ese número de intentos lo adivina, habrá ganado, si no, habrá
//		perdido. En cualquier caso, hay que informar al usuario.

//		PLANTAMIENTO:
			
		
		Scanner keyboard= new Scanner(System.in);
		int option,adivinar,intent=0;;
		System.out.printf("--------Juego de adivinanza---------\n");
		System.out.printf("Piensa en una de las siguientes opciones\n");
		System.out.printf("         ----Opciones----");
		System.out.printf("\n1 = Un número entero del (0-9)\n2 = Una vocal minuscula\n3 = Una consonante minuscula\n\n");
		
		do {
			option = start();
			do {
				if (option == 1) {
					System.out.printf("He elegido la opción %d\n", option);
				} else if (option == 2) {
					System.out.printf("He elegido la opción %d\n", option);
				} else if (option == 3) {
					System.out.printf("He elegido la opción %d\n", option);
				}
			} while (option <= 0 || option >= 4);
			do {
				System.out.println("¿Lo he adivinado?\n1-Si\n2-No");
				adivinar = keyboard.nextInt();
			} while (adivinar != 1 && adivinar != 2);
			intent++;
		} while (adivinar == 2 && intent <2);
	
		if (adivinar == 2)
			System.out.println("'Has perdido' Has perdidos todas tus oportunidades");
		else {
			if( option == 1)
				do {
					intent=0;
						System.out.println("Voy ha adivinar un número entero (0-9) \n----------- \n");
						System.out.printf("He elegido %d", opnumero());
					do {
							System.out.println("¿Lo he adivinado?\n1-Si\n2-No");
							adivinar = keyboard.nextInt();
					} while (adivinar != 1 && adivinar != 2);
					intent++;
				} while(adivinar == 2 && intent <3);
			else if(option == 2)
				do {
					intent=0;
						System.out.println("Voy ha adivinar si es una vocal \n----------- \n");
						System.out.printf("He elegido %s", vocal());
					do {
							System.out.println("¿Lo he adivinado?\n1-Si\n2-No");
							adivinar = keyboard.nextInt();
					} while (adivinar != 1 && adivinar != 2);
					intent++;
				} while(adivinar == 2 && intent <2);
			else if (option == 3)
				do {
					intent=0;
					System.out.println("Voy ha adivinar si es una consonante (0-9) \n----------- \n");
						System.out.printf("He elegido %s", consonante());
					do {
							System.out.println("¿Lo he adivinado?\n1-Si\n2-No");
							adivinar = keyboard.nextInt();
					} while (adivinar != 1 && adivinar != 2);
					intent++;
				} while(adivinar == 2 && intent <5);
		System.out.println("¡Lo has adiviando! ¡Has ganado!");
		}
		keyboard.close();
		}
		
	
	
	
	
	
//	Funcion  para devolver la eleccion de número,vocal o consonante.
	public static int start() {
		Random option = new Random();
		return option.nextInt(3)+1;
		}
//	Creación del método Random
	public static int choose() {
		Random choose = new Random();
		return choose.nextInt();
		}
//	Función  para devolver la elección de un número del 0-9.
	public static int opnumero() {
		Random chooseEnt = new Random();
		return chooseEnt.nextInt(9);	
	}
//	Función  para devolver la elección de las 5 vocales:aeiou
	public static int vocal() {
		Random vocal = new Random();
		vocal.nextInt((4)+1);
		
		return vocal();
	}
//	Función  para devolver la elección de las 22 consonantes "con ñ".
	public static String consonante() {
		String consonante = new String();
		consonante = "bcdfghjklmnñpqrstvwxyz";
		consonante.substring(0,22);
		return consonante;
	}
}
