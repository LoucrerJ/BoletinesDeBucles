package boletinDeBucles;
import  java.util.Scanner;
import static colores.Colores.*;

public class Ejercicio22 {

	public static void main(String[] args) {

//		PLATAMIENTO:
//	1º Preguntamos en que posicion vamos ha colocar nuestro alfil en el tablero.	
//	2º Dibujar tablero de ajedrez, "sabemos que consta de 8 filas y 8 columnas"	
//		2.1 Dibujamos el color Negro.
//		2.2 Dibujamos el color Blanco.
//		2.3 Dibujamos el alfil y sus posibles movimientos.
//	3ºRepresentamos el tablero.
	
		
		Scanner keyboard =  new Scanner(System.in);
		int colum=1,row=1,posfil,poscol;
		String alfil="\u265d";
//		1º Preguntamos en que posicion vamos ha colocar nuestro alfil en el tablero.	
		System.out.println("¿En que fila colocamos el alfil?");
		posfil=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("¿Y la columna?");
		poscol=keyboard.nextInt();
		keyboard.close();
//		2º Dibujar tablero de ajedrez, "sabemos que consta de 8 filas y 8 columnas"
		for(int z=1;z<=8;z++) { //"z" es la  fila donde estamos.
			for (int j=1; j<=8; j++) {//"j" es la  columna donde estamos.
//				2.3 Dibujamos el alfil y sus posibles movimientos.
//				2.3.1 Para dibujar las posiciones del alfil tenemos que restar la posicion absoluta
//				de la fila que estoy con la fila inficada sea igual a la resta de los valores absolutos
//				de la columna donde estoy menos la columna indicada.
				if(posfil==z && poscol==j) {
					System.out.printf(FONDO_NEGRO + "%s  " + RESET, alfil);
					
				}
				else if (Math.abs(z-Math.abs(posfil))==(Math.abs(j-Math.abs(poscol)))) {
					System.out.print(FONDO_AMARILLO + "  " + RESET);
				}
//				2.1 Dibujamos el color Blanco."Para dibujarlo el resto de la división de fila y columan sea 0"
				else if ((colum+row)%2==0) {
					System.out.print(FONDO_BLANCO + "  " + RESET);
				}
//				2.2 Dibujamos el color Negro."Para dibujar el resto de la división de fila con columna sea distinto a 0"
				else{
					System.out.print(FONDO_VERDE + "  " + RESET);
				}
				colum++;
			}
			row++;
				System.out.println("");	
		}
	}
}


