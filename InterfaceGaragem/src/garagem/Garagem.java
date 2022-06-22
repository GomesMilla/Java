package garagem;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
	
	List<IVeiculo> veiculos = new ArrayList<IVeiculo>();
	
	public int capacidade;
	
	public Garagem(int cap) {
		capacidade = cap;
	}
	
	void listarVeiculos() {
		for(int i = 0; i < veiculos.size(); i++) {
			System.out.println(veiculos.get(i) + " " + veiculos.get(i).buzinar());
		}
	}
	
	public boolean temVaga() {
		if(veiculos.size() < capacidade)
			return true;
		return false;
	}

}
