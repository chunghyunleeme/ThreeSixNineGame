public class ThreeSixNineGame {
    private String do369(int number){
        String numberStr = String.valueOf(number);
        if(numberStr.contains("3") || numberStr.contains("6") || numberStr.contains("9")){
            return "clap";
        }
        return numberStr;
    }

    private void playGame(String[] players) {
        for(int i = 1; i <= 100; i++){
            String result = do369(i);
            System.out.println(players[(i - 1) % players.length] + ": " + result);
        }
    }

    public static void main(String[] args) {
        String[] players = {"영수", "광수", "영철", "상철"};
        new ThreeSixNineGame().playGame(players);
    }
}