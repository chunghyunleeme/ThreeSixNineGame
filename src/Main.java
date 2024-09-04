public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("영수", 0.1),
                new Player("광수", 0.1),
                new Player("영철", 0.1),
                new Player("상철", 0.1)
        };

        ClapCounter clapCounter = new ClapCounter();

        Thread seoulThread = new Thread(() -> {
            ThreeSixNineGame seoulGame = new SeoulGame();
            seoulGame.playGame(players, clapCounter);
        });

        Thread busanThread = new Thread(() -> {
            ThreeSixNineGame busanGame = new BusanGame();
            busanGame.playGame(players, clapCounter);
        });

        seoulThread.start();
        busanThread.start();

        try {
            seoulThread.join();
            busanThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        clapCounter.printClapCount();
    }
}