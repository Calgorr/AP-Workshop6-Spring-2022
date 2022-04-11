
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Eagle("Eagle", 12, 100, "sharp-eyed");
        Animal a2 = new Cheetah("Cheetah", 15, 75, "the fastest");
        Animal a3 = new Giraffe("Giraffe", 30, 15, "the tallest");
        Animal a4 = new Parrot("Parrot", 10, 45, "the smartest");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        for (Animal animal : animals) {
            animal.show();
        }
        Eagle eagle = (Eagle) a1;
        eagle.hunt((Prey) a4);
        Cheetah cheetah = (Cheetah) a2;
        cheetah.hunt((Prey) a3);

    }
}
