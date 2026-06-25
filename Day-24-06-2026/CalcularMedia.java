public class CalcularMedia {
    
   public static double calculaMedia(int[] nums){
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        double soma = 0;

        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }
    
        return soma / nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        double result = calculaMedia(nums);
        System.out.println(result);
    }

    
}
