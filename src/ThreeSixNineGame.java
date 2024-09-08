public abstract class ThreeSixNineGame implements IThreeSixNineGame{
    public void playGame(Player[] players, ClapCounter clapCounter) {
        int index = 1;
        while(true){
            Player currentPlayer = players[(index - 1) % players.length];
            String result = do369(index);

            // 기저 case
            if(currentPlayer.mistakes()) {
                if(result.equals("clap")) System.out.printf("[%s] %s: %d\n", this.getClass().getName(), currentPlayer.getName(), index);
                else System.out.printf("[%s] %s: %s\n", this.getClass().getName(), currentPlayer.getName(), "clap");
                break;
            }

            if(result.equals("clap")) {
                clapCounter.addClap(1);
            } else if (result.startsWith("clap")) {
                clapCounter.addClap(result.length() / 4);
            }

            System.out.printf("[%s] %s: %s\n", this.getClass().getName(), currentPlayer.getName(), result);
            index++;
        }
    }
}
