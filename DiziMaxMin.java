public class DiziMaxMin {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int inputNumber = 50; // Girilen sayıyı burada belirtin

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        for (int i : list) {
            if (i < inputNumber && inputNumber - i < inputNumber - min) {
                min = i;
            }
            if (i > inputNumber && i - inputNumber < max - inputNumber) {
                max = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);



    }
}