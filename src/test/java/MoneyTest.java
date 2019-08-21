import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testDollarMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void testDollarEquality() {
        assertEquals(Money.dollar(1), Money.dollar(1));
        assertNotEquals(Money.dollar(1), Money.dollar(2));
        assertNotEquals(Money.dollar(1),Money.frank(1));
    }

    @Test
    void testFrankMultiplication() {
        Money five = Money.frank(5);
        assertEquals(Money.frank(10), five.times(2));
        assertEquals(Money.frank(15), five.times(3));
    }

    @Test
    void testFrankEquality() {
        assertEquals(Money.frank(1), Money.frank(1));
        assertNotEquals(Money.frank(1), Money.frank(2));
        assertNotEquals(Money.frank(1), Money.dollar(1));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.frank(1).currency);
    }
}
