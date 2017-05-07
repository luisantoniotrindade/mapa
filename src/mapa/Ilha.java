package mapa;

import java.util.ArrayList;

public class Ilha {
	private ArrayList<Coordenada> coordenadas = new ArrayList<>();
	
	public void add(Coordenada c){
		coordenadas.add(c);
	}

	@Override
	public String toString() {
		return "[" + coordenadas + "]";
	}
	
}
