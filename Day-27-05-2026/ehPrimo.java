public class ehPrimo {

    public static boolean primo(int n) {
        if (n <= 1) {
            return false;
        } else if (n % 2 == 0 && n != 2) {
            return false;
        } else if (n == 2) {
            return true;
        }

        for (int i = 3; i < n; i += 2){
            if (n % i == 0) {
                return false;
            }
        }
    return true;
    }

    public static void main(String[] args) {
        int n = 2;
        boolean teste = primo(n);
        System.out.println(teste);
    }
}