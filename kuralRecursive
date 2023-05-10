package metotlar;

import java.util.Scanner;

public class kuralRecursive {
    static int initialN;

    public static void subtractFromN(int n) {
        if (n <= 0) {
            addToN(n);
        } else {
            System.out.println("n: " + n);
            subtractFromN(n - 5);
        }
    }

    public static void addToN(int n) {
        System.out.println("n: " + n);
        if (n == initialN) {
            return;
        } else {
            addToN(n + 5);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();
        initialN = n;
        subtractFromN(n);
    }
}
