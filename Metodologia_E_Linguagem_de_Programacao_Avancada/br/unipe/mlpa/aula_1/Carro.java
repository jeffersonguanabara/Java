package br.unipe.mlpa.aula_1;

public class Carro {

	private Pneu pneu;
	private Motor motor;
	private Banco banco;
	
	
	public double getPreco(Pneu pneu, Motor motor,Banco banco) {
		return pneu.getPreco() + motor.getPreco() + banco.getPreco();
	}
	
	
	public Pneu getPneu() {
		return pneu;
	}
	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
}
