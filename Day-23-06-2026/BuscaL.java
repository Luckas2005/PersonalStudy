public class BuscaL {

    public static int buscaN(int[] nums, int key) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9,10};
        int key = 31;
        int teste = buscaN(numbers, key);
        System.out.println(teste);
    }

}