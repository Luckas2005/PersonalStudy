public class mmm {

    public static void analisaVetor(int[] numeros) {
        if(numeros == null) return;
        double soma = 0;
        double media = 0;
        int menor = numeros[0];
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) maior = numeros[i];
            if (numeros[i] < menor) menor = numeros[i];
            soma += numeros[i];
        }
        media = soma / numeros.length;
        System.out.println("Maior: " + maior + " Menor: " + menor + " Média: " + media);
    }
    
    public static void main(String[] args) {
        int[] numeros = {3,55,4,3,6,7,5,3,5,3,-2,3,43,0,8,9,78,8};
        analisaVetor(numeros);
    }
}
