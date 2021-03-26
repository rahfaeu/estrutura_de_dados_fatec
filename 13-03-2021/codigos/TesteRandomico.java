import java.util.Random;

public class TesteRandomico {
    public static void main(String[] args) {
        System.out.println(Math.random());

        Random r = new Random();
        // int n = r.nextInt();

        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(100));

    }
}
