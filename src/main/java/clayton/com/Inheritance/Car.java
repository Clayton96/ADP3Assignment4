package clayton.com.Inheritance;

public class Car extends Vehicle {

    public Car() {

        super();

    }

    @Override
    public String vehicleType(){

        return "Sports " + vehicleType();

    }

}
