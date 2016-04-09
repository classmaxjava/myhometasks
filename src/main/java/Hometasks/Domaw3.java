package Hometasks;

import java.util.Arrays;

/**
 * Created by java
 */
public class Domaw3 {
    public static void main(String[] args) {

        int []masiv = {1,2,3,4,5,6,7,8,9,10};  //создаем массив
        int masiv1[] = new int[masiv.length];
        System.arraycopy(masiv,0,masiv1,0,masiv.length);
        System.out.println(Arrays.toString(masiv));
        int h = 3;
        System.out.println("Влево на " + h);
        sdvigVpravo(masiv,h);
        sdvigVlevo(masiv1,h);
        System.out.println(Arrays.toString(masiv1));
        System.out.println("Вправо на " + h);


        for (int u = 0; u < masiv.length;u++){
            System.out.print(masiv[u]+"\t");
        }
    }

    public static void sdvigVpravo(int []mas1, int d) {   //d число позиций для сдвига
        int razmer = mas1.length;                   //размер массива мас1
        for (int a = 0; a < d; a++) {              //создаем цикл
            int temp = mas1[razmer - 1];        //создаем переменную хранящую последнюю ячейку массива
            for (int k = razmer - 1; k > 0; k--) {
                mas1[k] = mas1[k - 1];
            }
            mas1[0] = temp;
        }
    }

    public static void sdvigVlevo(int []mas1, int d) {   //d число позиций для сдвига
        int razmer = mas1.length;                         //размер массива мас1
        for (int a = 0; a < d; a++) {                    //создаем цикл
            int temp = mas1[0];                     //создаем переменную хранящую первую ячейку массива
            for (int k = 0; k < razmer - 1; k++) {
                mas1[k] = mas1[k + 1];
            }
            mas1[razmer - 1] = temp;

        }
    }
}
