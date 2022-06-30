import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < t; k++) {
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<Integer> a = new ArrayList<>();
            int max = -1;  // Максимальное число конфет любого вида
            int pmax = -1;  // Максимальное число конфет любого вида
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
                if (a.get(i) > max) {
                    max = a.get(i);
                }
                if (a.get(i) > pmax && a.get(i) != max) {
                    pmax = a.get(i);
                }
            }
            if (a.size() == 1 && a.get(0) == 1) {
                System.out.println("YES");
            }  else if (max - 1 > pmax) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}