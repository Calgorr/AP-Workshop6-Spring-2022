
public class Cheetah extends Mammal implements Hunter {
    private String specificFeature;

    public Cheetah(String name, int age, int speed, String specificFeature) {
        super(name, age, speed);
        this.specificFeature = specificFeature;
    }

    public void show() {
        super.show();
        System.out.println("\"" + specificFeature + "\"");
    }

    public void hunt(Prey prey) {
        System.out.println("Cheetah hunted " + prey.getName());
    }
}
