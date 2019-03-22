public class DefaultMethod1 {

    public static void main(String args[]) {
        Car car = new Car();
        car.print();
        car.turnAlarmOn();
    }
}

interface Vehicle {

    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

interface FourWheeler {

    default void print() {
        System.out.println("I am a four wheeler!");
    }

    default void turnAlarmOn() {
        System.out.println("Turning the vehicle alarm on.");
    }

}

class Car implements Vehicle, FourWheeler {

    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("I am a car!");
    }
}