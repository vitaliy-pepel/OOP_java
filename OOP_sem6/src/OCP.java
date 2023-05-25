/**
 *  Open closed Principle - принцип открытости-закрытости. Классы должны быть открыты для расширения, но закрыты для изменения.
 */

//Класс Vehicle
public class Vehicle {
    int maxSpeed;
    String type;
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }
}
public abstract class VehicleType {
    public abstract double calculateAllowedSpeed(int maxSpeed);

    public int getMaxSpeed() {
        return 0;
    }
}

// Класс Car наследующий от VehicleType
public class Car extends VehicleType {
    @Override
    public double calculateAllowedSpeed(int maxSpeed) {
        return maxSpeed * 0.8;
    }
}
// Класс Bus наследующий от VehicleType
public class Bus extends VehicleType {
    @Override
    public double calculateAllowedSpeed(int maxSpeed) {
        return maxSpeed * 0.6;
    }
}

// Класс SpeedCalculation
public class SpeedCalculation {
    public double calculateAllowedSpeed(VehicleType vehicle) {
        return vehicle.calculateAllowedSpeed(vehicle.getMaxSpeed());
    }
}