import java.util.Objects;

public class Frank {

    private int amount;

    public Frank(int amount) {
        this.amount = amount;
    }

    public Frank times(int factor) {
        return new Frank( amount * factor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frank frank = (Frank) o;
        return amount == frank.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
