package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    List<Car> garage = new ArrayList<>(Arrays.asList(
            new Car("BMV", 2018,5),
            new Car("AUDI", 2022,4.2),
            new Car("Citroen", 2021,1.6),
            new Car("VAZ",2023,1.8),
            new Car("Toyota",2019,2.4)
    ));

    public List<Car> getGarage() {
        return garage;
    }

}
