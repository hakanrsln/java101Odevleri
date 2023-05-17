package donguler;

public class asalSayilar {
    public static void main(String[] args) {

        int num = 100;


        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.println(i+ "");
            }

        }

       


        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        //asal sayilar 1 ve kendisinden baska boleni olmayan sayilar--- %
    }
}
