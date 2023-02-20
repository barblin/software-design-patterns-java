package io.barblin.patterns.behavioral.strategy;

import io.barblin.patterns.behavioral.strategy.vehicles.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StrategyTest {

    private static final RepairShop shop = new RepairShop();

    @BeforeAll
    public static void register() {
        shop.registerStrategy(Vehicle.VehicleType.CAR, new CarRepairStrategy());
        shop.registerStrategy(Vehicle.VehicleType.MOTORCYCLE, new MotorcycleRepairStrategy());
        shop.registerStrategy(Vehicle.VehicleType.TRUCK, new TruckRepairStrategy());
    }

    @Test
    void repairShouldRepairCar() {
        assertEquals("Car", shop.repair(new Car()));
    }

    @Test
    void repairShouldRepairMotorcycle() {
        assertEquals("Motorcycle", shop.repair(new Motorcycle()));
    }

    @Test
    void repairShouldRepairTruck() {
        assertEquals("Truck", shop.repair(new Truck()));
    }

    @Test
    void repairShouldRespondWithNotSupportedOnSpaceship() {
        assertEquals("Not supported", shop.repair(new Spaceship()));
    }

    @Test
    void repairShouldThrowIllegalArgumentExceptionOnVehicleNull() {
        assertThrows(IllegalArgumentException.class, () -> shop.repair(null));
    }
}