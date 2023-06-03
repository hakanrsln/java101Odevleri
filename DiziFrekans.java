public class DiziFrekans {
    public static void main(String[] args) {
        int[] list = {4, 11, 2, 35, -58, 4, 2, 11, 2, 35, 1, 2, 1};

        int[] frekans = new int[list.length]; // frekansları tutmak için yeni bir dizi oluşturulur

        for (int i = 0; i < list.length; i++) {
            if (frekans[i] == 0) {
                int sayac = 1;
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        sayac++;
                        frekans[j] = -1;
                    }
                }
                frekans[i] = sayac;
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (frekans[i] > 0) {
                System.out.println(list[i] + " sayısı " + frekans[i] + " kez tekrar eder.");
            }
        }
    }
}
