package repaso; // fabrica

public class Repaso {
	private byte bateria;

	public void cargar(byte cantidad) {
		bateria = cantidad;

	}

	public void usar() {
		bateria = 0;
	}

	public byte getBateria() {
		return bateria;
	}

}
