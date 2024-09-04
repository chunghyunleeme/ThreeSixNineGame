public abstract class ThreeSixNineGame {
    abstract String do369(int number);

    void playGame(Player[] players, ClapCounter clapCounter) {
        int i = 1;
        while(true){
            Player currentPlayer = players[(i - 1) % players.length];
            String result = do369(i);

            // 기저 case
            if(currentPlayer.willMakeMistake()) {
                if(result.equals("clap")) System.out.printf("[%s] %s: %d\n", this.getClass().getName(), currentPlayer.getName(), i);
                else System.out.printf("[%s] %s: %s\n", this.getClass().getName(), currentPlayer.getName(), "clap");
                break;
            }

            if(result.equals("clap")) {
                clapCounter.addClap(1);
            } else if (result.startsWith("clap")) {
                clapCounter.addClap(result.length() / 4);
            }

//            System.out.println(this.getClass().getName() + currentPlayer.getName() + ": " + result);
            System.out.printf("[%s] %s: %s\n", this.getClass().getName(), currentPlayer.getName(), result);
            i++;
        }
    }
}
