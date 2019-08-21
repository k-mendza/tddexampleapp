public class Sum implements Expression{
    Money augment;
    Money addmend;

    public Sum(Money augment, Money addmend) {
        this.augment = augment;
        this.addmend = addmend;
    }

    public Money reduce(String to){
        int amount = augment.amount + addmend.amount;
        return new Money(amount, to);
    }
}
