public class maiorElemento {
    public static int maiorE(int[][] numeros) {
        if (numeros == null || numeros.length == 0) return Integer.MIN_VALUE; 
        
        int maior = Integer.MIN_VALUE;
        boolean encrontraElemento= false;

        for (int[] linha : numeros) {
            if (linha != null) {
                for (int num : linha) {
                    if(!encrontraElemento) {
                        maior = num;
                        encrontraElemento = true;
                    } else if (num > maior) {
                        maior = num;
                    }
                }
            }
            
        }
        return maior;
    }

    public static void main(String[] args) {
        int[][] matriz ={{10,2,3},
                         {4,5,6},
                         {7,8,9}};
        int teste = maiorE(matriz);
        System.out.println(teste);
    }
    
}
