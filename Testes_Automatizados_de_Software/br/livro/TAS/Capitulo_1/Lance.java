package br.livro.TAS.Capitulo_1;

public class Lance {

	private Usuario usuario;
	private double valorDoLance;
	
	public Lance() {
		// TODO Auto-generated constructor stub
	}
	
	public Lance(Usuario usuario, double valorDoLance) {
		super();
		this.usuario = usuario;
		this.valorDoLance = valorDoLance;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public double getValor() {
		return valorDoLance;
	}

	
		
}
