//Código para buscar e retornar o maior elemento de uma matriz;
public class maior {
    
    public static int buscaM(int[][] matriz) {
        if(matriz == null || matriz.length == 0) throw new IllegalArgumentException("A matriz não pode ser nula ou vazia.");
    
        int maior = Integer.MIN_VALUE;
        boolean encontrouElemento = false;
        for (int[] linhas : matriz) {
            for (int num : linhas) {
                encontrouElemento = true;
                if(num > maior) maior = num;
            }
        }
        if(maior == Integer.MIN_VALUE && !encontrouElemento) throw new IllegalArgumentException("A matriz não pode estar vazia.");
        return maior;
    }
    public static void main(String[] args) {
        int[][] numeros = {{Integer.MIN_VALUE}};
        int teste = buscaM(numeros);
        System.out.println(teste);
    }
}

