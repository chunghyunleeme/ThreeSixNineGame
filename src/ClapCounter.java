public class ClapCounter {
    private int count = 0;

    public synchronized void addClap(int claps){
        count += claps;
    }

    public void printClapCount(){
        System.out.println("Total claps = " + count);
    }
}
