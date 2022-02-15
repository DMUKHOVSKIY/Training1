public class Exercise1 {
    public static void main(String[] ags) {
        double km = 10; //first day
        for (int i = 0; i < 6; i++)
            km = km + (km * 10 / 100);
        System.out.println(km);
    }
}
