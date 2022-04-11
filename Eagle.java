
public class Eagle extends Bird implements Hunter {
    private final String specificFeature;

    public Eagle(String name, int age, int flightAltitude, String specificFeature) {
        super(name, age, flightAltitude);
        this.specificFeature = specificFeature;
    }

    public void show() {
        super.show();
        System.out.println("\"" + specificFeature + "\"");
    }

    public void hunt(Prey prey) {
        System.out.println("Eagle hunted " + prey.getName());
    }


}
