package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarOwnerTest {

    public static final String JOHN_DOE = "John Doe";
    public static final String BEETLE = "Beetle";

    CarOwner carOwner;

    Car car;

    @Before
    public void setUpOwner() throws Exception {
        carOwner = new CarOwner(JOHN_DOE, car);
    }

    @Before
    public void setUpCar() throws Exception {
        car = new Car(BEETLE);
    }


    @Test
    public void getName() {
        assertEquals(JOHN_DOE, carOwner.getName());
    }

}