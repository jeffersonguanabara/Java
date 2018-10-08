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
		
		secretaria.setNome("JosÃ© Miguel");
		secretaria.setSalario(1800.0);
		secretaria.setNumeroDeRamal(21071561);
		
		telefonista.setNome("Carlos Alberto");
		telefonista.setSalario(1000.0);
		telefonista.setCodigoDeEstacaoDeTrabalho(102);
		
		System.out.println(gerente + "Bonificação do(a) Gerente: " + gerente.calculaBonificacao() + "\n");
		System.out.println(secretaria + "Bonificação do(a) Secretário(a): " + secretaria.calculaBonificacao() + "\n");
		System.out.println(telefonista + "Bonificação do(a) Telefonista: " + telefonista.calculaBonificacao());
	}
}
