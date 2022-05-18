package ru.skypro;

public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1(){
        int clientOS = 1;
        boolean programVersionIos = clientOS == 0;
        boolean programVersionAndroid = clientOS == 1;
        if (programVersionIos){
            System.out.println("Установите версию приложения для IOS по ссылке");
        }else if (programVersionAndroid){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2(){
        int clientOS = 0;
        int clientDeviceYear = 2011;
        boolean newIos = clientOS == 0 && clientDeviceYear >= 2015;
        boolean oldIos = clientOS == 0 && clientDeviceYear < 2015;
        boolean newAndroid = clientOS == 1 && clientDeviceYear >= 2015;
        boolean oldAndroid = clientOS == 1 && clientDeviceYear < 2015;
        if ( newIos){
            System.out.println("Установите версию приложения для IOS по ссылке");
        }else if (oldIos){
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }else if (newAndroid){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if(oldAndroid) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3(){
        int year = 2016;
        if (year % 4 == 0 && year % 100 != 0 ){
            System.out.println(year + " является високосным");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " является високосным");
        }else{
            System.out.println(year + " не является високосным");
            }
        }

        public static void task4(){
        int deliveryDistance = 95;
        int estimatedDeliveryTime = 0;
        int interval1 = 20;
        int interval2 = 60;
        int interval3 = 100;
        boolean distance1 = deliveryDistance <= interval1;
        boolean distance2 = deliveryDistance > interval1 && deliveryDistance < interval2;
        boolean distance3 = deliveryDistance >= interval2 && deliveryDistance <= interval3;
        if (distance1){
            estimatedDeliveryTime+=1;
        } else if (distance2){
            estimatedDeliveryTime+=2;
        } else if (distance3){
            estimatedDeliveryTime+=3;
        } else {
            System.out.println("Доставку не осуществляем");
        }
        System.out.println("Потребуется дней: " + estimatedDeliveryTime);
        }

        public static void task5(){
        byte monthNumber = 5;
        switch (monthNumber){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
        }
        }
}
