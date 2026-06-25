public class RemoveDuplicados {

    public static int removeDuplicados(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("The vector cannot be null.");
        }
        
        int writer = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[writer] = nums[i];
                
                writer++; 
            } 
        }

        return writer;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,2,2,2,2,2,2,2,2,2,2,3,5};
        int result = removeDuplicados(numbers);
        System.out.println(result);
        for(int i = 0; i < result; i++) {
            System.out.println(numbers[i]);
        }
    }
}
