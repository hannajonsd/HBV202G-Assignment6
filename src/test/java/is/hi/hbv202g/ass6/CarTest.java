package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    public static final String BEETLE = "Beetle";

    Car car;

    @Before
    public void setUpCar() throws Exception {
        car = new Car(BEETLE);
    }

    @Test
    public void getNameOfCar() {
        assertEquals(BEETLE, car.getName());
    }

}
