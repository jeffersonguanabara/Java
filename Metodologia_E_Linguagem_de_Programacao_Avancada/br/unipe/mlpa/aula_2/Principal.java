package br.unipe.mlpa.aula_2;

public class Principal {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Secretaria secretaria = new Secretaria();
		Telefonista telefonista = new Telefonista();
		
		gerente.setNome("Paulo Ricardo");
		gerente.setSalario(5000.0);
		gerente.setNomeDeUsuario("paulo.ricardo");
		gerente.setSenha("*******");
		
		secretaria.setNome("José Miguel");
		secretaria.setSalario(1800.0);
		secretaria.setNumeroDeRamal(21071561);
		
		telefonista.setNome("Carlos Alberto");
		telefonista.setSalario(1000.0);
		telefonista.setCodigoDeEstacaoDeTrabalho(102);
		
		System.out.println(gerente + "Bonifica��o do(a) Gerente: " + gerente.calculaBonificacao() + "\n");
		System.out.println(secretaria + "Bonifica��o do(a) Secret�rio(a): " + secretaria.calculaBonificacao() + "\n");
		System.out.println(telefonista + "Bonifica��o do(a) Telefonista: " + telefonista.calculaBonificacao());
	}
}
