import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a;
        a = sc.nextDouble();
        double ft = 30.48;
        double c = a * ft;
        System.out.printf("%.1f", c);

    }
}