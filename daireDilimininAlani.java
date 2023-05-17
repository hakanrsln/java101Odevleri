import java.util.Scanner;
public class daireDilimininAlani {
    public static void main(String[] args) {
        /* Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360*/

        int radius, centralAngle;
        double pi=3.14, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaricapi uzunlugunu girin: ");
        radius = input.nextInt();
        System.out.println("merkez acisini girin: ");
        centralAngle = input.nextInt();


        area = (pi * (radius*radius) * centralAngle) / 360;

        System.out.println("Daire Diliminin Alanı: "+area);

    }
}
