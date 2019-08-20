import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int factor) {
        return new Dollar( amount * factor);
    }
}
