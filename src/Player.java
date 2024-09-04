public class Player {
    private String name;
    private double errorRate;

    public Player(String name, double errorRate) {
        this.name = name;
        this.errorRate = errorRate;
    }

    public String getName() {
        return this.name;
    }

    public boolean willMakeMistake(){
        return Math.random() < this.errorRate;
    }
}
