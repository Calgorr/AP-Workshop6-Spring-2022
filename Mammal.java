
abstract public class Mammal extends Animal {
    private int speed;

    public void show() {
        super.show();
        System.out.println("speed : " + speed + ", ");
    }

    protected Mammal(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    protected int getSpeed() {
        return speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }
}
