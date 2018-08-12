package Aula_11_Fila_Sequencial;

public class FilaSequencial {
	
	String contatos [] = new String[100];
	int tamanho = -1;
	
	public boolean isVazia() {
		return (tamanho == -1);
	}
	
	public boolean isCheia() {
		return (tamanho == contatos.length - 1);
	}
	
	//public boolean inserir(String contato) {
	public String inserir(String contato) {	
		if (isCheia()) //return false;
			return "Está Cheia";
		tamanho++;
		contatos[tamanho] = contato;
		//return true;
		return "Inseriu!";
	}
	
	public String remover() {
		if (isVazia()) //return null;
			return "Nenhum Elemento a ser removido!";
		
		String valor = contatos[0];
		contatos[0] = null;
		for (int i = 0; i < tamanho; i++) {
			contatos[i] = contatos[i + 1];
		}
		
		contatos[tamanho] = null;
		tamanho--;
		return valor + " removido!";
	}
	
	public String exibirFila() {
		String s = "";
		if (isVazia()) {
			//System.out.println("Fila Vazia");
			return "Fila Vazia";
		}
		for (int i = 0; i <= tamanho; i++) {
			//System.out.println("Posição " + (i + 1) + ": " + contatos[i]);
			s += "Posição " + (i + 1) + ": " + contatos[i] + " | ";
		}
		System.out.println("\n");
		return s;
	}
	
	public void esvaziarFila() {
		contatos = new String [100];
		tamanho = -1;
	}
}
