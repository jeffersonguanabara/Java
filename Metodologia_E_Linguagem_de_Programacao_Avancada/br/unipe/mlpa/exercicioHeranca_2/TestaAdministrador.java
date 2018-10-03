package br.unipe.mlpa.exercicioHeranca_2;

public class TestaAdministrador {

	public static void main(String[] args) {
		
		Administrador admin = new Administrador();
		
		admin.setNome("Jefferson");
		admin.setEndereco("Rua Barão");
		admin.setTelefone("98633-5294");
		admin.setCodigoSetor(01);
		admin.setSalarioBase(50000.00f);
		admin.setImposto(0.19f);
		admin.setAjudaDeCusto(2500.00f);
		
		System.out.println(admin.getNome());
		System.out.println(admin.getEndereco());
		System.out.println(admin.getTelefone());
		System.out.println(admin.getCodigoSetor());
		System.out.println(admin.getSalarioBase());
		System.out.println(admin.getImposto());
		System.out.println(admin.getAjudaDeCusto());
		System.out.println(admin.calculaSalario());
		
		System.out.println(admin);
	}

}
