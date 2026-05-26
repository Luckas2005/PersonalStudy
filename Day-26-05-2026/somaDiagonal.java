// Codigo para somar as diagonais de uma matriz quadrada.
public class somaDiagonal{

    public static int somaD(int[][] matriz) {
        if(matriz == null) throw new IllegalArgumentException("A matriz não pode ser nula.");
        int soma = 0;

        int tamanho = matriz.length;

        for(int i = 0; i < tamanho; i++) {
            if(matriz[i].length != tamanho) throw new IllegalArgumentException("A matriz deve ser quadrada");
            soma += matriz[i][i];
        }
        return soma;
    }
    public static void main(String[] args) {
        int[][] numeros = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        int teste = somaD(numeros);
        System.out.println(teste);
    }
}