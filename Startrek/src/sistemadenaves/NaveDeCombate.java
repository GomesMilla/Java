package sistemadenaves;

public class NaveDeCombate extends Nave{
	
	private int poderDeFogo;
	
	public NaveDeCombate(int poderDeFogo, int id, NaveStatus status) {
		this.poderDeFogo = poderDeFogo;
		this.id = id;
		this.naveStatus = status;
	}
}
