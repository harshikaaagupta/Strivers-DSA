public class ques18 {
    public static void main(String[] args) {
        char end = 'E';
        for (char start = end; start >= 'A'; start--) {
            for (char ch = start; ch <= end; ch++) {
                System.out.print(ch + (ch==end ? "" : " "));
            }
            System.out.println();
        }
    }
}

