import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
         
        //Lendo o T
        int T = scanner.nextInt();
        
        // Criando o array para armazenar A,B,C,D,E
        int[] numeros = new int[5];
        
        //Lendo a,b,c,d,e
        for(int i = 0; i <  numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        // Verificando se algum valor bate com a chave T
        int contador = 0;
        for(int j = 0; j <  numeros.length; j++) {
            if (numeros[j] == T){
                contador++;
            }
        }
        System.out.println(contador);
    }
 
}