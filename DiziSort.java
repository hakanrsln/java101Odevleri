
import java.util.Arrays;
import java.util.Scanner;

public class DiziSort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Dizi boyutunu giriniz:");
        int boyut=input.nextInt();

        int[] dizi=new int[boyut];

        System.out.println("Dizi elemanlarini giriniz:");
        for (int i=0;i<boyut;i++){
            System.out.println("Eleman "+(i+1)+": ");
            dizi[i]=input.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println("Siralanmis dizi:");
        for (int eleman:dizi){
            System.out.println(eleman + " ");
        }

    }
}
