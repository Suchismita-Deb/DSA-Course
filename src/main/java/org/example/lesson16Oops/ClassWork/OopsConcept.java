package org.example.lesson16Oops.ClassWork;

class Vehicle{
    int numWheels;
    String make;
    String model;

    Vehicle(){
        System.out.println("Vehicle default constructor.");
    }
    Vehicle(String make, String model){
        this.make = make;
        this.model = model;
        System.out.println("Vehicle constructor 2.");
    }
    String convertToString(){
        return "[" + make +" "+model+"]";
    }
}
class Car extends Vehicle{
    int engineCapacity;
    int numAirBags;
    boolean sunRoof;
    int topSpeed;
    void printCar(){
        System.out.println("Run in 4 wheel");
    }
    Car(){
        System.out.println("Car constructor 1.");
    }
    Car(String make, String model, int engineCapacity){
        // this.make = make;
        // this.model = model;
        super(make,model); // this will get the value from the vehicle constructor which has the value.
        this.engineCapacity = engineCapacity;
        System.out.println("Car constructor 2.");
    }
}
public class OopsConcept {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.make = "Hundai";
        vehicle.model = "Creta";
        System.out.println(vehicle.convertToString());
        System.out.println();

        Car car = new Car();
        car.engineCapacity = 1500;
        car.numAirBags = 2;
        car.sunRoof = true;
        car.make = "Kia";
        car.model = "Seltos";
        car.numWheels = 4;
        System.out.println(car.convertToString());
        car.printCar();
        System.out.println();

        Car c = new Car("Ferrari","SF90",5000);
        c.printCar();
        c.convertToString();
    }
}
