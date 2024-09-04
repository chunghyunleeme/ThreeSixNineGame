public class BusanGame extends ThreeSixNineGame{
    @Override
    String do369(int number) {
        String numberStr = String.valueOf(number);
        long clapCount = numberStr.chars().filter(ch -> ch == '3' || ch == '6' || ch == '9').count();
        if(clapCount > 0){
            return "clap".repeat((int) clapCount);
        }
        return numberStr;
    }
}
