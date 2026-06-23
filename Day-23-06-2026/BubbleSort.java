public class BubbleSort {

    public static int[] BubbleS(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("The vector cannot be null.");
        }
        if(nums.length <=1) {
            return nums;
        }

        for(int i = 0; i < nums.length; i ++) {
            boolean changed = false;

            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                    changed = true;
                }
            }
            if(!changed) {
                break;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {5,3,8,4,2};
        int[] result = BubbleS(numbers);
        for (int i : result) {
            System.out.println(i);
            
        }
        }
    }

