public class Car111 {
    private double millage;
    private int price;
    private int doors;

    public Car111(){
        this.millage = 9.50;
        this.price = 90000;
        this.doors = 2;
    }
    public Car111(double millage, int price, int doors) {
        this.millage = millage;
        this.price = price;
        this.doors = doors;
    }

    public void setMillage(double millage){ this.millage = millage; }
    public void setPrice(int price){
        this.price = price;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public double getMillage(){
        return this.millage;
    }
    public int getPrice(){
        return this.price;
    }
    public int getDoors(){
        return this.doors;
    }

    public void engineOn() {
        System.out.println("Car Started");
    }
    public void engineOff() {
        System.out.println("Car Stopped");
    }
}
