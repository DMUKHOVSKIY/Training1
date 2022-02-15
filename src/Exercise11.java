import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean b=true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b=false;
                break;
            }
        }
        if(b==true)
            System.out.println("Yes, " + num + " is a prime number");
        else
            System.out.println(("No, " + num + " is not a prime number"));

        //ADDITIONALLY
        /*System.out.println("Example of prime numbers:");
        for (int i = 2; i <= num; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b == true)
                System.out.println(i);
        }*/
    }
}
