package Task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarProcessingTest {

    @Test
    void removeDuplicates() {
        //creating object for car processing
        CarProcessing carProcessing = new CarProcessing();

        Car[] cars = {
                new Car("Holden", "Civic", "Red"),
                new Car("Holden", "Civic", "Red")};
        Car[] expected = { new Car( "Holden", "Civic", "Red")};
        //it will check if duplicate object is removed or not
        assertArrayEquals(expected, carProcessing.removeDuplicates(cars));


    }
}