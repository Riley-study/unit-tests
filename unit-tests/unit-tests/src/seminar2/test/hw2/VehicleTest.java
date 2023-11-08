package hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar2.hw2.Car;
import seminar2.hw2.Motorcycle;
import seminar2.hw2.Vehicle;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    // Проект Vehicle. Написать следующие тесты с использованием JUnit5:
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Chevrolet", "Lacetti", 2015);
        motorcycle = new Motorcycle("Harley", "Davidson", 1990);
    }

    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void checkCarIsVehicle(){
        assertTrue(car instanceof Vehicle);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void checkCarHasFourWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    //- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void checkMotorcycleHasTwoWheels(){
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void checkCarSpeedTestDrive(){
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void checkMotorcycleSpeedTestDrive(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void checkCarSpeedPark(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void checkMotorcycleSpeedPark(){
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}
