//Descobrir a média, o menor e o maior valor de um vetor;
public class media {

    public static void mediaMM(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        int maior = numeros[0];
        int menor = numeros[0];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            } else if (numeros[i] > maior) {
                maior = numeros[i];
            }
            soma += numeros[i];
        }
        media = soma / numeros.length;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);

    }

    public static void main(String[] args) {
        int[] numeros = {1,6,3,5};
        mediaMM(numeros);
    }
    
}
