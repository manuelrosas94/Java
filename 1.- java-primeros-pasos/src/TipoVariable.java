
public class TipoVariable {
	public static void main(String[] args) {
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //(int) forza a convertir a entero
		System.out.println(variable1Entero);
		
		long prueba = 222222222222222222L; // L or l
		short numeroPequeno = 23459;
		byte numeroAunMasPequeno = 15;
		float numeroDecimalPequeno = 2.5F;
		
		double resultado = variable1 + variable1Entero;
		System.out.println(resultado);
	}
}
