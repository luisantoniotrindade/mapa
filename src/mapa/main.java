package mapa;

public class main {

	public static void main(String[] args) {
		Mapa m = new Mapa();
		m.lerArquivo();
		m.geraIlhas();
		System.out.println(m.toString());
	}

}