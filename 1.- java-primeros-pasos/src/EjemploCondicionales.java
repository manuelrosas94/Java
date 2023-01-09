
public class EjemploCondicionales {

	public static void main(String[] args) { // main ctrl + space
		System.out.println("Hello World"); // sysout ctrl + space

		int edad = 17;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Puedes entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Eres menor de edad pero esta permitido tu ingreso");
			}else
			System.out.println("No puedes entrar");
		}

	}
}
