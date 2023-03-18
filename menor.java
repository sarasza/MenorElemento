package Atividade;

public class Menor {

	public static void main(String[] args) {
		int vetor[] = {1, 9, 2, 8, 3, 7, 4, 6, 5};
		System.out.println("Menor elemento: " + resultado(vetor, 0, vetor.length));
	}

	public static int resultado(int vetor[], int i, int menor) {
		if (i == vetor.length) {
			return menor;
		} else {
			if (menor > vetor[i]) {
				menor = vetor[i];
			}
			return resultado(vetor, i + 1, menor);
		}
	}
}
