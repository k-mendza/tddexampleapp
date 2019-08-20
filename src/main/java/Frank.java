import java.util.Objects;

public class Frank extends Money {

    public Frank(int amount) {
       this.amount = amount;
    }

    public Money times(int factor) {
        return new Frank( amount * factor);
    }
}
