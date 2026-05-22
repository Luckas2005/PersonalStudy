import java.io.IOException;
import java.util.Scanner;

public class Main4 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Corrigido: adicionado os parênteses ()
        int N = scanner.nextInt(); 
        
        // Removido o bloco while de validação (Desnecessário no Beecrowd)
 
        int[] numeros = new int[N];
        
        for (int i = 0; i < numeros.length; i++){
            // Corrigido: adicionado os parênteses () e removido o if de validação
            numeros[i] = scanner.nextInt(); 
        }
        
        int atual = numeros[0];
        int contador = 1;
        
        for (int j = 1; j < numeros.length; j++){
            if(numeros[j] != atual) {
                contador++;
                atual = numeros[j]; // CORREÇÃO COMPORTAMENTAL: Atualiza o número atual para a próxima comparação
            }
        }
        
        // CORREÇÃO: Faltava exibir o resultado na tela
        System.out.println(contador);
    }
}

