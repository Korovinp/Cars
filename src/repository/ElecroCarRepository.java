package repository;

import models.Car;
import models.ElectroCar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ElecroCarRepository implements Repository<ElectroCar, Integer>{
    List<ElectroCar> cars = new ArrayList<ElectroCar>();

    public ElectroCar save(ElectroCar entity){
        cars.add(entity);
        return entity;
    }
    public List<ElectroCar> saveAll(Collection<ElectroCar> entities){
        cars.addAll(entities);
        return cars;
    }
    public Optional<ElectroCar> findByID(Integer id){
        if(existByID(id)){
            return Optional.of(cars.get(id));
        }
        else{return Optional.empty();}
    }
    public void deleteByID(Integer id){
        if(existByID(id)){
            cars.remove(id.intValue());
        }
    }
    public void deleteAll(){
        cars.clear();
    }
    public long count(){
        return cars.size();
    }
    public boolean existByID(Integer id){
        if (id < cars.size()) {
            return true;
        }
        else{return false;}
    }
}