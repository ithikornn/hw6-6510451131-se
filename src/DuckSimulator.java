//6510451131 Ithikorn Ungniyom

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory countingPoliteDuckFactory = new CountingPoliteDuckFactory();

        Flock flockOfDucks = new Flock();

        Quackable mallardDuck = countingDuckFactory.createMallardDuck();
        Quackable redheadDuck = countingDuckFactory.createRedheadDuck();
        Quackable duckCall = countingDuckFactory.createDuckCall();
        Quackable rubberDuck = countingDuckFactory.createRubberDuck();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfPoliteDucks = new Flock();

        Quackable mallardDuck2 = countingPoliteDuckFactory.createMallardDuck();
        Quackable redheadDuck2 = countingPoliteDuckFactory.createRedheadDuck();
        Quackable duckCall2 = countingPoliteDuckFactory.createDuckCall();
        Quackable rubberDuck2 = countingPoliteDuckFactory.createRubberDuck();

        flockOfPoliteDucks.add(mallardDuck2);
        flockOfPoliteDucks.add(redheadDuck2);
        flockOfPoliteDucks.add(duckCall2);
        flockOfPoliteDucks.add(rubberDuck2);

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Quackable gooseDuck2 = new PoliteDuck(new GooseAdapter(new Goose()));
        Quackable pigeon2 = new PoliteDuck(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuckSimulator starting...");

        simulate(flockOfDucks);
        System.out.println();

        simulate(flockOfPoliteDucks);
        System.out.println();

        simulate(gooseDuck);
        simulate(pigeon);
        System.out.println();

        simulate(gooseDuck2);
        simulate(pigeon2);


        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times:");
        System.out.println("The polite duck quacked " + PoliteDuck.getCount() + " times:");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }

}
