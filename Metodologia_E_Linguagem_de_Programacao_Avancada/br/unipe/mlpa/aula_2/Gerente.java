package br.unipe.mlpa.aula_2;

public class Gerente extends Funcionario{

	private String nomeDeUsuario;
	private String senha;
	
	@Override
	public double calculaBonificacao() {
		return super.getSalario() * 60/100;
	}
	
	@Override
	public String toString() {
		String s = "";
		s = super.toString() +  
				"Nome de Usuário: " + this.nomeDeUsuario + "\n" +
				"Senha: " + this.senha + "\n";
		return s;
	}
	
	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}
	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
