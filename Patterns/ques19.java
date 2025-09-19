// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
public class ques19 {
        public static void main(String[] args) {
        int spaces = 0;

        // upper half
        for (int i = 5; i >= 1; i--) {
            // stars
            for (int j = 0; j < i; j++) System.out.print("*");
            // spaces
            for (int j = 0; j < spaces; j++) System.out.print(" ");
            // stars
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
            spaces += 2;
        }

        // lower half
        spaces = 2 * 5 - 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            for (int j = 0; j < spaces; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
            spaces -= 2;
        }
    }
}


