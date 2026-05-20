public class verificarIdentidade {

    public static boolean verificaI(int[][] numeros) {
        if(numeros == null || numeros.length == 0) return false;
        int tamanho = numeros.length;
        
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] == null || numeros[i].length != tamanho) {
            return false;
            }
            for (int j = 0; j < tamanho; j++) {
                if(i == j && numeros[i][j] != 1) {
                    return false;
                } else if ( i != j && numeros[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] numeros = {{1,2},{3,4},{5,6}};
        boolean teste = verificaI(numeros);
        System.out.println(teste);
    }
    
}
