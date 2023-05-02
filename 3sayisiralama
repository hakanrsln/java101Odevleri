import java.util.Scanner;

public class kucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayiyi Giriniz:");
        num1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz:");
        num2 = input.nextInt();

        System.out.print("3. Sayiyi Giriniz:");
        num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            if (num2>num3){
                System.out.print("num3 <= num2 <= num1");
            } else if (num2<num3) {
                System.out.print("num2 <= num3 <= num1");
            }

        } else if (num2>num1 && num2>num3) {
            if (num1>num3){
                System.out.print("num3 <= num1 <= num2");
            } else if (num1<num3) {
                System.out.print("num1 <= num3 <= num2");
            }

        }else {
            if (num1>num2){
                System.out.print("num2 <= num1 <= num3");
            } else if (num1<num2) {
                System.out.print("num1 <= num2 <= num3");
            }
        }

    }
}
