public class Bank {

    public Money reduce(Expression source, String targetCurrency) {
        return source.reduce(targetCurrency);
    }
}
