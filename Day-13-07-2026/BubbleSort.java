public class BubbleSort {

    public static int[] bubble(int[] nums) {
        if(nums == null || nums.length <= 0) { 
            throw new IllegalArgumentException("O vetor não pode esta vazio.");
        }
        
        int aux = 0;
        
        for(int i = 0; i < nums.length; i++) {
            boolean verificaO = true;
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                    verificaO = false;
                }
            }
            if(verificaO){
                break;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] numeros = {3,2,1};
        int[] teste = bubble(numeros);
       
        for(int i = 0; i < teste.length; i++){
            System.out.println(teste[i]);
        }
    }
    
     
}
