package mapa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Mapa {
	ArrayList<Coordenada> coordenadas = new ArrayList<>();
	ArrayList<Ilha> ilhas = new ArrayList<>();
	int linha = 0;
	
	public void lerArquivo() {
		  Scanner sc;
		try {
			sc = new Scanner(new File("src/txt/mapa.txt"));
			while (sc.hasNext()) {
				
				String[] valores = sc.next().split("");
				  for(int i = 0; i < valores.length;i++){
					  if(valores[i].equals("1")){
						  Coordenada c = new Coordenada(linha, i);
						  coordenadas.add(c);
					  }
				  }
				  linha++;
				  //System.out.println("");
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}
	
	
	
	public void geraIlhas(){
		for(int i = 0; i < coordenadas.size();i++){
			boolean unica = true;
			Coordenada a = coordenadas.get(i);
				for(int j = (i+1); j < coordenadas.size();j++){
					Coordenada b = coordenadas.get(j);
					if(a.EhVizinha(b)){
						unica = false;
						//System.out.println(a.toString() + "pertence" + b.toString());
						if(a.isPertenceIlha() && !b.isPertenceIlha()){
							b.setPertenceIlha(true);
							b.setIlha(a.getIlha());
							a.getIlha().add(b);
						}else if(b.isPertenceIlha() && !a.isPertenceIlha()){
							a.setPertenceIlha(true);
							a.setIlha(b.getIlha());
							b.getIlha().add(a);
						
						}else if((!b.isPertenceIlha() && !a.isPertenceIlha())){
							Ilha ilha = new Ilha();
							ilha.add(a);
							ilha.add(b);
							a.setIlha(ilha);
							b.setIlha(ilha);
							a.setPertenceIlha(true);
							b.setPertenceIlha(true);
							ilhas.add(ilha);
						}
					}else{
						//System.out.println(a.toString() + "não pertence" + b.toString());
					}
				
			}
				if(!a.isPertenceIlha()){
					Ilha ilha = new Ilha();
					ilha.add(a);
					a.setIlha(ilha);
					a.setPertenceIlha(true);
					ilhas.add(ilha);
				}
			
		}
	}

	@Override
	public String toString() {
		//return "[" +ilhas + "]";
		//Original: return "[" +ilhas + "]";
		int totalIlhas = ilhas.size();
		//String fim = "Total de Ilhas: " + totalIlhas;
		String fim = Integer.toString(totalIlhas);
		return fim;
	}
	
	
}
