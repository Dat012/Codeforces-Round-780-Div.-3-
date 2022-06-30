import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = 0;
        int b = 0;
        int s = 0;
        for (int i = 0; i < c; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            s = 0;
            if (a != 0) {
                s = a + b * 2;
            }
            System.out.println(s + 1);
        }
    }
}