import java.util.Scanner;

public class Itog_3 {
    /*Напишите программу конвертер валют.
     Программа должна переводить рубли в доллары по текущему курсу.
     Пользователь вводит текущий курс и количество рублей.*/
    public static void main(String[] args) {
        System.out.println("Конвертер валют." + "\n" + "Позволяет перевести рубли в доллары по текущему курсу.");
        Scanner in= new Scanner(System.in);
        // вводим данные**********************************
        System.out.println("Нынешний курс: " );
        double course = in.nextDouble();
        System.out.println( "Кол-во рублей на конвертацию: " );
        double rur = in.nextDouble();
        System.out.println("Нынешний курс: " + course + "\n" + "Кол-во рублей на конвертацию: " + rur);
        //*****************
        System.out.println("Конвертация из рубли в доллары равна " + (course*rur) );


    }
}
