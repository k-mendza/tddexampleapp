import java.util.Objects;

public class Dollar extends Money {
    private int amount;

    public Dollar(int amount) {
        super(amount);
    }

    public Dollar times(int factor) {
        return new Dollar( super.amount * factor);
    }
}
