//Manipulando strings em java com StringBuilder
import java.util.Scanner;

public class Reverse {
    public static String AoContrario(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String input = sc.nextLine();

        while(input.length() == 0){
            System.out.println("Digite uma palavra valida:");
            input = sc.nextLine();
        }

        System.out.println(AoContrario(input));
    }
}