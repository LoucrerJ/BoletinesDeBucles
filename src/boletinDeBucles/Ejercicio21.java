package boletinDeBucles;
import static boletinDeBucles.Colores.*;

public class Ejercicio21 {

	public static void main(String[] args) {
//		PLATAMIENTO:
//	1º Dibujar tablero de ajedrez, "sabemos que consta de 8 filas y 8 columnas"	
//		1.1 Dibujamos el color Negro.
//		1.2 Dibujamos el color Blanco.
//	2ºRepresentamos el tablero.
	
		int columna=1,fila=1;
//		1º Dibujar tablero de ajedrez, "sabemos que consta de 8 filas y 8 columnas"
		for(int z=1;z<=8;z++) {
//			1.2 Dibujamos el color Blanco."Para dibujarlo el resto de la división de fila y columan sea 0"
			for (int j=1; j<=8; j++) {
				if ((columna+fila)%2==0) {
					System.out.print(FONDO_BLANCO + "  " + RESET);
				}
//				1.1 Dibujamos el color Negro."Para dibujar el resto de la división de fila con columna sea distinto a 0"
				else {
					System.out.print(FONDO_VERDE + "  " + RESET);
				}
				columna++;
			}
			fila++;
				System.out.println("");	
		}
	}

}
