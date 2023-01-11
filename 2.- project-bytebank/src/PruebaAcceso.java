
public class PruebaAcceso {
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(1);
		cuenta.setAgencia(-22);
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		System.out.println(cuenta.getSaldo()); //para proteger de num negativos
		System.out.println(cuenta.getAgencia());
	}
}
