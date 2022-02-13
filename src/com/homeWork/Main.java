package com.homeWork;

public class Main {

    public static void main(String[] args) {
        Car mark2 = new Car("Белый","Toyota Mark2", 1996,17, 3.0, "2jzgte", "Automatic gettrag");
        System.out.println(mark2); // выведем на печать нашу машину

        Service service = new Service();// создали обьект сервиса
        Factory factory = new Factory(); // создали обьект завода
        CarShowroom carShowroom = new CarShowroom();// создали обьект салона

        service.setColor("Красный",mark2); // отдаем заводу конкретную машину на перекраску и вызываем метод завода
        service.setWheels(14,mark2); // отдаем заводу конкретную машину на изменение размера колес и вызываем метод завода
        System.out.println(mark2); // посмотрим какая у нас машина получилась


    }
}
