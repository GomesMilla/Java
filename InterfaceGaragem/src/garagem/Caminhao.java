package garagem;

public class Caminhao implements IVeiculo{
	
	public float carga;
	
	public Caminhao(int carg) {
		carga = carg;
	}

	@Override
	public String buzinar() {
		// TODO Auto-generated method stub
		return "Fonnnn";
	}

	@Override
	public boolean estacionar(Garagem garagem) {
		if(garagem.temVaga()){
			garagem.veiculos.add(this);
			return true;
		}
		return false;
	}

}
