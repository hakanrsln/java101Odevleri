import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("====== Mayin Tarlasi ======");
        System.out.print("Mayin Tarlasi Satir: ");
        int girilenSatir = input.nextInt();
        System.out.print("Mayin Tarlasi Sutun: ");
        int girilenSutun = input.nextInt();

        String[][] tarla = new String[girilenSatir][girilenSutun];
        for (int i = 0; i < girilenSatir; i++) {
            for (int j = 0; j < girilenSutun; j++) {
                tarla[i][j] = "-";
            }
        }

        int mayinSayisi = (girilenSatir * girilenSutun) / 4;
        int yerlestirilenMayin = 0;

        while (yerlestirilenMayin < mayinSayisi) {
            int mayinSatir = random.nextInt(girilenSatir);
            int mayinSutun = random.nextInt(girilenSutun);

            if (!tarla[mayinSatir][mayinSutun].equals("M")) {
                tarla[mayinSatir][mayinSutun] = "M";
                yerlestirilenMayin++;
            }
        }

        String[][] oyunTahtasi = new String[girilenSatir][girilenSutun];
        for (int i = 0; i < girilenSatir; i++) {
            for (int j = 0; j < girilenSutun; j++) {
                oyunTahtasi[i][j] = "-";
            }
        }

        while (true) {
            // Oyun tahtasını göster
            oyunTahtasiniGoster(oyunTahtasi);

            System.out.print("Satir Girin (0-" + (girilenSatir - 1) + "): ");
            int satir = input.nextInt();
            System.out.print("Sutun Girin (0-" + (girilenSutun - 1) + "): ");
            int sutun = input.nextInt();

            if (satir < 0 || satir >= girilenSatir || sutun < 0 || sutun >= girilenSutun) {
                System.out.println("Geçersiz koordinatlar. Lütfen tekrar deneyin.");
                continue;
            }

            if (tarla[satir][sutun].equals("M")) {
                System.out.println("Mayina Bastiniz! Oyun Bitti.");
                oyunTahtasiniGoster(tarla); // Mayınları göster
                break;
            } else {
                int komsuMayinSayisi = komsuMayinSayisi(tarla, satir, sutun);
                oyunTahtasi[satir][sutun] = String.valueOf(komsuMayinSayisi);
            }

            if (oyunBittiMi(oyunTahtasi)) {
                System.out.println("Tebrikler! Oyunu Kazandiniz.");
                oyunTahtasiniGoster(tarla); // Mayınları göster
                break;
            }
        }
    }

    private static void oyunTahtasiniGoster(String[][] tarla) {
        for (String[] row : tarla) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static int komsuMayinSayisi(String[][] tarla, int row, int column) {
        int count = 0;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = row + dx[i];
            int newColumn = column + dy[i];
            if (newRow >= 0 && newRow < tarla.length && newColumn >= 0 && newColumn < tarla[0].length) {
                if (tarla[newRow][newColumn].equals("M")) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean oyunBittiMi(String[][] oyunTahtasi) {
        for (String[] row : oyunTahtasi) {
            for (String cell : row) {
                if (cell.equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
}
