import interfaces.Truckable;
import models.*;
import repository.CarRepositoryImport;

public class Main {
    public static void main(String[] args) {
        Sedan sedan_patapim = new Sedan(2025, 500, "Patapim",5,false );
        Sedan sedan_BallerinaCappuchino = new Sedan(1970, 1, "Ben мобиль",1,false );
        Sedan[] sedan_rot = new Sedan[]{sedan_BallerinaCappuchino, sedan_patapim};
        Truck truck_bombordilo = new Truck(2022, 43, "Crocodilo", 2000,false);
        ElectroCar tesla = new ElectroCar(2025, 100, "Boneca Ambalabu", 52,false);
        Car[] cars = new Car[]{sedan_patapim, sedan_BallerinaCappuchino, truck_bombordilo, tesla};
        Truckable TruckInterface = new Truck(2020, 300, "Volvo ", 450, false);
        TruckInterface.load();

        Truckable electroTruckInterface = new ElectroTruck(2021, 400, "TeslaСybertruck ", 300, true, 100);
        electroTruckInterface.load();
        CarRepositoryImport repo = new CarRepositoryImport();
        Sedan s1 = new Sedan(2020, 300, "Toyota", 5, false);
        Sedan s2 = new Sedan(2021, 350, "Tesla", 4, true);
        Sedan s3 = new Sedan(2020, 300, "Porsche", 5, false);
        Truck t1 = new Truck(2020, 400, "Volvo", 5000, false);

        repo.addCar(s1);
        repo.addCar(s2);
        repo.addCar(s3);
        repo.addCar(t1);

        repo.getCars(CarBrand.MERCEDES);
        repo.getCars(CarBrand.AUDI);
        repo.getCars(CarBrand.TESLA);
        repo.getCars(CarBrand.PORSCHE);
        repo.getCars(CarBrand.BMW);

    }

}

