import java.util.Random;
import java.util.Scanner;

public class SayıBulmaOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);
        // int num=(int)(Math.random()*100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        System.out.println(num);
        while (right < 5) {
            System.out.println("Tahmininizi giriniz:");
            selected = input.nextInt();

            if (selected<0 || selected>99){
                System.out.println("Lutfeen 0-100 arsinda bir sayi giriniz!");
                continue;
            }


            if (selected==num){
                System.out.println("Tebrikler, dogru tahmin!:"+num);
                break;
            }else {
                right++;
                System.out.println("hatali bir sayi girdiniz!");
                if (selected>num){
                    System.out.println(selected+ "sayisi gizli sayidan buyuktur.");
                }else {
                    System.out.println(selected+ "sayisi gizli sayidan kucuktur.");
                }
                System.out.println("kalan hakki: "+(5-right));
            }


        }


        System.out.println(num);

    }
}
