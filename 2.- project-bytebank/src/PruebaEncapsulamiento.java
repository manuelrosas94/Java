
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		cliente.setNombre("Manuel");
		cliente.setDocumento("456412");
		
		cuenta.setTitular(cliente);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
		System.out.println(titular);
	}
}
