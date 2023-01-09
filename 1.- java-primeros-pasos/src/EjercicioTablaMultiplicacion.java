
public class EjercicioTablaMultiplicacion {
	
	public static void main(String[] args) {
	
		for(int contador = 0; contador <= 10; contador++) {
			for(int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
				System.out.print(contador*multiplicacion);//print imprime en una linea
				System.out.print(" ");
			}
			System.out.println();//println salta una linea
		}
	}
}
