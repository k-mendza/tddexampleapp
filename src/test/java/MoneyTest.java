import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testEquality() {
        assertEquals(Money.dollar(1), Money.dollar(1));
        assertNotEquals(Money.dollar(1), Money.dollar(2));
        assertNotEquals(Money.dollar(1),Money.franc(1));
    }

    @Test
    void testMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.franc(1).currency);
    }
}
