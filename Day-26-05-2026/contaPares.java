// Codigo para contar pares dentro de uma matriz
public class contaPares {
    public static int contaP(int[][] matriz) {
        if(matriz == null || matriz.length == 0 || matriz[0].length == 0) throw new IllegalArgumentException("A matriz não pode ser vazia ou nula.");
        int contaPar = 0;
        
        for (int[] linha : matriz) {
            for (int num : linha) {
                if(num % 2 == 0) contaPar++;
            }
        }
        return contaPar;
    }
    public static void main(String[] args) {
        int[][] numeros = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        int teste = contaP(numeros);
        System.out.println(teste);
    }
}
