
abstract public class Bird extends Animal {
    private int flightAltitude;

    protected void show() {
        super.show();
        System.out.print("Flight altitude : " + flightAltitude + ", ");
    }

    protected Bird(String name, int age, int flightAltitude) {
        super(name, age);
        this.flightAltitude = flightAltitude;
    }

    protected int getFlightAltitude() {
        return flightAltitude;
    }

    protected void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }
}
