public class selection {

    public static int[] slct(int[] numeros) {
        int aux = 0;

        for (int i = 0; i < numeros.length; i++) {
            int menor  = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[menor]) {
                    menor = j;
                }
            }
            aux = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = aux;
        }
        return numeros;
    }

    public static void main(String[] args) {
        int[] numeros = { 3, 55, 4, 3, 6, 7, 5, 3, 5, 3, 2, 3, 43, 0, 8, 9, 78, 8 };
        int[] teste = slct(numeros);
        for (int i = 0; i < teste.length; i++) {
            System.out.println(teste[i]);
        }
    }

}
