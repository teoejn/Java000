public class ObjectSample {
    public static void main(String[] args) {
        Car benez = new Car();
        benez.millage = 10.50;
        benez.price = 30000;
        benez.doors = 4;
        System.out.println("Benez Price: " + benez.price + "\n" + "Benez Doors: " + benez.doors);
    }
}
