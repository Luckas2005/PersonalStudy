public class BuscaB {

    public static boolean checkOrder(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("The vector cannot be null.");
        }
        
        if(nums.length <= 1) { 
            return true;
        }
        
        boolean ascending = true;
        boolean descending = true;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) ascending = false;
            if (nums[i] < nums[i + 1]) descending = false;
        }
        
        return ascending || descending;
    }
    public static int binarySearch(int[] nums, int key) {
        if (nums == null) {
            throw new IllegalArgumentException("The vector cannot be null.");
        }

        if(nums.length == 0) {
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;
        boolean ascending = nums[start] <= nums[end];
        
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] == key) return mid;

            if (ascending){
                if (nums[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] < key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,11,13,15,17,19};
        int key = 17;

        if(checkOrder(numbers)){
            int result = binarySearch(numbers, key);

            if (result != -1) {
            System.out.println("Element found in the index: " + result);
            } else {
                System.out.println("Element not found!");
            }
        } else {
            throw new IllegalArgumentException("The vector is not sorted.");
        }
    }
    
}
