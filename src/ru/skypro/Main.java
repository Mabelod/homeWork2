package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
        int clientOS = 1;
        int clientDeviceYear = 2016;
        boolean newIos = clientOS == 0;
        boolean oldIos = clientDeviceYear < 2015;
        boolean newAndroid = clientOS == 1;
        boolean oldAndroid = clientDeviceYear < 2015;
        if (newIos) {
            if (oldIos) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
        if (newAndroid) {
        }
        if (oldAndroid) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
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

        if (deliveryDistance > 20) {
            estimatedDeliveryTime++;
        }

        if (deliveryDistance > 60) {
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
}
