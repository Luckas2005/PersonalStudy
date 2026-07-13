public class VerificaOrdem {

    public static boolean verificador(int[] numeros) {
        if(numeros == null || numeros.length < 1) throw new IllegalArgumentException("O vetor está vazio.");
        if(numeros.length == 1) return true;
        
        
        boolean verificaCres = true;
        boolean verificaDecres = true;

        for(int i = 0; i < numeros.length - 1; i++) {
            if(numeros[i] < numeros[i+1]) verificaDecres = false;

            if(numeros[i] > numeros[i+1]) verificaCres = false;
            
            if(!verificaCres && !verificaDecres) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[] numeros = {8,3,52,5,34,6,435,432,654,567,546,43};
        boolean teste = verificador(numeros);

        System.out.println(teste);
    }
}