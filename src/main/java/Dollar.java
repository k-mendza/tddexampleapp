import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int factor) {
        return Money.dollar( amount * factor);
    }
}
