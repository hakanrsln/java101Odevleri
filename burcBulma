import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day, month;
        boolean isError = false;

        System.out.print("Dogum gununu giriniz: ");
        day = input.nextInt();

        System.out.print("Dogum Ayini giriniz: ");
        month = input.nextInt();

        if (month > 12) {
            System.out.println("Gecersiz Ay Girdiniz! Tekrar deneyin");
            System.out.print("Dogum Ayini giriniz: ");
            month = input.nextInt();

        }

        if (month == 1 && (day <= 21 && day > 0)) {
            System.out.println("Burcunuz:Oglak");
        } else if (month == 1 && (day > 21 && day <= 31)) {
            System.out.println("Burcunuz:Kova");
        } else if (month == 1 && day > 31) {
            isError = true;
        }

        if (month == 2 && (day <= 19 && day > 0)) {
            System.out.println("Burcunuz:Kova");
        } else if (month == 2 && (day > 19 && day <= 28)) {
            System.out.println("Burcunuz:Balik");
        } else if (month == 2 && day > 28) {
            isError = true;
        }

        if (month == 3 && (day <= 20 && day > 0)) {
            System.out.println("Burcunuz:Balik");
        } else if (month == 3 && (day > 20 && day <= 31)) {
            System.out.println("Burcunuz:Koc");
        } else if (month == 3 && day > 31) {
            isError = true;
        }

        if (month == 4 && (day <= 20 && day > 0)) {
            System.out.println("Burcunuz:Koc");
        } else if (month == 4 && (day > 20 && day <= 30)) {
            System.out.println("Burcunuz:Boga");
        } else if (month == 4 && day > 30) {
            isError = true;
        }

        if (month == 5 && (day <= 21 && day > 0)) {
            System.out.println("Burcunuz:Boga");
        } else if (month == 5 && (day > 21 && day <= 31)) {
            System.out.println("Burcunuz:Ikizler");
        } else if (month == 5 && day > 31) {
            isError = true;
        }

        if (month == 6 && (day <= 22 && day > 0)) {
            System.out.println("Burcunuz:ikizler");
        } else if (month == 6 && (day > 22 && day <= 30)) {
            System.out.println("Burcunuz:Yengec");
        } else if (month == 6 && day > 30) {
            isError = true;
        }

        if (month == 7 && (day <= 22 && day > 0)) {
            System.out.println("Burcunuz:Yengec");
        } else if (month == 1 && (day > 22 && day <= 31)) {
            System.out.println("Burcunuz:Aslan");
        } else if (month == 1 && day > 31) {
            isError = true;
        }
        if (month == 8 && (day <= 22 && day > 0)) {
            System.out.println("Burcunuz:Aslan");
        } else if (month == 8 && (day > 22 && day <= 31)) {
            System.out.println("Burcunuz:Basak");
        } else if (month == 8 && day > 31) {
            isError = true;
        }
        if (month == 9 && (day <= 22 && day > 0)) {
            System.out.println("Burcunuz:Basak");
        } else if (month == 9 && (day > 22 && day <= 30)) {
            System.out.println("Burcunuz:Terazi");
        } else if (month == 9 && day > 30) {
            isError = true;
        }
        if (month == 10 && (day <= 22 && day > 0)) {
            System.out.println("Burcunuz:Terazi");
        } else if (month == 10 && (day > 22 && day <= 31)) {
            System.out.println("Burcunuz:Akrep");
        } else if (month == 10 && day > 31) {
            isError = true;
        }
        if (month == 11 && (day <= 21 && day > 0)) {
            System.out.println("Burcunuz:Akrep");
        } else if (month == 11 && (day > 21 && day <= 30)) {
            System.out.println("Burcunuz:Yay");
        } else if (month == 11 && day > 30) {
            isError = true;
        }
        if (month == 12 && (day <= 21 && day > 0)) {
            System.out.println("Burcunuz:Yay");
        } else if (month == 1 && (day > 21 && day <= 31)) {
            System.out.println("Burcunuz:Oglak");
        } else if (month == 1 && day > 31) {
            isError = true;
        }

        if (isError) {
            System.out.println("Gunu gecersiz girdiniz. tekrar deneyin!");
        }

    }
}
