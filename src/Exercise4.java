import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int Sum = 0;
        for (int i = 0; i < B; i++) {
            Sum += A;
        }
        System.out.println(Sum);
    }
}
