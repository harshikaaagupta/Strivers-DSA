import java.util.*;
//List of Elements of the same type placed in contiguous memory location.
public class array {
    public static void main(String args[]){
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] =sc.nextInt();
        marks[1] =sc.nextInt();
        marks[2] =sc.nextInt();

        System.out.println("marks 1 :"+marks[0]);
        System.out.println("marks 2 :"+marks[1]);
        System.out.println("marks 3 :"+marks[2]);
    }
    
}
