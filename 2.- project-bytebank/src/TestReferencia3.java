
public class TestReferencia3 {
	
	public static void main(String[] args) {
		Cuenta cuentaManuel = new Cuenta();
		
//		cuentaManuel.titular = new Cliente();
		//cuentaManuel.titular.nombre = "Manuel";  
		//no accede a nada porque titular no esta accediando a ninguna clase
		
		System.out.println(cuentaManuel.titular.nombre);
		
	}
}
