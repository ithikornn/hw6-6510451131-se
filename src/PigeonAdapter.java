//6510451131 Ithikorn Ungniyom

public class PigeonAdapter implements Quackable{
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
