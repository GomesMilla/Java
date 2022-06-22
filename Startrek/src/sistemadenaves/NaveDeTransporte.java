package sistemadenaves;

public class NaveDeTransporte extends Nave{
	
	private int capacidade;
	
	public NaveDeTransporte(int capacidade, int id, NaveStatus status) {
		this.capacidade = capacidade;
		this.id = id;
		this.naveStatus = status;
	}
}
