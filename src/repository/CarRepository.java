package repository;

import models.Car;
import models.CarBrand;

public interface CarRepository {
    void addCar(Car car);
    void delCar(int ind);
    void getCar(String brand);
    void getCars(CarBrand brands);
}