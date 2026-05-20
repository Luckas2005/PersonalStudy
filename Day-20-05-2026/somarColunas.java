public class somarColunas {

    public static void somaColunas(int[][] numeros) {
        if (numeros == null || numeros.length == 0)
            return;

        int tamanho = numeros.length;


        for (int i = 0; i < tamanho; i++) {
            int somaC = 0;

            for (int j = 0; j < tamanho; j++) {
                if (numeros[j] != null && i < numeros[j].length) {
                    somaC += numeros[j][i];
                }
            }

            System.out.println("Coluna: " + i + " = " + somaC);
        }
    }
    public static void main(String[] args) {
        int[][] numeros = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        somaColunas(numeros);
    }
    
}
