import java.util.Objects;

public class Money implements Expression {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int factor){
        return new Money(amount*factor, this.currency);
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        Money money = (Money) o;
        if (this == o){
            return true;
        }
        if (o == null || !Objects.equals(this.currency, money.currency)){
            return false;
        }
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Expression plus(Money add) {
        return new Money(amount + add.amount, currency);
    }
}
