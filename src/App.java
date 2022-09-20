import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--Running Program--");
    }

    public static String word() {
        return "test";
    }

    public static int randnum() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(2);
        return rand_int1;
    }

    public int num() {
        int num = 3;
        return num;
    }

    public double numEquals() {
        double num = 2;
        return num;
    }

    public int[] numArr() {
        int[] arr = { 5, 2, 7, 9 };
        return arr;
    }
}
