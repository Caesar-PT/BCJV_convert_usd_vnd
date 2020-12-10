import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD ");
        int usd = scanner.nextInt();
        int vnd;
        final int rate = 23000;
        vnd = usd * rate;
        System.out.println("VND: " + vnd);
    }
}
