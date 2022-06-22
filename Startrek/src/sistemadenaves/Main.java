package sistemadenaves;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Nave nave01 = new NaveDeCombate(100, 1, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave02 = new NaveDeCombate(100, 2, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave03 = new NaveDeCombate(100, 3, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave04 = new NaveDeCombate(100, 4, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave05 = new NaveDeCombate(100, 5, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave06 = new NaveDeTransporte(100, 6, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave07 = new NaveDeTransporte(100, 7, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave08 = new NaveDeTransporte(100, 8, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave09 = new NaveDeTransporte(100, 9, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		Nave nave10 = new NaveDeTransporte(100, 10, 
				rand.nextBoolean() ? NaveStatus.Parada : NaveStatus.Viajando);
		
		EstacionamentoDeNave estacionamento = new EstacionamentoDeNave();
		
		estacionamento.receberNave(nave01);
		estacionamento.receberNave(nave02);
		estacionamento.receberNave(nave03);
		estacionamento.receberNave(nave04);
		estacionamento.receberNave(nave05);
		
		estacionamento.liberarNave(nave06);
		estacionamento.liberarNave(nave07);
		estacionamento.liberarNave(nave08);
		estacionamento.liberarNave(nave09);
		estacionamento.liberarNave(nave10);
	}

}
