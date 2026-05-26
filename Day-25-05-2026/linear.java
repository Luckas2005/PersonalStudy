public class linear {

    public static int buscaL(int[] numeros, int chave) {
        if (numeros == null) return Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] == chave){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] numeros = {3,55,4,3,6,7,5,3,5,3,2,3,43,0,8,9,78,8};
        int chave = 55;
        int teste = buscaL(numeros, chave);
        System.out.println(teste);
    }
}