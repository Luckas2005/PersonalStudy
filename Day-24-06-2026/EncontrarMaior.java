public class EncontrarMaior {

    public static int buscaMaior(int[] nums){
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("O vetor não deve ser nulo.");
        }
        
        int maior = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maior) {
                maior = nums[i];
            }
        }
    
        return maior;
    }

    public static void main(String[] args) {
        int[] nums = {};
        int result = buscaMaior(nums);
        System.out.println(result);
    }

    
}

