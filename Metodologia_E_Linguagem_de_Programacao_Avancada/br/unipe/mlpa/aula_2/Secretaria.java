package br.unipe.mlpa.aula_2;

public class Secretaria extends Funcionario {

	private int numeroDeRamal;
	
	@Override
	public String toString() {
		String s = "";
		s = super.toString() +
				"Número de Ramal: " + this.numeroDeRamal + "\n";
		return s;
	}

	public int getNumeroDeRamal() {
		return numeroDeRamal;
	}

	public void setNumeroDeRamal(int numeroDeRamal) {
		this.numeroDeRamal = numeroDeRamal;
	}
	
}
