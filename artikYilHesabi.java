import java.util.Scanner;


public class artikYilHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, mod, mod2, mod3;

        System.out.print("Yili giriniz:");
        year = input.nextInt();
        mod = year % 4;
        mod2 = year % 100;
        mod3 = year % 400;


        if (mod != 0) {
            System.out.println("Artik Yil DEGILDIR!");
        } else if (mod == 0) {
            if (mod2 != 0) {
                System.out.println("Artik Yildir!");

            } else if (mod2 == 0 && mod3 == 0) {
                System.out.println("Artik Yildir!");
            } else {
                System.out.println("Artik Yil DEGILDIR!");
            }


        }
    }
}
