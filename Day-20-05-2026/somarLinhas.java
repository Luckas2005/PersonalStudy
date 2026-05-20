public class somarLinhas {

    public static void somaL(int[][] numeros){
        if(numeros == null) return; 
        int somalinha = 0;
        int contaLinha = 0;

        for (int[] linha : numeros) {
            somalinha = 0;
            if(linha != null){
                for (int num : linha) {
                    somalinha += num;
                }
            }
            System.out.println("Linha: " + contaLinha + " = " + somalinha);
            contaLinha++;
        }
    }


    public static void main(String[] args) {
        int[][] numeros = {};
        somaL(numeros);
    }
}