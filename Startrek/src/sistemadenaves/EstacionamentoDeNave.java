package sistemadenaves;

import java.util.ArrayList;
import java.util.List;

public class EstacionamentoDeNave {
	
	private List<Nave> navesEstacionadas = new ArrayList<Nave>();
	
	public void receberNave(Nave nave) {
		if(nave.pousar()) {
			navesEstacionadas.add(nave);
		} else {
			System.out.println("Nave " + nave.getId() + " não pode ser estacionada.");
		}
	}
	
	public void liberarNave(Nave nave) {
		if(nave.decolar()) {
			navesEstacionadas.remove(nave);
		} else {
			System.out.println("Nave " + nave.getId() + " não pode decolar.");
		}
	}
}
