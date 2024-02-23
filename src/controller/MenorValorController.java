package controller;

public class MenorValorController {
	public MenorValorController() {
		super();
	}

	public int menorValor(int[] vet, int tamanho, int menorValor) {
		// A condição de parada será quando o vetor não tiver mais posições, e o retorno
		// será o menor valor encontrado
		if (tamanho == 0) {
			return menorValor;
		} else {
			// Enquanto a função não tiver chegado na condição de parada, o código irá fazer
			// uma verificação do valor contido no vetor na posição atual,
			// e caso o valor seja menor que o valor já encontrado, irá substituí-lo.
			int ultimaPosicao = tamanho - 1;
			if (vet[ultimaPosicao] <= menorValor) {
				menorValor = vet[ultimaPosicao];
			}
			tamanho = tamanho - 1;
			return menorValor(vet, tamanho, menorValor);
			// O retorno será a chamada da própria função, com o vetor, a posição reduzida
			// em 1, e o menor valor encontrado até agora
		}
	}
}
