public class hollowRectangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {        // rows
            for (int j = 0; j < 5; j++) {    // columns
                if (i == 0 || j == 0 || i == 4 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // 2 spaces
                }
            }
            System.out.println();
        }
    }
}
