public class Main111 {
    public static void main(String[] args){
        Car111 benz = new Car111(10.54, 50000, 4);
        benz.setPrice(40000);
        System.out.println("Benz Doors: " + benz.getDoors());
        System.out.println("Benz Millage: " + benz.getMillage());
        System.out.println("Benz Price: " + benz.getPrice());

        Car111 new_benz = new Car111();
        System.out.println("Benz Doors: " + new_benz.getDoors());
        System.out.println("Benz Millage: " + new_benz.getMillage());
        System.out.println("Benz Price: " + new_benz.getPrice());

        DirtCar111 dirty_benz = new DirtCar111(10.10,111111,2,200);
        dirty_benz.setDirt_topSpeed(70);
        System.out.println(dirty_benz.getDirt_topSpeed());
        dirty_benz.dirtCar_EngineOn();
    }
}
