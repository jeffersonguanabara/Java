package br.caelum.FJ11.Capitulo_3;

public class GastoTotalDoTrimestre {

	public static void main(String [] args) {
		
		// inicializando as variáveis gasto_janeiro, gasto_fevereiro, gasto_marco inteiras.
		int gasto_janeiro = 15000;
		int gasto_fevereiro = 23000;
		int gasto_marco = 17000;
		
		// atribuindo a variável gasto_trimestre a soma das variáveis gasto_janeiro, gasto_fevereiro, gasto_marco
		int gasto_trimestre = gasto_janeiro + gasto_fevereiro + gasto_marco;
		
		// imprimindo no console a soma dos gastos do trimestre
		System.out.println("Gastos totais do primeiro trimestre: " + gasto_trimestre);
		
		// atribuindo a variável media_gastos_trimestre a media dos valores do trimestre.
		double media_gastos_trimestre = gasto_trimestre / 3;
		
		// imprimindo no console a media de gastos do trimestre.
		System.out.println("Média dos gastos do trimestre: " + media_gastos_trimestre);
	}
}
