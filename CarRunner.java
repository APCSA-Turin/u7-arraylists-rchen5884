import java.util.ArrayList;
import java.util.Arrays;

public class CarRunner
{
    public static int passedTests = 0;
    public static int failedTests = 0;

    public static void main(String[] args)
    {
        Car c1 = new Car("Mustang", 1200);
        Car c2 = new Car("Car", 1400);
        Car c3 = new Car("Lambo", 2500);

        Car[] cars = {c1, c2, c3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));

        System.out.println(carList);
    }
}