public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача № 1");
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
        int savingMoney = 29000;
        int totalMoney = 0;
        for (int i = 0; i < 12; i++) {
            totalMoney = totalMoney + savingMoney/100;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney);
        }


        System.out.println("Задача № 10");
        for (int i = 1; i<= 10; i++){
           System.out.println("2 * " + i + " = " + (i * 2));
        }

    }

}