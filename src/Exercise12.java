import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        while (num != 0) {
            int c = num % 10;
            num = num / 10;
            sum += c;
        }
        System.out.println(sum);
    }
}
