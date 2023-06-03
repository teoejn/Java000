public class Car {
    //millage, price, doors
    private double millage;
    private int price;
    private int doors;

    /* Default methods - Constructors */
    public Car() {
        this.millage = 5.23;
        this.price = 50000;
        this.doors = 5;

        //this(5.23,50000,5);
    }
    public Car(int price){
        this.price = price;
    }
    /* Special/Custom Methods - Constructors - Create Objects - Implicit Call */
    public Car(double millage, int prices, int doors){
        this.millage = millage;
        this.price = prices;
        this.doors = doors;
    }

    /*Setter*/
    public void setMillage(double millage){
        this.millage = millage;
    }
    /*Getter*/
    public double getMillage() {
        return this.millage;
    }
    /*Setter*/
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getDoors(){
        return this.doors;
    }



    /* Instance Methods*/
    public void carStart(){
        System.out.println("Car Started");
    }
    public void carShutOff(){
        System.out.println("Car Engine Off");
    }
    public String carStart_() {
        return "Car Started";
    }
}
