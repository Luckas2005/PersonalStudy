public class somaMatriz {

    public static int somaM(int[][] numeros) {
        if(numeros == null) return 0;
        int soma = 0;

        //for-each
        for (int[] linha : numeros) {
        if (linha != null) { // Proteção contra linha nula
            for (int num : linha) {
                soma += num;
            }
        }
    }
        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int teste = somaM(matriz);
        System.out.println(teste);
    }
}