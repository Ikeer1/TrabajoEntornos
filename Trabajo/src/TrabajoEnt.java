
public class TrabajoEnt {

	int numero1 = 8, numero2 = 2;
	int suma;
	
	void sumar() {
		suma= (numero1 + numero2);
		System.out.println("El resultado es: " + suma);
	}
	
	public static void main(String[] args) {
	TrabajoEnt tbj = new TrabajoEnt();
	tbj.sumar();
	}

}
