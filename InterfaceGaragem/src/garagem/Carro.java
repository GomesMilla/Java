package garagem;

public class Carro implements IVeiculo{
	
	public int quantidadePassageiros;
	public String buzina;
	
	public Carro(int qtdPass, String barulho) {
		quantidadePassageiros = qtdPass;
		buzina = barulho;
	}

	@Override
	public String buzinar() {
		return buzina;
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
