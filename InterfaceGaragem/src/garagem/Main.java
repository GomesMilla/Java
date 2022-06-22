package garagem;

public class Main {

	public static void main(String[] args) {

		Garagem garagem = new Garagem(4);
		
		Carro carro01 = new Carro(4, "bibi");
		Carro carro02 = new Carro(5, "baba");
		Caminhao caminhao01 = new Caminhao(50);
		Carro carro03 = new Carro(2, "bebe");
		
		carro01.estacionar(garagem);
		carro02.estacionar(garagem);
		caminhao01.estacionar(garagem);
		carro03.estacionar(garagem);


		garagem.listarVeiculos();	
	}
}
