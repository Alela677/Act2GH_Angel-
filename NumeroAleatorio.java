package Tema2;

public class NumeroAleatorio {

	public static void main(String[] args) {
		int[] array = new int[20];
		int[] num = new int[20];

		int contador = 0;
		for (int i = 0; i < num.length; i++) {
			array[i] = (int) (Math.random() * 20);
			System.out.print(array[i] + " ");
			array = num;
		}

		int k = 0;
		
			for (int j = 0; j < array.length; j++) {
				contador = 0;
				if (array[k++] == num[j]) {
					contador++;
				}
				System.out.println();
				System.out.println(array[j] + " se repite en el array " + contador + " veces");
			}
			
	}
}
