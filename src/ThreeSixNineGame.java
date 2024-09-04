public abstract class ThreeSixNineGame {
    abstract String do369(int number);

    void playGame(Player[] players) {
        int i = 1;
        while(true){
            Player currentPlayer = players[(i - 1) % players.length];
            String result = do369(i);

            if(currentPlayer.willMakeMistake()) {
                if(result.equals("clap")) System.out.println(currentPlayer.getName() + ": " + i);
                else System.out.println(currentPlayer.getName() + ": " + "clap");
                break;
            }

            System.out.println(currentPlayer.getName() + ": " + result);
            i++;
        }
    }
}
