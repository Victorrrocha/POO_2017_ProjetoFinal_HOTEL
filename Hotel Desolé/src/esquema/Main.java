package esquema;

public class Main {

	public static void main(String[] args) {
		Titular a = new Titular("Victor", 1234, 1492, 4321);
		Entram b = new Dependente("Chico", 1489, 1234);
		
		b.antenticam(1234);
	}

}
