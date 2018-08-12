package Aula_11_Fila_Sequencial;

public class Principal {
	
	public static void main(String[] args) {
		
		FilaSequencial fila = new FilaSequencial();
		
		fila.inserir("Ana");
		fila.inserir("Bruno");
		fila.inserir("Carla");
		fila.inserir("Daniel");
		fila.inserir("Eduardo");
		fila.exibirFila();
		
		fila.remover();
		fila.remover();
		fila.remover();
		fila.exibirFila();
		
		fila.inserir("Fábio");
		fila.inserir("Gustavo");
		fila.exibirFila();
		
		fila.esvaziarFila();
		fila.exibirFila();
	}
}
