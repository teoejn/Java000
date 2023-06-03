public class DirtCar extends Car{

    private int topSpeed;
    public DirtCar(double millage, int price, int doors, int topSpeed){
        super(millage,price,doors);
        this.topSpeed = topSpeed;
    }
    public int getTopSpeed() {
        return this.topSpeed;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }

    public String startDirtCar() {
        return super.carStart_();
    }
}
