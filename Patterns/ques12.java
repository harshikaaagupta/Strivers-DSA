// 1      1
// 12    21
// 123  321
// 12344321
public class ques12 {
    public static void main(String[] args) {
        for(int i  = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int s = 1;s<=(4-i)*2;s++){
                System.out.print(" ");
            }
            for(int j = i ;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
