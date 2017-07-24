package keywords;

/**
 * Created by memoona on 7/22/17.
 */
public class Car {
    String carModel;
    int year;
    //Constructor 1

    public Car(){
        System.out.println("This is a keywords.Car object.");
    }
    //constructor 2
    public Car(String carModel) {
            this.carModel=carModel;
            System.out.println(carModel);
    }
    //constructor 3
    public Car(String carModel, int year){
        this.carModel = carModel;
        this.year= year;
        System.out.println(year);
    }
    }

