package keywords;

import keywords.Car;

/**
 * Created by memoona on 7/22/17.
 */
public class ElectricCar extends Car {

    public ElectricCar() {
        System.out.println("This is an Electric keywords.Car object");
    }

    public ElectricCar(String carModel){
        super(carModel);
}
    public ElectricCar(String carModel, int year){
        super(carModel,year);
    }
    public void getCarInfo(){
        System.out.println("This is a Toyota keywords.Car.");
    }
}
