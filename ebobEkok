package donguler;

import java.util.Scanner;

public class ebobEkokHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayı Giriniz :");
        int n1 = input.nextInt();
        System.out.print("2.Sayı Giriniz :");
        int n2 = input.nextInt();
        int ebob = 1, ekok;


        int i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = 1;
                System.out.println("Ebob:" + ebob);
                break;
            }
            i--;
        }
        int k = 1;
        while (k <= (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                System.out.println("Ekok:" + ekok);
            }
            k++;
        }


    }
}
