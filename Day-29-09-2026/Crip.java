import java.util.Scanner;
import java.util.Random;

public class Crip{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        StringBuilder textoCriptografado = new StringBuilder();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz"; 
        
        System.out.print("Digite a palavra para criptografar: ");
        String palavra = scanner.nextLine();

        int chave = random.nextInt(50) + 1;

        for (int i = 0; i < palavra.length(); i++) {
            textoCriptografado.append(palavra.charAt(i));

            for (int j = 0; j < chave; j++) {
                int indiceSorteado = random.nextInt(26);
                textoCriptografado.append(alfabeto.charAt(indiceSorteado));
            }
        }

        textoCriptografado.append("#").append(chave);

        System.out.println("Resultado: " + textoCriptografado.toString());
        
        scanner.close();
    }
}