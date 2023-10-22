public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*System.out.println("Задача № 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }


        System.out.println("Задача № 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        System.out.println("Задача № 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }


        System.out.println("Задача № 4");
        for (int i = 11; i > -11; i--) {
            System.out.println(i);
        }


        System.out.println("Задача № 5");
        for (int year = 1904; year < 2100; year = year + 4) {
            System.out.println(year + " год является висакосным");
        }


        System.out.println("Задача № 6");
        for (int i = 7; i < 105; i = i + 7) {
            System.out.println(i);
        }


        System.out.println("Задача № 7");
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println(i);
        }


        System.out.println("Задача № 8");
        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма нкоплений равна " + total);
        }


        System.out.println("Задача № 9");
        double salary = 29000;
        double percent = 0.01;
        for (int i = 0; i < 12; i++) {
            salary = salary + salary * percent;
            System.out.println("Месяц " + i + " сумма накоплений равна " + salary);
        }


        System.out.println("Задача № 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (i * 2));
        }*/

        // Домашняя работа по уроку № 2, темы Циклы //
        System.out.println(" задача № 1");
        int contribution = 15000;
        int total = 0;
        int next = 0;
        while (total < 2_459_000) {
            total = total + contribution;
            next = next + 1;
            System.out.println("Месяц " + next + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача № 2");
        int number = 1;
        for (number = 1; number < 11; number++) {
            System.out.print(number);
        }
        System.out.println();

        for (number = 10; number > 0; number--) {
            System.out.print(number);
        }


        System.out.println("Задача № 3");
        int people = 12_000_000;
        int difference = 17 - 8;
        for (int i = 0; i < 10; i++) {
            int birthRate = people / 1000 * difference;
            people = people + birthRate;
            System.out.println("Год " + i + " численность населения составляет " + people);
        }

        System.out.println("Задача № 4");
        double firstContribution = 15000;
        double constantPercent = 1.07;
        int month = 0;
        while (firstContribution < 12_000_000) {
            firstContribution = firstContribution * constantPercent;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений = " + (int) firstContribution);
        }

        System.out.println("Задача № 5");
        firstContribution = 15000;
        constantPercent = 1.07;
        month = 0;
        while (firstContribution < 12_000_000) {
            firstContribution = firstContribution * constantPercent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений = " + (int) firstContribution);
            }


        System.out.println("Задача № 6");
            firstContribution = 15000;
            constantPercent = 1.07;
            month = 0;
            while (month < 12 * 9) {
                firstContribution = firstContribution * constantPercent;
                month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " сумма накоплений равна " + (int) firstContribution);
        }


        System.out.println("Задача № 7");
            int friday = 5;
            for (int i = friday; i<=31; i=i+7){
                System.out.println("Сегодня пятница " + i + "е число. Необходимо подготовить отчет");
            }

        System.out.println("Задача № 8");
            for (int i = 2023-200; i <= 2023 + 100; i++){
                if(i%79==0){
                    System.out.println(i);
                }
            }


        }
    }
}




