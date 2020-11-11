package repaso;
// aqui iria el import
public class Mando {
	public static void main(String[] args) {
		byte carga = 75;

		Repaso miRepaso = new Repaso();
		miRepaso.cargar(carga);
		System.out.println("El mando esta al " + miRepaso.getBateria() + "%");
		miRepaso.usar();
		System.out.println("El mando esta al " + miRepaso.getBateria() + "%"); // print normalmente en el main
	}

}
