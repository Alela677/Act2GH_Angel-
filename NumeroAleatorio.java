package Tema2;

public class NumeroAleatorio {

	public static void main(String[] args) {
		int[] array = new int [30];
		int[] aux;
		int contador;
		
		array = aux;


		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*30);
				contador = 0;
				for (int j = 0; j < aux.length; j++) {
					if(array[i] = aux[j]){
						contador++;
					}
					
				}
				System.out.println(array[i] + " se repite " + contador);
		}
		
	}

}
