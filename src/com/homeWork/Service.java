package com.homeWork;

public class Service {

    public void setColor(String color, Car car) { // метод для завода по перекраске авто(в параметрах передаем обьект машину какую нибудь и новый цвет
        car.color = color;
    }
    public void setWheels(int wheels, Car car) { // метод для завода по изменению размера шин авто(в параметрах передаем обьект машину какую нибудь и новый размер
        car.wheels = wheels;
    }
}
