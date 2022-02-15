import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n2=0;
        System.out.println(n0 + "\n" + n1);//first numbers 0, 1 and 1
        while (n2 !=610) {
            n2 = n0 + n1;
            System.out.println(n2);
            n0 = n1;
            n1 = n2;
        }

    }
}
