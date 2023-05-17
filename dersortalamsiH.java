import java.util.Scanner;

public class dersOrtalamsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};

        System.out.println("Lütfen beş dersin notunu girin:");

        double toplam = 0;
        int sayac = 0;

        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " notu: ");
            double not = scanner.nextDouble();

            if (not >= 0 && not <= 100) {
                toplam += not;
                sayac++;
            } else {
                System.out.println("Hatalı not! 0 ile 100 arasında olmalı.");
                i--; // hatalı notlar için sayaç geri alınır
            }
        }

        double ortalama = 0;
        if (sayac > 0) {
            ortalama = toplam / sayac;
            System.out.println("Ortalama: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Tebrikler, geçtiniz!");
            } else {
                System.out.println("Maalesef, kaldınız.");
            }
        } else {
            System.out.println("Hiç geçerli not girilmedi.");
        }
    }
}
