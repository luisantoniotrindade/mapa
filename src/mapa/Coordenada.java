package mapa;

public class Coordenada {

	private int linha;
	private int coluna;
	private boolean pertenceIlha;
	private Ilha ilha;

	public Coordenada(int linha, int i) {
		this.linha = linha;
		this.coluna = i;
		this.pertenceIlha = false;
	}

	@Override
	public String toString() {
		return "(" + linha + ", " + coluna + ")";
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public boolean isPertenceIlha() {
		return pertenceIlha;
	}

	public void setPertenceIlha(boolean pertenceIlha) {
		this.pertenceIlha = pertenceIlha;
	}
	
	public boolean EhVizinha(Coordenada c){
		if(this.linha == c.getLinha() && this.coluna == (c.getColuna() - 1) || this.coluna == c.getColuna() && this.linha == (c.getLinha()-1)){
			return true;
		}else{
			return false;
		}
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public Ilha getIlha() {
		return ilha;
	}

	public void setIlha(Ilha ilha) {
		this.ilha = ilha;
	}
	
	
}
