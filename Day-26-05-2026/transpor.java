// Código para transpor uma matriz retangular
public class transpor {

    public static int[][] transpoeM(int[][] numeros) {
        if (numeros == null || numeros.length == 0) return new int[0][0];
        int linhas = numeros.length;

        int colunas = 0;
        for (int[] linha : numeros) {
            if (linha != null && linha.length > colunas) {
                colunas = linha.length;
            }
        }

        int[][] matrizT = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++) {
                if (numeros[i] != null && j < numeros[i].length) {
                    matrizT[j][i] = numeros[i][j];
                }
            }
        }
        return matrizT;
    }

    public static void main(String[] args) {
        int[][] numeros = {{1,2,3},
                           {},
                           {7,8,9}};
        int[][] teste = transpoeM(numeros);

        for (int i = 0; i < teste.length; i++){
            for (int j = 0; j < teste[0].length; j++)
            System.out.println(teste[i][j]);
        }
    }
    
}
