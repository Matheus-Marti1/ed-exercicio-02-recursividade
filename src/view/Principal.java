package view;

import controller.MenorValorController;

public class Principal {

	public static void main(String[] args) {
		MenorValorController menorValorController = new MenorValorController();
		int vet[] = {4, 81, 5, 25, 10, 2, 31};
		int tamanho = vet.length;
		int ultimoValor = vet[tamanho-1];
		int menorValor = menorValorController.menorValor(vet, tamanho, ultimoValor);
		System.out.println("Menor valor do vetor: " + menorValor);
	}
}
