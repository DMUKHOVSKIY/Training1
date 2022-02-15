import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int i=1; i<=number; i++){
            if(number%i==0)
                System.out.println(i);
        }

    }

}
