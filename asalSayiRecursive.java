package metotlar;
import java.util.Scanner;

public class asalSayiRecursive {

   static boolean asalMi(int sayi, int kontrol) {
        if (kontrol == 1) {
            return true;
        }
        if (sayi % kontrol == 0) {
            return false;
        }
        return asalMi(sayi, kontrol - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        boolean sonuc = asalMi(sayi, sayi-1);
        if (sonuc) {
            System.out.println(sayi + " asaldir.");
        } else {
            System.out.println(sayi + " asal degildir.");
        }

    }
}
