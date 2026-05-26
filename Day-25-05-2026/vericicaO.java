public class vericicaO {

    public static boolean verifica(int[] numeros) {
        if(numeros == null) return false;
        boolean ordenadoCres = true;
        boolean ordenadoDecres = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if(numeros[i] > numeros[i + 1]) ordenadoCres = false;
            if(numeros[i] < numeros[i + 1]) ordenadoDecres = false;

            if(!ordenadoCres && !ordenadoDecres) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numeros = {};
        boolean teste = verifica(numeros);
        System.out.println(teste);
       
    }
}
    
