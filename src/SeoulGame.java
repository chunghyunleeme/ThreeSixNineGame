public class SeoulGame extends ThreeSixNineGame{
    @Override
    public String do369(int number) {
        String numberStr = String.valueOf(number);
        if (numberStr.contains("3") || numberStr.contains("6") || numberStr.contains("9")) {
            return "clap";
        }
        return numberStr;
    }
}
