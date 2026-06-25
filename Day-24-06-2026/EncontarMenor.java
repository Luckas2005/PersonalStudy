public class EncontarMenor {

    public static int buscaMenor(int[] nums){
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("O vetor não deve ser nulo.");
        }
        
        int menor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < menor) {
                menor = nums[i];
            }
        }
    
        return menor;
    }

    public static void main(String[] args) {
        int[] nums = {2};
        int result = buscaMenor(nums);
        System.out.println(result);
    }

    
}
