package br.unipe.mlpa.aula_1;

public class Principal {

	public static void main(String[] args) {
		
		//InstÃ¢nciando os objetos
		Pneu pneu = new Pneu();
		Motor motor = new Motor();
		Banco banco = new Banco();
		
		Carro carro = new Carro();
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		pneu.setPreco(259.9);
		banco.setPreco(1000.0);
		motor.setPreco(5000.0);
		
		System.out.println("Carro 1, preço: " + carro.getPreco(pneu, motor, banco));
		
		pneu.setPreco(300.0);
		banco.setPreco(1500.0);
		motor.setPreco(4000.0);
		
		System.out.println("Carro 2, preço: " + carro1.getPreco(pneu, motor, banco));
		
		pneu.setPreco(209.9);
		banco.setPreco(900.0);
		motor.setPreco(6000.0);
		
		System.out.println("Carro 3, preÃ§o: " + carro2.getPreco(pneu, motor, banco));
		
	}
}
