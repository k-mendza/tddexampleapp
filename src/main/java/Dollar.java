public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int factor){
        return new Dollar( amount * factor);
    }
}
