
public class EjemploCondicionales2 {
	public static void main(String[] args) { // main ctrl + space
		System.out.println("Hello World"); // sysout ctrl + space

		int edad = 17;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1; //conpara la variable que sea true or f
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condicion es:" + esPareja);
		System.out.println("El valor de la condicion es:" + puedeEntrar);

		if (puedeEntrar) {
			System.out.println("Puedes entrar");
		} else {
			System.out.println("No puedes entrar");
		}

	}
}
