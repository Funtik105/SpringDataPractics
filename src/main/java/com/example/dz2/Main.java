package com.example.dz2;

import com.example.dz2.repositories.CarRepositories;
import com.example.dz2.repositories.TruckRepositories;
import com.example.dz2.repositories.PlaneRepositories;
import com.example.dz2.repositories.BikeRepositories;
import com.example.dz2.models.Car;
import com.example.dz2.models.Truck;
import com.example.dz2.models.Bike;
import com.example.dz2.models.Plane;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;

@Component
public class Main implements CommandLineRunner {

    private final TruckRepositories TruckRepositories;
    private final CarRepositories CarRepositories;
    private final BikeRepositories BikeRepositories;
    private final PlaneRepositories PlaneRepositories;

    public Main(BikeRepositories BikeRepositories, PlaneRepositories PlaneRepositories,
                                 TruckRepositories TruckRepositories, CarRepositories CarRepositories) {
        this.BikeRepositories = BikeRepositories;
        this.PlaneRepositories = PlaneRepositories;
        this.TruckRepositories = TruckRepositories;
        this.CarRepositories = CarRepositories;
    }

    @Override
    public void run(String... args) throws Exception {
        seedData();

        printAllCars();
        printAllBikes();
        printAllPlanes();
        printAllTrucks();
        printAllTrucksByModel("Renault");

    }

    private void printAllTrucksByModel(String model) {
        TruckRepositories
                .findAllByModel(model)
                .forEach(System.out::println);
    }

    private void printAllTrucks() {
        TruckRepositories
                .findAll()
                .forEach(System.out::println);
    }

    private void printAllPlanes() {
        PlaneRepositories
                .findAll()
                .forEach(System.out::println);
    }
    private void printAllBikes() {
        BikeRepositories
                .findAll()
                .forEach(System.out::println);
    }
    private void printAllCars() {
        CarRepositories
                .findAll()
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {

        //Добавление в БД записей
        Truck t1 = new Truck("Volvo", BigDecimal.TEN,"98",1000.1);
        Truck t2 = new Truck("Renault", BigDecimal.TEN,"95",900.5);

        Plane p1 = new Plane("Airbus A330", BigDecimal.TEN,"98", "Russia", 200);
        Plane p2 = new Plane("Boeing 737", BigDecimal.TEN,"98", "Airflot", 250);

        Bike b1 = new Bike("Suzuki", BigDecimal.TEN, "95");
        Bike b2 = new Bike("BMW", BigDecimal.ONE, "98");

        Car c1 = new Car("BMW M5", BigDecimal.TEN, "95", 5);
        Car c2 = new Car("Cadillac Escalade", BigDecimal.TEN, "DT", 8);

        c1.getSeats();
        b1.getModel();
        p1.getPassengerCapacity();
        t1.getloadCapacity();

        c2.getSeats();
        b2.getModel();
        p2.getPassengerCapacity();
        t2.getloadCapacity();

        CarRepositories.save(c1);
        CarRepositories.save(c2);
        PlaneRepositories.save(p1);
        PlaneRepositories.save(p2);
        BikeRepositories.save(b1);
        BikeRepositories.save(b2);
        TruckRepositories.save(t1);
        TruckRepositories.save(t2);
    }
}
