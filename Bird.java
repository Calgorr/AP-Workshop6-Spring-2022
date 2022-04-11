
abstract public class Bird extends Animal {
    private int flightAltitude;

    public void show() {
        super.show();
        System.out.println("Flight altitude : " + flightAltitude + ", ");
    }

    protected Bird(String name, int age, int flightAltitude) {
        super(name,age);
    }

    protected int getFlightAltitude() {
        return flightAltitude;
    }

    protected void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }
}
