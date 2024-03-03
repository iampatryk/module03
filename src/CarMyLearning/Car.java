package CarMyLearning;

public class Car implements Comparable<Car> {

    String mark;
    String model;
    int engine;

    public Car(String mark, String model, int engine) {
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }

    public int getEngine() {
        return engine;
    }

    //    @Override
//    public int compareTo(Car o) {
//        return this.engine - o.engine;
//    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.engine, o.getEngine());
    }
}
