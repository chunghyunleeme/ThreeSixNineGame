public class ThreeSixNineGame {
    private String do369(int number){
        String numberStr = String.valueOf(number);
        if(numberStr.contains("3") || numberStr.contains("6") || numberStr.contains("9")){
            return "clap";
        }
        return numberStr;
    }

    private void playGame(Player[] players) {
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

    public static void main(String[] args) {
        Player[] players = {
                new Player("영수", 0.1),
                new Player("광수", 0.1),
                new Player("영철", 0.1),
                new Player("상철", 0.1)
        };
        new ThreeSixNineGame().playGame(players);
    }
}