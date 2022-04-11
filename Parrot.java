
public class Parrot extends Bird implements Prey {
    private String specificFeature;

    public Parrot(String name, int age, int flightAltitude, String specificFeature) {
        super(name, age, flightAltitude);
        this.specificFeature = specificFeature;
    }

    public void show() {
        super.show();
        System.out.println("\"" + specificFeature + "\"");
    }
}
