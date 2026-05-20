public class selectionSort {
    public static int[] selectionS(int[] numeros) {
        int aux = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            int menorIndice = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menorIndice]) {
                    menorIndice = j;
                }
            }
            aux = numeros[i];
            numeros[i] = numeros[menorIndice];
            numeros[menorIndice] = aux;
        }
        return numeros;
    }

    public static void main(String[] args) {
        int[] numeros = {12,4,1,2,41,24,53,51,6,5432,1,643,152};

         int[] teste = selectionS(numeros);

         for (int i = 0; i < teste.length; i++){
            System.out.println(teste[i]);
         }
    }
    
}
