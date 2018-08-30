package br.unipe.mlpa.apresentacao;

public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private int cep;
	private String complemento;
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	public Endereco(String rua, int numero, String bairro,
			String cidade, int cep, String complemento) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	public String toString() {
		String s = "";
		s += "[Endereço]\n" 
				+ "Rua: " + this.rua + ", " + this.numero + "\n"
				+ "Complemento: " + this.complemento + "\n"
				+ "Bairro: " + this.bairro + "\n"
				+ "Cidade: " + this.cidade + "\n"
				+ "CEP: " + this.cep;
		return s;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
