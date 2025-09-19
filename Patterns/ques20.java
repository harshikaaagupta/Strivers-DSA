public class ques20 {
    public static void main(String[] args) {
        int n = 5;
        int spaces = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i > n) ? (2 * n - i) : i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }
}
