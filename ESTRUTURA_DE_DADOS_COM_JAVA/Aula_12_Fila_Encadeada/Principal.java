package Aula_12_Fila_Encadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilaEncadeada fila = new FilaEncadeada();
		
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
