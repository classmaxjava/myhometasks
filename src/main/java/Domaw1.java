import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by java
 */
public class Domaw1 {
    public static void main(String[] args) throws Exception {

        double Pi = 3.14;
        System.out.println("Выберите операцию, которую хотите сделать:  \n Расчет площади поверхности тороида '1' \n Расчет объёма тороида '2' \n Введите 1 или 2 и нажмите Enter  ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //вызов консольного ввода

        String vvod = reader.readLine();     //ввод 1 строки .считывание

        int wwod = Integer.parseInt(vvod);     //перевод string  в int

        //создание меню

        switch (wwod) {
            case 1:   //S=4*(Pi*Pi)*R*r
                System.out.println("Вы выбрали расчет поверхности тороида \n Введите внутренний и внешний радиус :");
                String case1 = reader.readLine();  //внутренний радиус
                int kase1 = Integer.parseInt(case1);  //перевод стринт в инт
                String case2 = reader.readLine();  //внешний радиус
                int kase2 = Integer.parseInt(case2); //стринг в инт

                double S = 4 * (Pi * Pi) * kase2 * kase1;

                System.out.println("Площадь поверхности тороида при внутреннем радиусе " + kase1 + " см и внешнем " + kase2 + " см : \n" + S + " см2");
                break;

            case 2:   //присваивание действия цифре 2  V=2* (Pi*Pi)*hase2*(hase1*hase1)

                System.out.println("Вы выбрали расчет объёма тороида \n Введите внутренний и внешний радиус : ");

                String sase1 = reader.readLine();  //внутренний радиус
                int hase1 = Integer.parseInt(sase1);  //стринг в инт
                String sase2 = reader.readLine();
                int hase2 = Integer.parseInt(sase2);

                double V = 2 * (Pi * Pi) * hase2 * (hase1 * hase1);

                System.out.println("Объём тороида при внутреннем радиусе " + hase1 + " см и внешнем " + hase2 + " см :\n" + V + " см3");

                break;
            default:    //если ни один из кейсов не совпал
                System.out.println("Неправильный ввод!!!\n Прочтите снова что вообще требуется для расчета ....");
        }
    }

}