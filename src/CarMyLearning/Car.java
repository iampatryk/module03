package CarMyLearning;

public class Car implements Comparable<Car> {

    String mark;
    String model;
    int engineKilometers;

    public Car(String mark, String model, int engineKilometers) {
        this.mark = mark;
        this.model = model;
        this.engineKilometers = engineKilometers;
    }

    public int getEngineKilometers() {

        return engineKilometers;
    }

    //    @Override
//    public int compareTo(Car o) {
//        return this.engine - o.engine;
//    }

    @Override
    public int compareTo(Car o) {

        return Integer.compare(this.engineKilometers, o.getEngineKilometers());
    }
}
