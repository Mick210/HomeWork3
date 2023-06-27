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

        System.out.println("Задача 2, типы переменных: float 27.12 long 987678965549 float 2.786 short 569 short -159 short 27897 byte 67");
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
        byte allStudents = (byte) (LP + AS + EA);
        short totalSheets = 480;
        byte studentSheet = (byte) (totalSheets / allStudents);
        System.out.println("На каждого ученика рассчитано " + studentSheet + " листов бумаги");

        byte efficiency2Minutes = 16;
        byte efficiency1Minutes = (byte) (efficiency2Minutes / 2);
        short efficiency20Minutes = (short) (efficiency1Minutes * 20);
        short efficiency24Hours = (short) (efficiency1Minutes * 60 * 24);
        int efficiency72Hours = efficiency24Hours * 3;
        int efficiency1Month = efficiency24Hours * 30;
        System.out.println("За 20 минут машина произвела " + efficiency20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + efficiency24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiency72Hours + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + efficiency1Month + " штук бутылок");

        byte totalPaint = 120;
        byte classWhite = 2;
        byte classGrown = 4;
        byte classWhiteGrown = (byte) (classWhite + classGrown);
        byte totalClass = (byte) (totalPaint / classWhiteGrown);
        byte totalWhite = (byte) (classWhite * totalClass);
        byte totalGrown = (byte) (classGrown * totalClass);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalGrown + " банок коричневой краски");

        short bananas = (short) (5 * 80);
        short milk = (short) (2 * 105);
        short iceCream = (short) (2 * 100);
        short egg = (short) (4 * 70);
        short weightGrams = (short) (bananas + milk + iceCream + egg);
        float weightKg = (float) weightGrams / 1000;
        System.out.println("Вес завтрака " + weightGrams + " грамм");
        System.out.println("Вес завтрака " + weightKg + " килограмм");

        byte loseWeightOn = 7;
        short loseWeightOn250 = 250;
        short loseWeightOn500 = 500;
        byte itTakesDays250 = (byte) (loseWeightOn * 1000 / loseWeightOn250);
        System.out.println("Если сбрасывать по " + loseWeightOn250 + " грамм в день, спортсмену потребуется " + itTakesDays250 + " дней");
        byte itTakesDays500 = (byte) (loseWeightOn * 1000 / loseWeightOn500);
        System.out.println("Если сбрасывать по " + loseWeightOn500 + " грамм в день, спортсмену потребуется " + itTakesDays500 + " дней");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int masha10 = (int) (masha * 1.1);
        int mashaAnnual = masha10 * 12;
        int salaryDifferenceMasha = mashaAnnual - masha * 12;
        System.out.println("Теперь Маша будет получать " + masha10 + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        int denis10 = (int) (denis * 1.1);
        int denisAnnual = (int) (denis10 * 12);
        int salaryDifferenceDenis = denisAnnual - denis * 12;
        System.out.println("Теперь Денис будет получать " + denis10 + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рубля");
        int kristina10 = (int) (kristina * 1.1);
        int kristinaAnnual = (int) (kristina10 * 12);
        int salaryDifferenceKristina = kristinaAnnual - kristina * 12;
        System.out.println("Теперь Кристина будет получать " + kristina10 + " рубля. Годовой доход вырос на " + salaryDifferenceKristina + " рубля");

    }
}


