public class revisao {

    public static int buscaB(int[] numeros, int chave) {
        int inicio = 0;
        int fim = numeros.length - 1;
        int meio = 0;

        while (inicio <= fim) {
            meio = inicio + ((fim - inicio) / 2);

            if(numeros[meio] == chave) {
                return meio;
            } else if (numeros[meio] < chave){
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
            
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4,5,6,7,8,9,10};
        int chave = 10;
        int teste = buscaB(numeros, chave);
        System.out.println(teste);
    }

}