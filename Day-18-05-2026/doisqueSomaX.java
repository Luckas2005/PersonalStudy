import java.util.Arrays;

public class doisqueSomaX {

public static void doisX(int[] numeros, int x) {
    // 1. Validação de segurança
    if (numeros == null || numeros.length < 2) return;

    // 2. Ordena o vetor
    Arrays.sort(numeros);

    // 3. Inicializa os ponteiros nas extremidades
    int esquerda = 0;
    int direita = numeros.length - 1;

    // 4. Move os ponteiros em direção ao centro
    while (esquerda < direita) {
        int somaAtual = numeros[esquerda] + numeros[direita];

        if (somaAtual == x) {
            System.out.println(numeros[esquerda] + " + " + numeros[direita] + " = " + x);
            esquerda++;
            direita--;
        } else if (somaAtual < x) {
            esquerda++; // Se a soma está baixa
        } else {
            direita--;  // Se a soma está alta
        }
    }
}

    public static void main(String[] args) {
         int[] numeros = {12,4,1,2,41,24,53,51,6,5432,1,643,152};
        int chave = 16;
        doisX(numeros, chave);
    }
}