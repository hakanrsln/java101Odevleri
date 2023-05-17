import java.util.Scanner;
public class elmasCizimi {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j<= (2 * i)-1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
                n=n-1;
        for (int i = 1; i <= n ; i++) {
            for (int k = 0; k < (i); k++) {
                System.out.print(" ");
            }
           for (int j=(2*n)-i; j>=i ; j--) {
               System.out.print("*");
            }
            System.out.println(" ");
        }




    }
}
