public class bubble {

    public static int[] bubbleS(int[] numeros) {
        int aux = 0;
        boolean verifica = false;

        for (int i = 0; i <numeros.length - 1; i++) {
            verifica = false;
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    verifica = true;
                }
            }
            if(!verifica) break;
        }
        return numeros;
    }

    public static void main(String[] args) {
        int[] numeros = {3,55,4,3,6,7,5,3,5,3,-2,3,43,0,8,9,78,8};
        int[] teste = bubbleS(numeros);
        for (int i = 0; i < teste.length; i++) {
            System.out.println(teste[i]);
        }
    }
    
}
