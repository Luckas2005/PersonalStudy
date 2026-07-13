public class SelectionSort {

    public static int[] selection(int[] nums) {
        if(nums == null || nums.length <= 0) {
            throw new IllegalArgumentException("O vetor não pode estar vazio;");
        }

        for(int i = 0; i < nums.length - 1; i++) {
            int p = i;
            
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[p]) {
                    p = j;
                }   
            }
            int aux = nums[i];
            nums[i]= nums[p];
            nums[p] = aux;
        }
        
        return nums;
    }
    public static void main(String[] args) {
        int[] numeros = {1,3,2};
        int[] teste = selection(numeros);
       
        for(int i = 0; i < teste.length; i++){
            System.out.println(teste[i]);
        }
    }
    
    
}
