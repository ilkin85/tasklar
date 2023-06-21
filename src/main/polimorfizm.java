package main;

public class polimorfizm {
    public static void main(String[] args) {
        Car [] cars= {new BMW(), new Mercedes()};
        driveAllCArs(cars);
    }

    public static void driveAllCArs(Car [] cars){
        for(int i = 0; i < cars.length;i++ ) {
            Car c = cars[i];
            c.drive();

        }
    }
}
