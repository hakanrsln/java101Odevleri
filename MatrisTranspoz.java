public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transpoz = new int[matris[1].length][matris.length];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[1].length; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        for (int row = 0; row < matris.length; row++) {

            for (int column = 0; column < matris[row].length; column++) {
                System.out.print(matris[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoz:");
        for (int row = 0; row < transpoz.length; row++) {

            for (int column = 0; column < transpoz[row].length; column++) {
                System.out.print(transpoz[row][column] + " ");
            }
            System.out.println();
        }

    }
}
