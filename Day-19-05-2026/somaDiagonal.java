public class somaDiagonal {

    public static int somaD(int[][] numeros) {
        if (numeros == null || numeros.length == 0)
            return Integer.MIN_VALUE;
        int somaDiagonal = 0;
        int tamanho = numeros.length;

        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] == null || numeros[i].length != tamanho) {
                return Integer.MIN_VALUE;
            }
            somaDiagonal += numeros[i][i];
        }
        return somaDiagonal;
    }

    public static void main(String[] args) {
        int[][] matriz ={{1,2,3},
                         {4,2,6},
                         {7,8,9}};
        int teste = somaD(matriz);
        System.out.println(teste);
    }
    
}
