public class Exercise8 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < i; k++)
                System.out.print(" ");
            for (int j = i; j < 3; j++)
                System.out.print("*");

            System.out.print("\n");
        }

    }
}
