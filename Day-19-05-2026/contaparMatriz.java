public class contaparMatriz {

    public static int contaP(int[][] numeros) {
        if(numeros == null) return 0;
        int contaPar = 0;

        for (int[] linha : numeros) {
            if (linha != null) {
                for (int num : linha){
                    if (num % 2 == 0) {
                        contaPar++;
                    }
                }
            }
        }

        return contaPar;
    }
    public static void main(String[] args) {
        int[][] matriz ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int teste = contaP(matriz);
        System.out.println(teste);
    }
    
}
