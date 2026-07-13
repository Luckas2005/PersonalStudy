//Codigo feito inteiramente com ia para aprendizado!
import java.util.HashMap;
import java.util.Map;

public class DoisSomamX {

    public static int[] twoSum(int[] nums, int target) {
        // 1. Criamos o mapa: a CHAVE será o número e o VALOR será o índice dele
        Map<Integer, Integer> mapa = new HashMap<>();
        
        // 2. Passamos pelo vetor apenas UMA vez
        for (int i = 0; i < nums.length; i++) {
            int numeroAtual = nums[i];
            
            // 3. Calculamos o complemento (o que falta para chegar no alvo)
            int complemento = target - numeroAtual;
            
            // 4. Perguntamos ao mapa: "Você já viu esse complemento antes?"
            if (mapa.containsKey(complemento)) {
                // Se sim, achamos a dupla! 
                // Retornamos o índice do complemento (guardado no mapa) e o índice atual (i)
                return new int[] { mapa.get(complemento), i };
            }
            
            // 5. Se não encontramos o complemento, guardamos o número atual 
            // e o índice dele no mapa para as próximas rodadas
            mapa.put(numeroAtual, i);
        }
        
        // Caso o problema garanta que sempre há uma solução, esta linha raramente é atingida
        throw new IllegalArgumentException("Nenhuma combinação encontrada.");
    }


    public static void main(String[] args) {
        int[] numeros = {1,4,3,2};
        int chave = 5;
        int[] teste = twoSum(numeros, chave);
       
        for(int i = 0; i < teste.length; i++){
            System.out.println(teste[i]);
        }
    }
    
}
