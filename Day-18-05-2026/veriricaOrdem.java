public class veriricaOrdem {
    
    public static boolean verificaO(int[] numeros) {
        boolean verificaCres = true;
        boolean verificaDecres = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            
            //Verificando ordenação crescente
            if(numeros[i] > numeros[i + 1]) {
                verificaCres = false;
            }
             //Verificando ordenação decrescente
            if(numeros[i] < numeros[i + 1]) {
                verificaDecres = false;
            }
            //Se ambos são falsos retorna false
            if(!verificaCres && !verificaDecres) {
                return false;
            }
        
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numeros = {10,9,8,7,23,5,4,3,2,1,0};

        boolean teste = verificaO(numeros);
        System.out.println(teste);
    }
    
}
