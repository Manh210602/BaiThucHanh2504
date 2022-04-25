package Main;

import Car.Car;
import Car.TaxiCar;

public class Maincar {
    public static void main(String[] args) {
        Car car = new TaxiCar();
        car.move();
    }
}