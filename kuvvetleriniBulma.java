import java.util.Scanner;

public class kuvetleriBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Sinir Sayisini Giriniz:");
        int n = scanner.nextInt();
        System.out.println("4 un katlari:");
        for (int i = 1; i <= n; i = i * 4) {

            System.out.println(i);

        }
        System.out.println("5 in katlari:");
        for (int i = 1; i <= n; i = i * 5) {

            System.out.println(i);

        }


    }
}
