public class DirtCar111 extends Car111{
    private int dirt_topSpeed;
    public void setDirt_topSpeed(int dirt_topSpeed) {this.dirt_topSpeed = dirt_topSpeed;}
    public int getDirt_topSpeed(){return this.dirt_topSpeed;}

    public DirtCar111(double millage, int price, int doors, int dirt_topSpeed) {
        super(millage,price,doors);
        this.dirt_topSpeed = dirt_topSpeed;
    }
    public void dirtCar_EngineOn() {
         super.engineOn();
    }
}
