public class ques17 {
    public static void main(String[] args) {
        for(int i = 1;i<=4;i++){
            for(int s = 1;s<=4-i;s++){
                System.out.print(" ");
            }
            char c ='A';
            for(int j = 1 ;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            c -= 2;
            for(int j = 1;j<i;j++){
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
    }
}
