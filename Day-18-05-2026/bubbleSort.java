public class bubbleSort {
    public static int[] bubbleS(int[]numeros) {
        int aux = 0;
        boolean verifica = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            verifica = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if(numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    verifica = true;
                }
            }
              if (!verifica) break;
        }
        
        return numeros;
    }
    public static void main(String[] args) {
         int[] numeros = {12,4,1,2,41,24,53,51,6,5432,1,643,152};

         int[] teste = bubbleS(numeros);

         for (int i = 0; i < teste.length; i++){
            System.out.println(teste[i]);
         }
        
    }
    
}
