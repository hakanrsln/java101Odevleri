import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        n1 = input.nextInt();

        System.out.print("Sayi Giriniz :");
        n2 = input.nextInt();

        System.out.print("1-Toplama, 2-Cikarma, 3-Carpma, 4-Bolme. Lutfen islem Secin:");
        select = input.nextInt();

        switch(select) {
            case 1:
                System.out.print("Sonuc :"+(n1+n2));

                break;
            case 2:
                System.out.print("Sonuc :"+(n1-n2));
                break;
            case 3:
                System.out.print("Sonuc :"+(n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.print("Bir sayiyi sifir ile bolunemez.Tekrar deneyin!");
                        break;
                    default:
                        System.out.print("Sonuc :"+(n1/n2));
                }

                break;

            default:
                System.out.print("Gecersiz islem secimi.Tekrar deneyin!");
        }
    }
}
