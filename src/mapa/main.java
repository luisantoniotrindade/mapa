package mapa;

import java.io.Externalizable;

public class main {

	public static void main(String[] args) {
		Mapa m = new Mapa();
		
		String nomeDoArquivo = "example_1.txt";
		/* Fun��o extra para verificar a estrutura da matrix original
		m.exibeMatriz(nomeDoArquivo);
		*/
		
		m.lerArquivo(nomeDoArquivo);
		m.geraIlhas();
		
		System.out.println(m.toString());
		
		
		
	}

}
