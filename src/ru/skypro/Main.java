package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int clientOS = 0;
        boolean programVersionIos = clientOS == 0;
        boolean programVersionAndroid = clientOS == 1;
        if (programVersionIos) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (programVersionAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 1999;
        boolean newIos = clientOS == 0;
        boolean oldPhone = clientDeviceYear < 2015;
        boolean newAndroid = clientOS == 1;
        if (newIos) {
            if (oldPhone) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
        if (newAndroid) {
            if (oldPhone) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int estimatedDeliveryTime = 1;
        boolean interval1 = deliveryDistance > 20;
        boolean interval2 = deliveryDistance > 60;

        if (interval1) {
            estimatedDeliveryTime++;
        }

        if (interval2) {
            estimatedDeliveryTime++;
        }
        System.out.println("Потребуется дней: " + estimatedDeliveryTime);
    }

    public static void task5() {
        byte monthNumber = 8;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введите корректный месяц");
        }
    }

    public static void task6() {
        int age = 28;
        int salary = 75_000;
        int limit;

        boolean years = age >= 23;
        boolean limit1 = salary >= 50000 && salary < 80000;
        boolean limit2 = salary >= 80000;

        if (years)
            limit = salary * 3;
        else
            limit = salary * 2;

        if (limit1) {
            limit *= 1.2;
        } else if (limit2) {
            limit *= 1.5;
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

    public static void task7() {
        int age = 29;
        int salary = 60_774;
        int wantedSum = 330_000;
        double maximumPayment = (double) salary / 2;
        double baseRate = 0.1;
        double amountPerYear;
        double interestPerMonth;

        boolean years23 = age < 23;
        boolean years30 = age < 30;

        if (years23) {
            baseRate += 0.01;
        } else if (years30) {
            baseRate += 0.005;
        }

        if (salary >= 80_000)
            baseRate -= 0.007;

        amountPerYear = wantedSum + wantedSum * baseRate; // сумма с % за год
        interestPerMonth = amountPerYear / 12; // платеж с % в месяц

        if (maximumPayment > interestPerMonth)
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + (int) maximumPayment + " рублей. Платеж по кредиту " + wantedSum + " рублей - Одобрено.");
        else
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + (int) maximumPayment + " рублей. Платеж по кредиту " + wantedSum + " рублей - Отказано.");
    }
}
