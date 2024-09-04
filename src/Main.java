public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("영수", 0.1),
                new Player("광수", 0.1),
                new Player("영철", 0.1),
                new Player("상철", 0.1)
        };

        ThreeSixNineGame seoulGame = new SeoulGame();
        ThreeSixNineGame busanGame = new BusanGame();

        seoulGame.playGame(players);
        busanGame.playGame(players);
    }
}