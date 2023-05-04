package donguler;

import java.util.Scanner;

public class kombinasyonHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Kombinasyon hesabi C(n,r):");
        System.out.println("n yi giriniz:");
        int n = scanner.nextInt();
        System.out.println("r yi giriniz:");
        int r = scanner.nextInt();
        int m = n - r;
                /*
                * Java ile kombinasyon hesaplayan program yazınız.

                     Kombinasyon formülü
                     C(n,r) = n! / (r! * (n-r)!)*/
        int rFactoriel = 1, nFactoriel = 1, mFactoriel=1, kombinasyon;

        for (int i = 1; i <= n; i++) {
            nFactoriel = nFactoriel * i;
        }
        for (int i = 1; i <= r; i++) {
            rFactoriel = rFactoriel * i;
        }
        for (int i = 1; i <= m; i++) {
            mFactoriel = mFactoriel * i;
        }

        kombinasyon= nFactoriel/(rFactoriel*mFactoriel);

        System.out.println("C("+n+", "+r+") kombinasyonu ="+kombinasyon);


    }
}
