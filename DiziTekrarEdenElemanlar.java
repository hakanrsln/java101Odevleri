import java.util.Arrays;

public class DiziTekrarEdenElemanlar {
    static boolean isFound(int[] arr, int value) {
        for (int eleman:arr
             ) {
            if (eleman==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {4, 11,2, 35, -58, 4, 11, 2, 35};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFound(dublicate,list[i])){
                        dublicate[startIndex++] = list[i];
                        break;
                    }


                }
            }
        }
        for (int eleman:dublicate
             ) {
            if (eleman!=0){
                System.out.println(eleman);
            }
        }

    }
}
