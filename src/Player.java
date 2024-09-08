public class Player {
    private final String name;
    private final double errorRate;

    public Player(String name, double errorRate) {
        this.name = name;
        this.errorRate = errorRate;
    }

    public String getName() {
        return this.name;
    }

    public boolean mistakes(){
        return Math.random() < this.errorRate;
    }
}
