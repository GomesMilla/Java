package sistemadenaves;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainComLista {

	public static void main(String[] args) {
		Random rand = new Random();
		
		EstacionamentoDeNave estacionamento = new EstacionamentoDeNave();
		
		List<Nave> naves = new ArrayList<Nave>();
		
		for(int i = 0; i < 10; i++) {
			naves.add(rand.nextBoolean() 
					? new NaveDeCombate(i*10, i, rand.nextBoolean() 
							? NaveStatus.Parada 
							: NaveStatus.Viajando)
					: new NaveDeTransporte(i*10, i, rand.nextBoolean()
							? NaveStatus.Parada 
							: NaveStatus.Viajando));
		}
		
		for(int i = 0; i < naves.size(); i++) {
			if(rand.nextBoolean())
				estacionamento.receberNave(naves.get(i));
			else
				estacionamento.liberarNave(naves.get(i));
		}

	}

}
