public class ContarPares {
    
   public static int contaPar(int[] nums){
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int pares = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                pares++;
            }
        }
    
        return pares;
    }

    public static void main(String[] args) {
        int[] nums = {};
        int result = contaPar(nums);
        System.out.println(result);
    }

    
}

