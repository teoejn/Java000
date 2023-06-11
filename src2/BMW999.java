public class BMW999 extends Car999 {
    private int doors;
    private double price;

    public BMW999(double price, int doors){
        this.price = price;
        this.doors = doors;

    }
    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getDoors(){
        return this.doors;
    }
    public double getPrice(){
        return this.price;
    }
}
