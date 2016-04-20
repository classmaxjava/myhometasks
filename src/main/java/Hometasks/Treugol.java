package Hometasks;

/**
 * Created by java on 15.04.16.
 */
public class Treugol {

    public static void main(String[] args) {
        int i, j;

        for(i=0;i<10;i++) {
            for(j=i;j<10;j++)
                System.out.print("8");
            System.out.println();

        }
        for(i=10;i>=0;i--) {
            for (j = i; j < 10; j++)
                System.out.print("8");
            System.out.println();
        }
        //for(i=0;i<10;i++) {
         //   for (j = 0; j < 10; j++)
         //       System.out.print("8");
        //    System.out.println();
        //}
    }
}
