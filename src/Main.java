// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int in = 40000;
        System.out.println("Значение переменной in c типом int равно " + in);
        byte by = 8;
        System.out.println("Значение переменной by c типом byte равно " + by);
        short sh = 400;
        System.out.println("Значение переменной sh c типом short равно " + sh);
        long lo = 3000111222L;
        System.out.println("Значение переменной lo c типом long равно " + lo);
        float fl = 3.3f;
        System.out.println("Значение переменной fl c типом float равно " + fl);
        double dou = 2.123456789;
        System.out.println("Значение переменной do c типом double равно " + dou);

        System.out.println("Задача 2, типы переменных: float, long, short, byte");
        float flTwo = 27.12f;
        long loTwo = 987678965549L;
        float flThree = 2.786f;
        short shTwo = 569;
        short shThree = -159;
        short shFour = 27897;
        byte byTwo = 67;

        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int allStudents = LP + AS + EA;
        short totalSheets = 480;
        int studentSheet = totalSheets / allStudents;
        System.out.println("На каждого ученика рассчитано " + studentSheet + " листов бумаги");

        byte efficiency2Minutes = 16;
        int efficiency1Minutes = efficiency2Minutes / 2;
        int efficiency20Minutes = efficiency1Minutes * 20;
        int efficiency24Hours = efficiency1Minutes * 60 * 24;
        int efficiency72Hours = efficiency24Hours * 3;
        int efficiency1Month = efficiency24Hours * 30;
        System.out.println("За 20 минут машина произвела " + efficiency20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiency24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiency72Hours + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + efficiency1Month + " штук бутылок");

        byte totalPaint = 120;
        byte classWhite = 2;
        byte classGrown = 4;
        int classWhiteGrown = classWhite + classGrown;
        int totalClass = totalPaint / classWhiteGrown;
        int totalWhite = classWhite * totalClass;
        int totalGrown = classGrown * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalGrown + " банок коричневой краски");

        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int weightGrams = bananas + milk + iceCream + egg;
        float weightKg = (float) weightGrams / 1000;
        System.out.println("Вес завтрака " + weightGrams + " грамм");
        System.out.println("Вес завтрака " + weightKg + " килограмм");


    }
}


