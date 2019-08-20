import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testDollarMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testDollarEquality() {
        assertEquals(new Dollar(1), new Dollar(1));
        assertNotEquals(new Dollar(1), new Dollar(2));
    }

    @Test
    void testFrankMultiplication() {
        Frank five = new Frank(5);
        Frank product = five.times(2);
        assertEquals(new Frank(10), product);
        product = five.times(3);
        assertEquals(new Frank(15), product);
    }

    @Test
    void testFrankEquality() {
        assertEquals(new Frank(1), new Frank(1));
        assertNotEquals(new Frank(1), new Frank(2));
    }
}
