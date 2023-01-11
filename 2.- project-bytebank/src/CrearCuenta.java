public class CrearCuenta {
	public static void main(String[] args) {
		//Variable              Valor
		Cuenta primeraCuenta = new Cuenta(); //para llamar a un objeto
		primeraCuenta.depositar(400);//se remplazo .saldo por .depositar()
		//primeraCuente.pais = "Mexico";
		System.out.println(primeraCuenta.getSaldo()); //se remplazo saldo por getSaldo();
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(400);
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if(primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}else {
			System.out.println("Son diferentes");
		}
	}
}