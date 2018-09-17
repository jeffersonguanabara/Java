package br.unipe.mlpa.exercicioExcecoes.Utils;

import br.unipe.mlpa.exercicioExcecoes.Exceptions.FahrenheitException;

public class Utils {

	public static double toCelsius(double tempF) {
		double tempC = 0;
		try {
			if (tempF > -459.67) {
				tempC = (5 * (tempF - 32)) / 9;		
			} else {
				throw new FahrenheitException("Zero Absoluto");
			}
		} catch (FahrenheitException fe) {
			// TODO: handle exception
			System.out.println(fe.getMessage());
		}
		return tempC;
	}
	
	public static void main(String[] args) throws FahrenheitException {
		System.out.println(Utils.toCelsius(-500));
	}
}
