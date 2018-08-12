package Aula_10_Pilha_Encadeada;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilhaEncadeada stack = new PilhaEncadeada();
		
		stack.push("ana");
		stack.push("bruno");
		stack.push("carla");
		stack.push("daniel");
		stack.exibirElementos();
		System.out.println("A pilha tem " + stack.quantidadeElementos() + " elementos.\n\n");
		
		stack.pop();
		stack.exibirElementos();
		System.out.println("A pilha tem " + stack.quantidadeElementos() + " elementos.\n\n");
	}

}
