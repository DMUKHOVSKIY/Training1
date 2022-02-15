public class Exercise3 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 1;
        while (a != 256) {
            a *= 2;
            sum += a;
        }
        System.out.println(sum);
    }
}
