import interfaces.*;
import models.*;
import repository.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создание репозиториев
        CarRepository repo = new CarRepository();
        ElecroCarRepository ERepo = new ElecroCarRepository();

        //Создание объектов машин
        Sedan sedan_patapim = new Sedan(2025, 500, "Patapim",5,false );
        Sedan sedan_BallerinaCappuchino = new Sedan(1970, 1, "Ben мобиль",1,false );
        Truck truck_bombordilo = new Truck(2022, 43, "Crocodilo", 2000,false);
        ElectroCar tesla = new ElectroCar(2025, 100, "Boneca Ambalabu", 52,false);
        Sedan s1 = new Sedan(2020, 300, "Toyota", 5, false);
        Sedan s2 = new Sedan(2021, 350, "Mercedes", 4, true);
        Sedan s3 = new Sedan(2020, 300, "Porsche", 5, false);
        Truck t1 = new Truck(2020, 400, "Volvo", 5000, false);
        List<Car> cars = new ArrayList<Car>();
        cars.add(s1);
        cars.add(s2);
        cars.add(s3);
        cars.add(t1);
        //Работа с репозиториями
        ERepo.save(tesla);
        repo.save(sedan_patapim);
        System.out.println(repo.saveAll(cars));
        System.out.println(repo.findByID(2).get().brand);
        repo.deleteByID(2);
        System.out.println(repo.findByID(2).get().brand);
        System.out.println(repo.findByID(8).isPresent());
        repo.deleteAll();
        System.out.println(repo.count());
    }

}
