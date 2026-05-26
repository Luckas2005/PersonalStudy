public class doisX {
    public static void somaX(int[] numeros, int chave) {
        if(numeros.length <= 1) { 
            System.out.println("Vetor incompatível");
            return;
        }   
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i; j < numeros.length; j++) {
                if(numeros[i] + numeros[j] == chave && i != j) {
                    System.out.println(numeros[i] + " + " + numeros[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4,5,6,7,8,9};
        int chave = 7;
        somaX(numeros, chave);
    }
    
}
