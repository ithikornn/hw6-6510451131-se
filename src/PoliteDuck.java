//6510451131 Ithikorn Ungniyom

public class PoliteDuck implements Quackable{
    static int count;
    Quackable duck;

    public PoliteDuck(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.println(" krub");
        count++;
    }

    public static int getCount() {
        return count;
    }
}
