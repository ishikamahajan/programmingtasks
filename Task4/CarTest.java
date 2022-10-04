package Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testEquals() {

        //adding objects into array
        Car[] cars = {
                new Car("Holden", "Civic", "Red"),
                new Car("Jeep", "Wrangler", "Blue"),
                new Car("Jeep", "Wrangler", "Green"),
        };
        //comparing objects using equals method
        cars[0].equals(new Car("Honda", "CivicNew", "Red"));
        cars[1].equals(new Car("Holden", "Civic", "Red"));
        cars[2].equals(new Car("Jeep", "Wrangler", "Blue"));
        boolean actual1 = cars[0].equals(new Car("Honda", "CivicNew", "Red"));
        boolean actual2 = cars[1].equals(new Car("Honda", "CivicNew", "Red"));
        boolean actual3 = cars[2].equals(new Car("Honda", "CivicNew", "Red"));

       //it will check if the actual value is equals to expected value
        assertEquals(true, actual1);
        assertEquals(true, actual2);
        assertEquals(true, actual3);
    }

    @Test
    void testHashCode() {
        Car car1 = new Car("Honda", "Civic", "black");
        Car car2 = new Car("Honda", "Civic", "black");
        assertEquals(true, car1.hashCode());
        assertEquals(true, car2.hashCode());

    }
}