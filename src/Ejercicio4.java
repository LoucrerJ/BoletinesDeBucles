package boletinDeBucles;

import java.util.Random;

public class Ejercicio4 {
	/* 1.- lanzar dados aleatoriamente
	 * 2- Solo se permite 20 jugadas
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int puntoDado, i;
		Random numero=new Random();
				
		for(i=1;i<=20;i++) {
			puntoDado = numero.nextInt(6)+1;				
			System.out.printf("ha salido el (%d) %s %d %n", puntoDado, "en la jugada ", i);
		}

	}

}
