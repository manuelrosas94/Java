
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta cuentaManuel = new Cuenta();
		cuentaManuel.saldo = 300;
		cuentaManuel.depositar(200);
		System.out.println(cuentaManuel.saldo);
		
		cuentaManuel.retirar(100);
		System.out.println(cuentaManuel.saldo);
		
		Cuenta cuentaValentina = new Cuenta();
		cuentaValentina.depositar(1000);
		boolean puedeTransferir = cuentaValentina.transferir(400, cuentaManuel);
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No es posible");
		}
		
		System.out.println(cuentaValentina.saldo);
		System.out.println(cuentaManuel.saldo);
	}
}
