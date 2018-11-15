package boletinDeBucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//PROCEDIMIENTO:
		/* 1-Pedir las 10 notas.
		 * 2-Contamos cuantas hay de cada una.
		 * 3-Mostrar los resultados. 
		 * */
		
	int n1=1, y=1, muyinsf = 0, insf = 0, suf = 0, bien = 0, not = 0, sobr = 0;
	
	Scanner keyboard = new Scanner(System.in);
			
		do {	
//			1-Pedir las 10 notas e introducimos las notas.
			System.out.println("Nota" + y + ": ");
				n1=keyboard.nextInt();
				y++;
//			2-Contamos cuantas hay de cada una.
				if (n1 >= 0 && n1 <= 2)
					muyinsf++;
				else if (n1 >= 3 && n1 <= 4)
					insf++;
				else if (n1 == 5)
					suf++;
				else if (n1 == 6)
					bien++;
				else if (n1 == 7 || n1 == 8)
					not++;
				else if (n1 == 9 || n1 == 10)
					sobr++;
		
		} while (y <=10);
//		Mostrar los resultados.
		System.out.println("Muy insuficientes: " + muyinsf);
		System.out.println("Insuficientes: " + insf);
		System.out.println("Suficientes: " + suf);
		System.out.println("Bien: " + bien);
		System.out.println("Notables: " + not);
		System.out.println("Sobresalientes: " + sobr);
		keyboard.close();
	}

}
