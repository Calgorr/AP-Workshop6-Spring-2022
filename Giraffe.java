
public class Giraffe extends Mammal implements Prey {
    private String specificFeature;

    public Giraffe(String name, int age, int speed, String specificFeature) {
        super(name, age, speed);
        this.specificFeature = specificFeature;
    }

    public void show() {
        super.show();
        System.out.println("\"" + specificFeature + "\"");
    }

    public String getName() {
        return super.getName();
    }
}
