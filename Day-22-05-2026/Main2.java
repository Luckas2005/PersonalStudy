import java.io.IOException;
import java.util.Scanner;

public class Main2 {
 
    public static void main(String[] args) throws IOException {
 
       // LINHA CORRIGIDA:
       Scanner scanner = new Scanner(System.in);
       
       int T = scanner.nextInt();
       
       T = T * 2 * 2; // Multiplica o valor por 4
       
       System.out.println(T);
 
    }
}