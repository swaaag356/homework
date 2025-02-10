public class Entity {
    protected String name;
    protected int age;
    protected int healthPoints;
    protected int armor;

    public Entity() {
        healthPoints = 10;
        armor = 10;
    }

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
        healthPoints = 10;
        armor = 10;
    }


    public void printInfo() {
        System.out.println(name + " | " + "age = " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}