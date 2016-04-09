package Hometasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by java
 */
public class Domaw2 {
    public static void main(String[] args) throws Exception {

            System.out.println("Введите число от 0 до 100  :");

            //вызов консольного ввода

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String vvod;   //ввод 1 числа
            vvod = reader.readLine();

            int wwod = Integer.parseInt(vvod);  //перевод стринг в инт


            //Menu

            switch (wwod) {
                // сначала кейсы от 10 до 19

                case 0: {
                    System.out.println("ноль");
                    break;
                }
                case 10: {
                    System.out.println("десять");
                    break;
                }
                case 11: {
                    System.out.println("одиннадцать");
                    break;
                }
                case 12: {
                    System.out.println("двеннадцать");
                    break;
                }
                case 13: {
                    System.out.println("триннадцать");
                    break;
                }
                case 14: {
                    System.out.println("четырнадцать");
                    break;
                }
                case 15: {
                    System.out.println("пятьнадцать");
                    break;
                }
                case 16: {
                    System.out.println("шестнадцать");
                    break;
                }
                case 17: {
                    System.out.println("семнадцать");
                    break;
                }
                case 18: {
                    System.out.println("восемнадцать");
                    break;
                }
                case 19: {
                    System.out.println("девятнадцать");
                    break;
                }
                default:
            }

            int de = wwod / 10;
            switch (de) {

                case 2: {
                    System.out.print("двадцать ");
                    break;
                }
                case 3: {
                    System.out.print("тридцать ");
                    break;
                }
                case 4: {
                    System.out.print("сорок ");
                    break;
                }
                case 5: {
                    System.out.print("пятьдесят ");
                    break;
                }
                case 6: {
                    System.out.print("шестьдесят ");
                    break;
                }
                case 7: {
                    System.out.print("семдесят ");
                    break;

                }
                case 8: {
                    System.out.print("восемьдесят ");
                    break;
                }
                case 9: {
                    System.out.print("девяносто ");
                    break;
                }
                default:
            }
            if (wwod<0||wwod>100){
                System.out.println("Вы ввели неправильное число!!!");

            }else{
                System.out.println();
            }

            if ( wwod >= 0 && wwod < 10 || wwod > 20 && wwod < 100 ) {

                int edinici = wwod % 10;

                switch (edinici) {

                    case 1: {
                        System.out.println("один");
                        break;
                    }
                    case 2: {
                        System.out.println("два");
                        break;
                    }
                    case 3: {
                        System.out.println("три");
                        break;
                    }
                    case 4: {
                        System.out.println("четыре");
                        break;
                    }
                    case 5: {
                        System.out.println("пять");
                        break;
                    }
                    case 6: {
                        System.out.println("шесть");
                        break;
                    }
                    case 7: {
                        System.out.println("семь");
                        break;
                    }
                    case 8: {
                        System.out.println("восемь");
                        break;
                    }
                    case 9: {
                        System.out.println("девять");
                        break;
                    }
                    default:


                }
            }
        }
    }

