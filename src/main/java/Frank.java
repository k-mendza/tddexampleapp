import java.util.Objects;

public class Frank extends Money {

    public Frank(int amount) {
        super(amount);
    }

    public Frank times(int factor) {
        return new Frank( super.amount * factor);
    }
}
