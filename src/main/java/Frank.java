import java.util.Objects;

public class Frank extends Money {

    public Frank(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int factor) {
        return Money.frank( amount * factor);
    }
}
