public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public int times(int factor){
        return this.amount *= factor;
    }
}
