package boletinDeBucles;
import static boletinDeBucles.Colores.*;

public class UsoColores {

	public static void main(String[] args) {
		
		System.out.println(ROJO + "Este texto es de color rojo" + RESET);
		System.out.println("Volvemos al color por defecto");
		System.out.println(VERDE + "...y ahora es verde" + RESET);
		System.out.println(FONDO_MORADO + "Fondo morado" + RESET);
		System.out.println(CELESTE + FONDO_BLANCO + "Fondo blanco con texto celeste" + RESET);
		System.out.println(CELESTE + FONDO_BLANCO + NEGRITA + "Fondo blanco con texto celeste en negrita" + RESET);
		System.out.println(CELESTE + FONDO_BLANCO + SUBRAYADO + "Fondo blanco con texto celeste subrayado" + RESET);
		System.out.printf("%s",AMARILLO + FONDO_ROJO + (char)9733 + RESET);//Estrella
		
	}
}
