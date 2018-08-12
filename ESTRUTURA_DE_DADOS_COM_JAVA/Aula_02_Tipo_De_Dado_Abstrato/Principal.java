package Aula_02_Tipo_De_Dado_Abstrato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disciplina disciplina = new Disciplina();
		
		disciplina.setCodigo("DET715");
		disciplina.setNome("Estrutura de Dados");
		disciplina.setCH(80);
		
		System.out.println("Código: " + disciplina.getCodigo());
		System.out.println("Nome: " + disciplina.getNome());
		System.out.println("CH: " + disciplina.getCH());

	}

}
