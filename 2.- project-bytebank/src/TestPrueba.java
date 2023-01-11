
public class TestPrueba {
	
	public static void main(String[] args) {
		
		Cuenta CuentaDeMarcela = new Cuenta();
//		CuentaDeMarcela.titular = new Cliente(); 
		CuentaDeMarcela.titular.nombre = "Marcela";
		
		System.out.println(CuentaDeMarcela.titular.nombre);
	}
}
