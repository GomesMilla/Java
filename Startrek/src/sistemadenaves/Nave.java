package sistemadenaves;

public abstract class Nave {

	protected int id;
	protected NaveStatus naveStatus;
	
	public int getId() {
		return id;
	}
	
	public boolean pousar(){
		if(naveStatus == NaveStatus.Parada) return false;
		naveStatus = NaveStatus.Parada;
		return true;
	}
	
	public boolean decolar(){
		if(naveStatus == NaveStatus.Viajando) return false;
		naveStatus = NaveStatus.Viajando;
		return true;
	}
	
}
