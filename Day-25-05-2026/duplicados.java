public class duplicados {

    public static int removeD(int[] numeros) {
       int menorIndice = 0;
       int aux = 0;

        for (int i = 0; i < numeros.length; i++) {
            menorIndice = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if(numeros[j] < numeros[menorIndice]) {
                    menorIndice = j;
                }
            }
            aux = numeros[menorIndice];
            numeros[menorIndice] = numeros[i];
            numeros[i] = aux;
        }

        int escritor = 0; // O "Escritor" (i) começa no primeiro elemento

        // O "Explorador" (j) varre o resto do vetor
        for (int explorador = 1; explorador < numeros.length; explorador++) {
            // Se encontramos um número diferente do último único gravado...
            if (numeros[explorador] != numeros[escritor]) {
                escritor++;                    // Abrimos espaço na próxima vaga da frente
                numeros[escritor] = numeros[explorador]; // Gravamos o número novo ali
            }
        }
        return escritor;
        
    }
    public static void main(String[] args) {
        int[] numeros = { 3, 55, 4, 3, 6, 7, 5, 3, 5, 3, 2, 3, 43, 0, 8, 9, 78, 8 };
        int teste = removeD(numeros);
        for (int i = 0; i <= teste; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
