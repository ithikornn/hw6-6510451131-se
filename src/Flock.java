//6510451131 Ithikorn Ungniyom

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        Iterator it = quackers.iterator();
        if (it.hasNext()){
            System.out.println("The leader");
            Quackable quacker = (Quackable) it.next();
            quacker.quack();
            quacker.quack();
            quacker.quack();
            System.out.println("---------");
        }
        while(it.hasNext()){
            Quackable quacker = (Quackable)it.next();
            quacker.quack();
        }
    }
}
