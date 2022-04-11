
abstract public class Animal {
    private String name;
    private int age;

    protected void show() {
        System.out.print("Name : " + name + ",age : " + age + ", ");
    }

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}
