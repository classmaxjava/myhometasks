package Hometasks;

/**
 * Created by java on 07.04.16.
 */
public class Domaw4 {

    public static void main(String[] args) {
        int[][] masiv = new int[7][7];
        int[][] masiv1 = new int[7][7];
        int[][] masiv2 = new int[7][7];
        int[][] masiv3 = new int[7][7];
        int[][] masiv4 = new int[7][7];

        int a, b, c = 0;
        for (a = 0; a < masiv.length; a++) {     //цикл для заполнения ячеек столбцов а
            for (b = 0; b < masiv[0].length; b++) {
                masiv[a][b] = c;
                masiv1[a][b] = c;
                masiv2[a][b] = c;
                masiv3[a][b] = c;
                masiv4[a][b] = c;
                c = c + 5;    //будет заполнять через 5 цифр
            }
        }


        System.out.println("=====Сдвиговые операции с двумерным массивом=====");

        System.out.println("Массив [7] [7] :");
        for (a = 0; a < masiv.length; a++) {     //цикл для заполнения ячеек столбцов а
            for (b = 0; b < masiv[0].length; b++) {
                System.out.print(masiv[a][b] + "\t");
            }
            System.out.println();
        }


        System.out.println("Вправо на 4 позиции :");
        int [][]masiv5 = sdvigVpravo(masiv1, 4);
        for (a = 0; a < masiv5.length; a++) {
            for (b = 0; b < masiv5[0].length; b++) {
                System.out.print(masiv5[a][b] + "\t");
            }
            System.out.println();
        }


        System.out.println("Вниз на 2 позиции :");
        int [][]masiv6 = sdvigVniz(masiv2, 2);
        for (a = 0; a < masiv6.length; a++) {
            for (b = 0; b < masiv6[0].length; b++) {
                System.out.print(masiv6[a][b] + "\t");
            }
            System.out.println();
        }


        System.out.println("Вверх на 3 позиции :");
        int [][]masiv7 = sdvigVverh(masiv3, 3);
        for (a = 0; a < masiv7.length; a++) {
            for (b = 0; b < masiv7[0].length; b++) {
                System.out.print(masiv7[a][b] + "\t");
            }
            System.out.println();
        }


        System.out.println("Влево на 3 позиции :");
        int [][]masiv8 = sdvigVlevo(masiv4, 3);
        for (a = 0; a < masiv8.length; a++) {
            for (b = 0; b < masiv8[0].length; b++) {
                System.out.print(masiv8[a][b] + "\t");
            }
            System.out.println();
        }

        //создаем методы


    }

    public static int[][] sdvigVpravo(int[][] mas1, int d) {   //d число позиций для сдвига
        int size1 = mas1.length;
        int size2 = mas1[0].length;
        for (int a = 0; a < d; a++) {
            for (int b = 0; b < size1; b++) {
                int temp = mas1[b][0];
                for (int c = 0; c < size2 - 1; c++) {
                    mas1[b][c] = mas1[b][c + 1];
                }
                mas1[b][size2 - 1] = temp;
            }
        }
        return mas1;
    }

    public static int[][] sdvigVniz(int[][] mas1, int d) {   //d число позиций для сдвига
        int size = mas1.length;
        for (int i = 0;i < d;i++){
            int[]mas = mas1[size - 1];
            for (int j = size - 1;j > 0;j--){
                mas1[j] = mas1[j - 1];
            }
            mas1[0] = mas;
        }
        return mas1;
    }


    public static int[][] sdvigVverh(int[][] mas1, int d) {
        int size = mas1.length;
        for (int i = 0;i < d;i++){
            int[]mas = mas1[0];
            for (int j = 0;j < size - 1;j++){
                mas1[j] = mas1[j + 1];
            }
            mas1[size - 1] = mas;
        }
        return mas1;
    }

    public static int[][] sdvigVlevo(int[][] mas1, int d) {
        int size1 = mas1.length;
        int size2 = mas1[0].length;
        for (int a = 0; a < d; a++) {
            for (int b = 0; b < size1; b++) {
                int temp = mas1[b][0];
                for (int c = 0; c < size2 - 1; c++) {
                    mas1[b][c] = mas1[b][c + 1];
                }
                mas1[b][size2 - 1] = temp;
            }
        }
        return mas1;
    }
}




