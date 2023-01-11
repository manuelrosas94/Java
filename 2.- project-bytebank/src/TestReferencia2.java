
public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		Cliente manuel = new Cliente();
		manuel.nombre = "Manuel";
		manuel.documento = "12345";
		manuel.telefono = "1234567890";
		
		Cuenta cuentaManuel = new Cuenta();
		cuentaManuel.agencia = 1;
		cuentaManuel.titular = manuel;
		
		System.out.println(cuentaManuel.titular.documento);
		System.out.println(cuentaManuel.titular);
		System.out.println(manuel);
		
	}
}
