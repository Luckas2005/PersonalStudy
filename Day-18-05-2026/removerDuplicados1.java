public class removerDuplicados1 {

    public static int removeDuplicados(int[] numeros) {
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

         int escritor = 0; // O "Escritor" (i) começa no primeiro elemento

        // O "Explorador" (j) varre o resto do vetor
        for (int explorador = 1; explorador < numeros.length; explorador++) {
            // Se encontramos um número diferente do último único gravado...
            if (numeros[explorador] != numeros[escritor]) {
                escritor++;                    // Abrimos espaço na próxima vaga da frente
                numeros[escritor] = numeros[explorador]; // Gravamos o número novo ali
            }
        }

    // O novo tamanho de elementos únicos será i + 1
    return escritor + 1;

    }
}
    
    
