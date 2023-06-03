public class ObjectSample {
    public static void main(String[] args) {
        Car standardCar = new Car();
        System.out.println("Millage: " + standardCar.getMillage() + "\n" +"Standard Price: "
                + standardCar.getPrice() + "\n" + "Standard Doors: " + standardCar.getDoors());

        Car inflat_standardCar = new Car(100000);
        inflat_standardCar.setDoors(11);
        System.out.println(inflat_standardCar.getMillage());
        System.out.println("Millage: " + inflat_standardCar.getMillage() + "\n" + "Standard Price: "
                + inflat_standardCar.getPrice() + "\n"
                + "inflat_standardCar Doors: " + inflat_standardCar.getDoors());

        Car benez = new Car(10.50,30000,4); //Create the class variable
        /*benez.millage = 10.50;
        benez.price = 30000;
        benez.doors = 4;*/
        System.out.println("Millage: " + benez.getMillage() + "\n" + "Benez Price: " + benez.getPrice()
                + "\n" + "Benez Doors: " + benez.getDoors());

        standardCar.carStart();
        standardCar.carShutOff();

        DirtCar d1 = new DirtCar(6,10000,2,45);
        //d1.setMillage(6);
        //d1.setPrice(10000);
        //d1.setDoors(2);
        //d1.setTopSpeed(45);
        System.out.println("Dirt Car's Millage is " + d1.getMillage());
        System.out.println("Dirt Car's Price is " + d1.getPrice());
        System.out.println("Dirt Car's Door is " + d1.getDoors());
        System.out.println("Dirt Car's Top Speed is " + d1.getTopSpeed());
        System.out.println(d1.startDirtCar());
    }
}
